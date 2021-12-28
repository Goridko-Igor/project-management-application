package ru.goridko_igor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goridko_igor.entity.ReleaseVersionEntity;

@Repository
public interface ReleaseVersionRepository extends JpaRepository<ReleaseVersionEntity, Long> {

}
