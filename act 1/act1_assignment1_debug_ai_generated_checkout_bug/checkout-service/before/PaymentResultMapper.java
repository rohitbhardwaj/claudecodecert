package com.acme.checkout.before;

public class PaymentResultMapper {
    public CheckoutError map(PaymentResult result) {
        if (result == PaymentResult.APPROVED) {
            return CheckoutError.NONE;
        }

        if (result == PaymentResult.DECLINED) {
            return CheckoutError.PAYMENT_DECLINED;
        }

        if (result == PaymentResult.TIMEOUT) {
            return CheckoutError.PAYMENT_TIMEOUT;
        }

        return CheckoutError.CHECKOUT_FAILED;
    }
}

enum PaymentResult {
    APPROVED,
    DECLINED,
    TIMEOUT,
    UNKNOWN
}

enum CheckoutError {
    NONE,
    PAYMENT_DECLINED,
    PAYMENT_TIMEOUT,
    CHECKOUT_FAILED
}
