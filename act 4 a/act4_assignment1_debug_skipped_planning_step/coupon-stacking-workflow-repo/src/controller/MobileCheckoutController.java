package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

public class MobileCheckoutController {
    private final CheckoutService checkoutService;

    public MobileCheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public int checkout(String customerId, String[] coupons, int subtotalCents) {
        return checkoutService.checkout(customerId, coupons, subtotalCents, "MOBILE");
    }
}
