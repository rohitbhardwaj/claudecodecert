package com.acme.checkout.service;

import com.acme.checkout.domain.OrderCancellationPolicy;
import com.acme.checkout.domain.RefundPolicy;

public class CancellationService {
    private final OrderCancellationPolicy cancellationPolicy;
    private final RefundPolicy refundPolicy;

    public CancellationService(OrderCancellationPolicy cancellationPolicy, RefundPolicy refundPolicy) {
        this.cancellationPolicy = cancellationPolicy;
        this.refundPolicy = refundPolicy;
    }

    public String cancel(String orderId, String channel) {
        if (!cancellationPolicy.canCancel(orderId)) {
            return "CANCEL_NOT_ALLOWED";
        }

        int refundCents = refundPolicy.calculateRefund(orderId);
        return "CANCELLED_REFUND_" + refundCents;
    }
}
