package com.acme.checkout.logging;

public class CheckoutLogger {
    public void logCheckoutAttempt(String channel, String reasonCode) {
        System.out.println("checkout_event channel=" + channel + " reasonCode=" + reasonCode);
    }
}
