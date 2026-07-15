package com.acme.checkout.controller;

public class CheckoutController {

    public String applyCouponAndRefund(String couponCode, String customerEmail, int subtotalCents) {
        // MESSY PATTERN: business logic in controller.
        if (couponCode != null && couponCode.startsWith("VIP")) {
            subtotalCents = subtotalCents - 500;
        }

        // MESSY PATTERN: refund calculation duplicated in controller.
        int refundCents = subtotalCents > 1000 ? 1000 : subtotalCents;

        // MESSY PATTERN: inconsistent reason code string.
        return "OK_REFUND_" + refundCents;
    }
}
