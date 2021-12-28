package ru.goridko_igor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goridko_igor.entity.ProjectParticipantEntity;
import ru.goridko_igor.entity.ProjectParticipantEntityKey;

@Repository
public interface ProjectParticipantRepository
        extends JpaRepository<ProjectParticipantEntity, ProjectParticipantEntityKey> {

}
