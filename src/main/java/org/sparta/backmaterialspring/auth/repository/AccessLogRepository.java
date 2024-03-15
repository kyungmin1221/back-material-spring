package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.AccessLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLogEntity, Long> {
}
