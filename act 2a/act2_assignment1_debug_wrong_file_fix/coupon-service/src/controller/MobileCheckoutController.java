package com.acme.coupon.controller;

import com.acme.coupon.service.CheckoutService;
import java.time.LocalDate;

public class MobileCheckoutController {
    private final CheckoutService checkoutService;

    public MobileCheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public boolean checkout(Object coupon, LocalDate today) {
        return checkoutService.checkoutWithCoupon(coupon, today);
    }
}
