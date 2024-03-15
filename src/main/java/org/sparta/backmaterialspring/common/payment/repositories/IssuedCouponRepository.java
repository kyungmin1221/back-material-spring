package org.sparta.backmaterialspring.common.payment.repositories;

import org.sparta.backmaterialspring.common.payment.entities.IssuedCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedCouponRepository extends JpaRepository<IssuedCoupon, Long> {
}
