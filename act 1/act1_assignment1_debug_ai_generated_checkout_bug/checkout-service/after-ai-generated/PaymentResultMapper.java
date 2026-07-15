package com.acme.checkout.after;

public class PaymentResultMapper {
    public CheckoutError map(PaymentResult result) {
        if (result == PaymentResult.APPROVED) {
            return CheckoutError.NONE;
        }

        // AI-generated simplification:
        // BUG: specific payment decline and timeout codes collapsed into generic checkout failure.
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
