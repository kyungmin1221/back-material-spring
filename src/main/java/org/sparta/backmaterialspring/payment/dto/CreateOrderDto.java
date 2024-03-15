package org.sparta.backmaterialspring.payment.dto;

import lombok.Getter;
import lombok.Setter;
import org.sparta.backmaterialspring.payment.entity.OrderItem;

import java.util.List;

@Getter
@Setter
public class CreateOrderDto {
    private String userId;
    private List<OrderItem> orderItems;
    private String couponId;
    private int pointAmountToUse;
    private String shippingAddress;
}
