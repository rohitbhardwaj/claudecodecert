package com.acme.checkout.service;

public class CheckoutService {
    private final CancellationService cancellationService;

    public CheckoutService(CancellationService cancellationService) {
        this.cancellationService = cancellationService;
    }

    public String checkout(String orderId) {
        return "CHECKOUT_OK";
    }

    public String cancel(String orderId) {
        return cancellationService.cancel(orderId, "WEB_OR_MOBILE");
    }
}
