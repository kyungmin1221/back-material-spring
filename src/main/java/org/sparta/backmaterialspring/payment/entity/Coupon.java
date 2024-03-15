package org.sparta.backmaterialspring.payment.entity;

import jakarta.persistence.*;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

import java.util.List;

@Entity
public class Coupon extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String type;

    @Column
    private Double value; // 할인율 또는 정액 금액

    @OneToMany(mappedBy = "coupon")
    private List<IssuedCoupon> issuedCoupons;
}
