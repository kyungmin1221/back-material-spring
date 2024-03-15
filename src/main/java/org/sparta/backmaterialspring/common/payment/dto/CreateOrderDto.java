package org.sparta.backmaterialspring.common.payment.dto;

import lombok.Getter;
import lombok.Setter;
import org.sparta.backmaterialspring.common.payment.entities.OrderItem;

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
