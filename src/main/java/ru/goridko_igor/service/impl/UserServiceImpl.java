package ru.goridko_igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goridko_igor.dto.UserRequestDto;
import ru.goridko_igor.dto.UserResponseDto;
import ru.goridko_igor.entity.UserEntity;
import ru.goridko_igor.exception.UserNotFoundException;
import ru.goridko_igor.mapper.UserMapper;
import ru.goridko_igor.repository.UserRepository;
import ru.goridko_igor.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserResponseDto> getUsers() {
        return userMapper.mapToUserResponseDtoList(userRepository.findAll());
    }

    @Override
    public UserResponseDto getUser(Long id) {
        return userMapper.mapToUserResponseDto(userRepository
                .findById(id)
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("Пользователь с ID = %1$d не найден!", id)
                )));
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        UserEntity newUserEntity = userMapper.mapToUserEntity(userRequestDto);
        newUserEntity.setSalt("Salt of user " + newUserEntity.getName());
        newUserEntity.setHashCode(newUserEntity.getPassword() + " + " + newUserEntity.getSalt());
        userRepository.save(newUserEntity);
        return userMapper.mapToUserResponseDto(newUserEntity);
    }

    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto userRequestDto) {
        UserEntity userEntityForUpdating = userRepository
                .findById(id)
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("Пользователь с ID = %1$d не найден и не обновлён!", id)
                ));
        UserEntity userEntityWithNewValues = userMapper.mapToUserEntity(userRequestDto);
        userEntityForUpdating.setName(userEntityWithNewValues.getName());
        userEntityForUpdating.setPassword(userEntityWithNewValues.getPassword());
        userEntityForUpdating.setHashCode(
                userEntityForUpdating.getPassword() + " + " + userEntityForUpdating.getSalt());
        userRepository.save(userEntityForUpdating);
        return userMapper.mapToUserResponseDto(userEntityForUpdating);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(userRepository
                .findById(id)
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("Пользователь с ID = %1$d не найден и не удалён!", id)
                )));
    }
}
