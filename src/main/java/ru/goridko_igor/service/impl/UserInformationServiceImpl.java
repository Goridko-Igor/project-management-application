package ru.goridko_igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goridko_igor.repository.UserInformationRepository;
import ru.goridko_igor.service.UserInformationService;

@Service
public class UserInformationServiceImpl implements UserInformationService {
    private final UserInformationRepository userInformationRepository;

    @Autowired
    public UserInformationServiceImpl(UserInformationRepository userInformationRepository) {
        this.userInformationRepository = userInformationRepository;
    }
}
