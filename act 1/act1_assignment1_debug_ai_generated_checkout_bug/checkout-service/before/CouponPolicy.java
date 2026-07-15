package com.acme.checkout.before;

import java.time.LocalDate;

public class CouponPolicy {
    public boolean isValid(Coupon coupon, LocalDate today) {
        if (coupon == null) {
            return false;
        }

        if (!coupon.isActive()) {
            return false;
        }

        if (coupon.getExpiresOn().isBefore(today)) {
            return false;
        }

        return coupon.getRemainingUses() > 0;
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
