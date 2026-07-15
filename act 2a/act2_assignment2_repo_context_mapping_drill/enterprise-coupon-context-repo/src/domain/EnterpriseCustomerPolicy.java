package com.acme.checkout.domain;

public class EnterpriseCustomerPolicy {
    public boolean isEnterpriseCustomer(String customerId) {
        return customerId != null && customerId.startsWith("ENT-CUST-");
    }

    public boolean canUseEnterpriseCoupon(String customerId, String couponCode) {
        return isEnterpriseCustomer(customerId) && couponCode != null && couponCode.startsWith("ENT-");
    }
}
