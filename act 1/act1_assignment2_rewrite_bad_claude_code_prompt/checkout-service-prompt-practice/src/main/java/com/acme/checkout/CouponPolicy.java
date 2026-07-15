package com.acme.checkout;

import java.time.LocalDate;

public class CouponPolicy {
    public boolean isValid(Coupon coupon, LocalDate today) {
        return coupon != null
                && coupon.isActive()
                && !coupon.getExpiresOn().isBefore(today)
                && coupon.getRemainingUses() > 0;
    }
}

class Coupon {
    boolean isActive() { return true; }
    java.time.LocalDate getExpiresOn() { return java.time.LocalDate.of(2026, 12, 31); }
    int getRemainingUses() { return 1; }
}
