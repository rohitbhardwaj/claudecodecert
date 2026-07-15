package com.acme.checkout.after;

public class EnterpriseCustomerPolicy {
    public boolean canUseEnterpriseDiscount(Customer customer) {
        // AI-generated simplification:
        // BUG: this is no longer equivalent to the original rule.
        // It rejects some valid customers when signed agreement is true because of the negation.
        // It also ignores suspended status.
        return customer != null
                && customer.isEnterprise()
                && customer.isActive()
                && !customer.hasSignedEnterpriseAgreement();
    }
}

class Customer {
    private final boolean enterprise;
    private final boolean active;
    private final boolean signedEnterpriseAgreement;
    private final boolean suspended;

    Customer(boolean enterprise, boolean active, boolean signedEnterpriseAgreement, boolean suspended) {
        this.enterprise = enterprise;
        this.active = active;
        this.signedEnterpriseAgreement = signedEnterpriseAgreement;
        this.suspended = suspended;
    }

    boolean isEnterprise() {
        return enterprise;
    }

    boolean isActive() {
        return active;
    }

    boolean hasSignedEnterpriseAgreement() {
        return signedEnterpriseAgreement;
    }

    boolean isSuspended() {
        return suspended;
    }
}
