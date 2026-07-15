package com.acme.checkout.pricing;

public class PricingService {
    public int applyCoupons(int subtotalCents, String[] coupons) {
        if (coupons == null || coupons.length == 0) {
            return subtotalCents;
        }

        // Existing behavior: only first coupon applies.
        return subtotalCents - 500;
    }
}
