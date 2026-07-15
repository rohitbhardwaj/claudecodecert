package com.acme.refund.domain;

public class RefundPolicy {
    public int calculateFullRefund(int chargedAmountCents) {
        return chargedAmountCents;
    }

    public int calculatePartialRefund(int chargedAmountCents, int consumedValueCents) {
        return Math.max(0, chargedAmountCents - consumedValueCents);
    }
}
