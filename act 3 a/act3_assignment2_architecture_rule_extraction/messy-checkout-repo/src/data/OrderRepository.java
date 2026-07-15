package com.acme.checkout.data;

public class OrderRepository {
    public boolean exists(String orderId) {
        return orderId != null && !orderId.isBlank();
    }
}
