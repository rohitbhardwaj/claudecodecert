package com.acme.checkout.after;

import java.time.LocalDate;

public class CouponPolicy {
    public boolean isValid(Coupon coupon, LocalDate today) {
        // AI-generated simplification:
        // If the coupon exists, is active, and has uses left, accept it.
        // BUG: expiration date is no longer checked.
        return coupon != null
                && coupon.isActive()
                && coupon.getRemainingUses() > 0;
    }
}

class Coupon {
    private final boolean active;
    private final LocalDate expiresOn;
    private final int remainingUses;

    Coupon(boolean active, LocalDate expiresOn, int remainingUses) {
        this.active = active;
        this.expiresOn = expiresOn;
        this.remainingUses = remainingUses;
    }

    boolean isActive() {
        return active;
    }

    LocalDate getExpiresOn() {
        return expiresOn;
    }

    int getRemainingUses() {
        return remainingUses;
    }
}
