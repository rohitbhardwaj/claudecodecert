package com.acme.checkout.service;

import com.acme.checkout.pricing.PricingService;

public class CheckoutService {
    private final PricingService pricingService;

    public CheckoutService(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    public int checkout(String customerId, String[] coupons, int subtotalCents, String channel) {
        return pricingService.applyCoupons(subtotalCents, coupons);
    }
}
