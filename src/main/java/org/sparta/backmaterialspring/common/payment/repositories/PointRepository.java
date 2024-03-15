package org.sparta.backmaterialspring.common.payment.repositories;

import org.sparta.backmaterialspring.common.payment.entities.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<Point, Long> {
}
