package com.acme.checkout.pricing;

public class PricingService {
    public int applyCoupon(int subtotalCents, String couponCode) {
        if (couponCode != null && couponCode.startsWith("ENT-")) {
            return subtotalCents - 1000;
        }
        return subtotalCents;
    }
}
