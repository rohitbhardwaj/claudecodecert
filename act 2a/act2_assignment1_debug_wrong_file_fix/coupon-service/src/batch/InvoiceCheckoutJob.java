package com.acme.coupon.batch;

import com.acme.coupon.service.CheckoutService;
import java.time.LocalDate;

public class InvoiceCheckoutJob {
    private final CheckoutService checkoutService;

    public InvoiceCheckoutJob(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public boolean processInvoiceWithCoupon(Object coupon, LocalDate today) {
        return checkoutService.checkoutWithCoupon(coupon, today);
    }
}
