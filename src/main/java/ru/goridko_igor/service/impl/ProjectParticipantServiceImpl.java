package ru.goridko_igor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.goridko_igor.repository.ProjectParticipantRepository;
import ru.goridko_igor.service.ProjectParticipantService;

@Service
public class ProjectParticipantServiceImpl implements ProjectParticipantService {
    private final ProjectParticipantRepository projectParticipantRepository;

    @Autowired
    public ProjectParticipantServiceImpl(ProjectParticipantRepository projectParticipantRepository) {
        this.projectParticipantRepository = projectParticipantRepository;
    }
}
