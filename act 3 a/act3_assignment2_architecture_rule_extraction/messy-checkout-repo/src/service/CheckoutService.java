package com.acme.checkout.service;

import com.acme.checkout.data.OrderRepository;

public class CheckoutService {
    private final OrderRepository orderRepository = new OrderRepository();

    public String checkout(String orderId) {
        // MESSY PATTERN: service directly creates data repository instead of using dependency abstraction.
        if (orderRepository.exists(orderId)) {
            return "CHECKOUT_SUCCESS";
        }
        return "ORDER_NOT_FOUND";
    }
}
