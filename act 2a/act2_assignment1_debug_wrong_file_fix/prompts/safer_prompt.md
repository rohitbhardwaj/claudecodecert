# Safer Prompt

```text
Do not modify files yet.

Analyze why expired coupons are accepted during checkout.

Inspect:
- CLAUDE.md
- WebCheckoutController.java
- MobileCheckoutController.java
- InvoiceCheckoutJob.java
- CheckoutService.java
- CouponPolicy.java
- WebCheckoutControllerTest.java
- MobileCheckoutTest.java
- InvoiceCheckoutJobTest.java
- CouponPolicyTest.java
- incident/production-symptoms.md
- incident/repo-map.md

Return:
1. all checkout entry points
2. shared source of truth for coupon validation
3. current expired-coupon behavior by flow
4. where the fix should live
5. tests to add before code changes
6. risk of fixing only one entry point
7. recommended small implementation plan
8. approval owners and rollback considerations

Do not add business validation to controllers.
Do not edit files until the plan is approved.
```
