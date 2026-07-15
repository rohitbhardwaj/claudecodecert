package com.acme.checkout;

import java.time.LocalDate;

public class CheckoutService {
    private final CouponPolicy couponPolicy;
    private final EnterpriseCustomerPolicy enterpriseCustomerPolicy;
    private final PaymentResultMapper paymentResultMapper;

    public CheckoutService(CouponPolicy couponPolicy,
                           EnterpriseCustomerPolicy enterpriseCustomerPolicy,
                           PaymentResultMapper paymentResultMapper) {
        this.couponPolicy = couponPolicy;
        this.enterpriseCustomerPolicy = enterpriseCustomerPolicy;
        this.paymentResultMapper = paymentResultMapper;
    }

    public CheckoutResponse checkout(Customer customer, Coupon coupon, PaymentResult paymentResult, LocalDate today) {
        if (!couponPolicy.isValid(coupon, today)) {
            logFailure("INVALID_COUPON");
            return CheckoutResponse.failed("INVALID_COUPON");
        }

        if (!enterpriseCustomerPolicy.canUseEnterpriseDiscount(customer)) {
            logFailure("ENTERPRISE_NOT_ELIGIBLE");
            return CheckoutResponse.failed("ENTERPRISE_NOT_ELIGIBLE");
        }

        CheckoutError error = paymentResultMapper.map(paymentResult);
        if (error != CheckoutError.NONE) {
            logFailure(error.name());
            return CheckoutResponse.failed(error.name());
        }

        return CheckoutResponse.success();
    }

    private void logFailure(String reasonCode) {
        System.out.println("checkout_failed reasonCode=" + reasonCode);
    }
}
