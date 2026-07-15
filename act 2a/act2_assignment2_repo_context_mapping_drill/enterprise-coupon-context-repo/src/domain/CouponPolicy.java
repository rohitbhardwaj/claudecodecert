package com.acme.checkout.domain;

public class CouponPolicy {
    public boolean isKnownCoupon(String couponCode) {
        return couponCode != null && !couponCode.isBlank();
    }

    public boolean isEnterpriseOnly(String couponCode) {
        return couponCode != null && couponCode.startsWith("ENT-");
    }
}
