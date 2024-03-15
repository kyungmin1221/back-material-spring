package org.sparta.backmaterialspring.payment.repositories;

import org.sparta.backmaterialspring.payment.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
