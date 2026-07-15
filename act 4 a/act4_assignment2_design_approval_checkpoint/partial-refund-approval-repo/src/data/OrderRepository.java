package com.acme.refund.data;

public class OrderRepository {
    public String findPaymentId(String orderId) {
        return "pay_123";
    }

    public int findChargedAmountCents(String orderId) {
        return 10000;
    }

    public void saveRefundState(String orderId, String status, int amountCents) {
        // persist audit state
    }
}
