package com.acme.checkout.batch;

import com.acme.checkout.service.CheckoutService;

public class InvoiceCheckoutJob {
    private final CheckoutService checkoutService;

    public InvoiceCheckoutJob(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public String processInvoice(String customerId, String couponCode) {
        return checkoutService.checkout(customerId, couponCode, "BATCH_INVOICE");
    }
}
