# Context Map Answer Key

## Must-Include Files

```text
CLAUDE.md
CODEOWNERS
src/controller/WebCheckoutController.java
src/controller/MobileCheckoutController.java
src/batch/InvoiceCheckoutJob.java
src/service/CheckoutService.java
src/domain/CouponPolicy.java
src/domain/EnterpriseCustomerPolicy.java
src/pricing/PricingService.java
src/logging/CheckoutLogger.java
src/config/FeatureFlags.java
api/checkout-api.yaml
src/tests/WebCheckoutControllerTest.java
src/tests/MobileCheckoutTest.java
src/tests/InvoiceCheckoutJobTest.java
src/tests/CouponPolicyTest.java
src/tests/EnterpriseCustomerPolicyTest.java
src/tests/PricingServiceTest.java
docs/security/logging-policy.md
docs/runbooks/rollback.md
docs/architecture/boundaries.md
```

## Why These Files Matter

```text
Entry points show every path into checkout.
Domain policies show shared business rules.
Pricing shows money impact.
API shows contract impact.
Tests preserve behavior.
Logging policy prevents unsafe observability.
Rollback enables production safety.
CODEOWNERS identifies approval owners.
CLAUDE.md tells Claude repo rules.
```
