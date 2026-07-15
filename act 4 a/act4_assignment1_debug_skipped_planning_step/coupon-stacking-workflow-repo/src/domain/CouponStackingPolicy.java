package com.acme.checkout.domain;

public class CouponStackingPolicy {
    public boolean canStack(String firstCoupon, String secondCoupon) {
        // Existing conservative rule: no stacking until explicitly approved.
        return false;
    }
}
