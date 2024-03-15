package org.sparta.backmaterialspring.payment.service.impl;

import lombok.RequiredArgsConstructor;
import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.sparta.backmaterialspring.payment.entity.Order;
import org.sparta.backmaterialspring.payment.entity.OrderItem;
import org.sparta.backmaterialspring.payment.entity.ShippingInfo;
import org.sparta.backmaterialspring.payment.repository.OrderRepository;
import org.sparta.backmaterialspring.payment.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(UserEntity user, List<OrderItem> orderItems, int finalAmount, ShippingInfo shippingInfo) {
        return null;
    }

    @Override
    public Order completeOrder(Long orderId) {
        return null;
    }
}
