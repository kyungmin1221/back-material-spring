package org.sparta.backmaterialspring.payment.entities;

import jakarta.persistence.*;
import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(length = 255)
    private String orderNo;

    @Column
    private BigDecimal amount;

    @Column(length = 100)
    private String status;

    @OneToMany(mappedBy = "order")
    @Column
    private List<OrderItem> items;

    @Column(columnDefinition = "int default 0")
    private int pointAmountUsed;

    @OneToOne(mappedBy = "usedOrder")
    private IssuedCoupon usedIssuedCoupon;

    @OneToOne(mappedBy = "order")
    private ShippingInfo shippingInfo;

    @Column(length = 1000)
    private String refundReason;

    @Column(precision = 10, scale = 2)
    private BigDecimal refundedAmount;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date refundedAt;

    @Column
    private Object pgMetadata; // PG사 메타데이터

    public Order() {
        super();
        setOrderNo();
    }

    private void setOrderNo() {
        Date date = new Date();
        String dateFormat = String.format("%d%02d%02d%02d%02d%02d",
                date.getYear() + 1900,
                date.getMonth() + 1,
                date.getDate(),
                date.getHours(),
                date.getMinutes(),
                date.getSeconds());
        String randomString = "";
        for (int i = 0; i < 15; i++) {
            randomString += (char)('A' + Math.random() * 26);
        }
        this.orderNo = dateFormat + "_" + randomString;
    }

}
