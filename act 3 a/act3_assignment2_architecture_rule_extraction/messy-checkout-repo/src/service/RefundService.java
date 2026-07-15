package com.acme.checkout.service;

public class RefundService {

    public int refund(String orderId, int subtotalCents) {
        // MESSY PATTERN: refund behavior duplicated in service.
        if (subtotalCents > 1000) {
            return 1000;
        }
        return subtotalCents;
    }
}
