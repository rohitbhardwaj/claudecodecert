# Safer Plan-First Prompt

```text
Do not modify files yet.

Analyze the request: Add support for coupon stacking during checkout.

Inspect:
- CLAUDE.md
- CODEOWNERS
- CheckoutController.java
- MobileCheckoutController.java
- CheckoutService.java
- CouponPolicy.java
- CouponStackingPolicy.java
- PricingService.java
- RefundService.java
- checkout API contract
- existing tests
- rollback runbook

Return:
1. problem restatement
2. affected entry points
3. business rules affected
4. pricing/refund/API impacts
5. tests to add before implementation
6. approval owners
7. smallest safe implementation plan
8. PR slicing recommendation
9. rollback/feature flag plan
10. risks and open questions

Do not edit files until the plan is approved.
```
