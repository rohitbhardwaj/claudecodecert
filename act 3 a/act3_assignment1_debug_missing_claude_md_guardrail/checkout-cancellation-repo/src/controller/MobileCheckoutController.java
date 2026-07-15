package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

public class MobileCheckoutController {
    private final CheckoutService checkoutService;

    public MobileCheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public String mobileCancel(String orderId) {
        return checkoutService.cancel(orderId);
    }
}
