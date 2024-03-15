package org.sparta.backmaterialspring.payment.repositories;

import org.sparta.backmaterialspring.payment.entities.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingInfoRepository extends JpaRepository<ShippingInfo, Long> {
}
