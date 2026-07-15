package com.acme.checkout.after;

import java.time.LocalDate;

public class CheckoutService {
    private final CouponPolicy couponPolicy = new CouponPolicy();
    private final EnterpriseCustomerPolicy enterpriseCustomerPolicy = new EnterpriseCustomerPolicy();
    private final PaymentResultMapper paymentResultMapper = new PaymentResultMapper();

    public CheckoutResponse checkout(Customer customer, Coupon coupon, PaymentResult paymentResult, LocalDate today) {
        if (!couponPolicy.isValid(coupon, today)
                || !enterpriseCustomerPolicy.canUseEnterpriseDiscount(customer)) {
            logFailure();
            return CheckoutResponse.failed("CHECKOUT_FAILED");
        }

        CheckoutError error = paymentResultMapper.map(paymentResult);
        if (error != CheckoutError.NONE) {
            logFailure();
            return CheckoutResponse.failed(error.name());
        }

        return CheckoutResponse.success();
    }

    private void logFailure() {
        // AI-generated simplification:
        // BUG: original reason code removed, so support cannot trace specific failures.
        System.out.println("checkout_failed");
    }
}

class CheckoutResponse {
    private final boolean success;
    private final String errorCode;

    private CheckoutResponse(boolean success, String errorCode) {
        this.success = success;
        this.errorCode = errorCode;
    }

    static CheckoutResponse success() {
        return new CheckoutResponse(true, null);
    }

    static CheckoutResponse failed(String errorCode) {
        return new CheckoutResponse(false, errorCode);
    }

    boolean isSuccess() {
        return success;
    }

    String getErrorCode() {
        return errorCode;
    }
}
