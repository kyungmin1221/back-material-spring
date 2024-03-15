package org.sparta.backmaterialspring.common.payment.repositories;

import org.sparta.backmaterialspring.common.payment.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
