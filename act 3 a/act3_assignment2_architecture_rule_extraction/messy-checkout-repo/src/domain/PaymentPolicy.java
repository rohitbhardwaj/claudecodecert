package com.acme.checkout.domain;

public class PaymentPolicy {
    public boolean canCapturePayment(String paymentStatus) {
        return "AUTHORIZED".equals(paymentStatus);
    }
}
