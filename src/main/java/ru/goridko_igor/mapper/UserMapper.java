package ru.goridko_igor.mapper;

import org.mapstruct.Mapper;
import ru.goridko_igor.dto.UserInformationResponseDto;
import ru.goridko_igor.dto.UserRequestDto;
import ru.goridko_igor.dto.UserResponseDto;
import ru.goridko_igor.entity.UserEntity;
import ru.goridko_igor.entity.UserInformationEntity;

import java.util.List;

@Mapper
public interface UserMapper {
    UserEntity mapToUserEntity(UserRequestDto userRequestDto);

    UserResponseDto mapToUserResponseDto(UserEntity userEntity);

    List<UserResponseDto> mapToUserResponseDtoList(List<UserEntity> userEntityList);

    UserInformationResponseDto mapToUserInformationResponseDto(UserInformationEntity userInformationEntity);
}
