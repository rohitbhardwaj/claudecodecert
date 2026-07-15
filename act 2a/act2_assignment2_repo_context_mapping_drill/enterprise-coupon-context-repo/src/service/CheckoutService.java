package com.acme.checkout.service;

import com.acme.checkout.domain.CouponPolicy;
import com.acme.checkout.domain.EnterpriseCustomerPolicy;
import com.acme.checkout.pricing.PricingService;
import com.acme.checkout.logging.CheckoutLogger;

public class CheckoutService {
    private final CouponPolicy couponPolicy;
    private final EnterpriseCustomerPolicy enterpriseCustomerPolicy;
    private final PricingService pricingService;
    private final CheckoutLogger logger;

    public CheckoutService(CouponPolicy couponPolicy,
                           EnterpriseCustomerPolicy enterpriseCustomerPolicy,
                           PricingService pricingService,
                           CheckoutLogger logger) {
        this.couponPolicy = couponPolicy;
        this.enterpriseCustomerPolicy = enterpriseCustomerPolicy;
        this.pricingService = pricingService;
        this.logger = logger;
    }

    public String checkout(String customerId, String couponCode, String channel) {
        logger.logCheckoutAttempt(channel, "COUPON_CHECK_STARTED");

        if (!couponPolicy.isKnownCoupon(couponCode)) {
            return "INVALID_COUPON";
        }

        return "OK";
    }
}
