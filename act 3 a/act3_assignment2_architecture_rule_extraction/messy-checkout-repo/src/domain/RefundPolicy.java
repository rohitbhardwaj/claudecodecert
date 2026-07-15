package com.acme.checkout.domain;

public class RefundPolicy {
    public int calculateRefund(int subtotalCents) {
        // This should be the single source of truth.
        if (subtotalCents > 1000) {
            return 1000;
        }
        return subtotalCents;
    }
}
