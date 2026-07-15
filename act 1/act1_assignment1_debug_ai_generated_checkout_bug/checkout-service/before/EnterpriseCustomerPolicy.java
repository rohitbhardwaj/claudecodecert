package com.acme.checkout.before;

public class EnterpriseCustomerPolicy {
    public boolean canUseEnterpriseDiscount(Customer customer) {
        if (customer == null) {
            return false;
        }

        return customer.isEnterprise()
                && customer.isActive()
                && customer.hasSignedEnterpriseAgreement()
                && !customer.isSuspended();
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
