package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

public class CheckoutController {
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public int checkout(String customerId, String[] coupons, int subtotalCents) {
        return checkoutService.checkout(customerId, coupons, subtotalCents, "WEB");
    }
}
