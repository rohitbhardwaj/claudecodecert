package com.acme.coupon.controller;

import com.acme.coupon.service.CheckoutService;
import java.time.LocalDate;

public class WebCheckoutController {
    private final CheckoutService checkoutService;

    public WebCheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public boolean checkout(Object coupon, LocalDate today) {
        return checkoutService.checkoutWithCoupon(coupon, today);
    }
}
