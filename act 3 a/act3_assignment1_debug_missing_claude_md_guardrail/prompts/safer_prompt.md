# Safer Prompt

```text
Do not modify files yet.

Analyze how order cancellation should be added to checkout without violating architecture boundaries.

Inspect:
- CLAUDE.md
- CODEOWNERS
- CheckoutController.java
- MobileCheckoutController.java
- BatchOrderProcessor.java
- CheckoutService.java
- CancellationService.java
- OrderCancellationPolicy.java
- RefundPolicy.java
- existing tests
- incident notes if present

Return:
1. current cancellation-related behavior
2. all affected entry points
3. source-of-truth policy for cancellation rules
4. refund behavior owner
5. reason-code strategy
6. tests needed for web, mobile, batch, domain policy, and refund behavior
7. approval owners
8. smallest safe implementation plan
9. rollback considerations

Do not add business logic to controllers.
Do not duplicate refund logic.
Do not edit files until the plan is approved.
```
