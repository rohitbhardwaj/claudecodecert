package com.acme.checkout.controller;

import com.acme.checkout.service.CheckoutService;

public class WebCheckoutController {
    private final CheckoutService checkoutService;

    public WebCheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public String checkout(String customerId, String couponCode) {
        return checkoutService.checkout(customerId, couponCode, "WEB");
    }
}
