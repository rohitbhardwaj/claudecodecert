package com.acme.checkout.domain;

public class CouponPolicy {
    public boolean isValid(String coupon) {
        return coupon != null && !coupon.isBlank();
    }
}
