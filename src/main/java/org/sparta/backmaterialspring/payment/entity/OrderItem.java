package org.sparta.backmaterialspring.payment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

@Entity
@Getter
public class OrderItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column
    private String productId;

    @Column
    private int quantity;
}
