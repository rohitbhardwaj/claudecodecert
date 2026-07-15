package com.acme.refund.payment;

public class PaymentGatewayClient {
    public RefundResult refund(String paymentId, int amountCents) {
        return RefundResult.APPROVED;
    }

    public enum RefundResult {
        APPROVED,
        DECLINED,
        TIMEOUT,
        DUPLICATE_REQUEST
    }
}
