package com.acme.checkout.logging;

public class CheckoutLogger {
    public void logFailure(String customerEmail, String paymentReference, String reason) {
        // MESSY PATTERN: PII-like and sensitive values in logs.
        System.out.println("checkout_failed email=" + customerEmail
                + " paymentReference=" + paymentReference
                + " reason=" + reason);
    }
}
