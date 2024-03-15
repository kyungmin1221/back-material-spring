package org.sparta.backmaterialspring.payment.repositories;

import org.sparta.backmaterialspring.payment.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
