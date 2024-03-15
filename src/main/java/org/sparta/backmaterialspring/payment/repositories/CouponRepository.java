package org.sparta.backmaterialspring.payment.repositories;

import org.sparta.backmaterialspring.payment.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
