package org.sparta.backmaterialspring.common.payment.repositories;

import org.sparta.backmaterialspring.common.payment.entities.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingInfoRepository extends JpaRepository<ShippingInfo, Long> {
}
