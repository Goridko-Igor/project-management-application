package ru.goridko_igor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goridko_igor.entity.UserInformationEntity;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformationEntity, Long> {

}
