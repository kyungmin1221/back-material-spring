package org.sparta.backmaterialspring.payment.service;

import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.sparta.backmaterialspring.payment.entity.Order;
import org.sparta.backmaterialspring.payment.entity.OrderItem;
import org.sparta.backmaterialspring.payment.entity.ShippingInfo;

import java.util.List;

public interface OrderService {
    /**
     * 주문을 생성한다
     * @param user user entity
     * @param orderItems order item entity
     * @param finalAmount all price of order item
     * @param shippingInfo shippingInfo entity
     * @return created order
     */
    public Order createOrder(UserEntity user, List<OrderItem> orderItems, int finalAmount, ShippingInfo shippingInfo);

    /**
     * 주문을 완료 상태로 저장한다
     * @param orderId order entity pk
     * @return state changed order
     */
    public Order completeOrder(Long orderId);
}
