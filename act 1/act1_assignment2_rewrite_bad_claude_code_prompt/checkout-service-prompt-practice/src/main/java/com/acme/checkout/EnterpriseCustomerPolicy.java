package com.acme.checkout;

public class EnterpriseCustomerPolicy {
    public boolean canUseEnterpriseDiscount(Customer customer) {
        return customer != null
                && customer.isEnterprise()
                && customer.isActive()
                && customer.hasSignedEnterpriseAgreement()
                && !customer.isSuspended();
    }
}

class Customer {
    boolean isEnterprise() { return true; }
    boolean isActive() { return true; }
    boolean hasSignedEnterpriseAgreement() { return true; }
    boolean isSuspended() { return false; }
}
