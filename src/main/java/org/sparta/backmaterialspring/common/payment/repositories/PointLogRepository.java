package org.sparta.backmaterialspring.common.payment.repositories;

import org.sparta.backmaterialspring.common.payment.entities.PointLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointLogRepository extends JpaRepository<PointLog, Long> {
}
