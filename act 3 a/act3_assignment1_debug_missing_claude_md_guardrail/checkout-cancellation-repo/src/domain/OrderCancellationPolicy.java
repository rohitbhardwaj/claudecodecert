package com.acme.checkout.domain;

public class OrderCancellationPolicy {
    public boolean canCancel(String orderId) {
        // Simplified simulation.
        // Real policy would check order status, shipment, payment capture, and time window.
        return orderId != null && !orderId.startsWith("SHIPPED-");
    }
}
