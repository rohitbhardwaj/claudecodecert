package com.acme.coupon.service;

import com.acme.coupon.domain.CouponPolicy;
import java.time.LocalDate;

public class CheckoutService {
    private final CouponPolicy couponPolicy;

    public CheckoutService(CouponPolicy couponPolicy) {
        this.couponPolicy = couponPolicy;
    }

    public boolean checkoutWithCoupon(Object coupon, LocalDate today) {
        // Simplified simulation: delegates to shared policy.
        return couponPolicy.canApply((com.acme.coupon.domain.Coupon) coupon, today);
    }
}
