package org.sparta.backmaterialspring.common.payment.entities;

import jakarta.persistence.*;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

@Entity
public class PointLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "point_id")
    private Point point;

    @Column(columnDefinition = "int default 0")
    private int amount; // 개별 적립 또는 사용 금액

    @Column(length = 1000)
    private String reason; // 개별 적립 또는 사용 사유

    @Column(length = 50)
    private String type; // PointLogType를 String으로 대체

    public void use(int amount, String reason) {
        this.amount = amount;
        this.reason = reason;
        this.type = "spend";
    }

    public void add(int amount, String reason) {
        this.amount = amount;
        this.reason = reason;
        this.type = "earn";
    }
}
