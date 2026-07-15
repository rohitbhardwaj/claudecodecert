package com.acme.coupon.domain;

import java.time.LocalDate;

public class CouponPolicy {

    public boolean canApply(Coupon coupon, LocalDate today) {
        if (coupon == null) {
            return false;
        }

        // BUG: expiration is not checked.
        // Expected:
        // if (coupon.getExpiresOn().isBefore(today)) return false;

        return coupon.isActive() && coupon.getRemainingUses() > 0;
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
