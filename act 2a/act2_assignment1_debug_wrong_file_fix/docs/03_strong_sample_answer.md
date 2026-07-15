# Strong Sample Answer

```text
The PR should not have been approved.

Claude fixed the visible web checkout symptom instead of the domain-level coupon policy.

The bug belongs in CouponPolicy.java because coupon expiration is a business rule shared by web checkout, mobile checkout, and batch invoice checkout.

The safer Claude Code workflow would have been:
1. analyze all checkout entry points before editing
2. identify the shared domain policy
3. add characterization tests for web, mobile, batch, and CouponPolicy
4. fix CouponPolicy.java
5. avoid duplicating business logic in controllers
6. run cross-flow tests
7. document the blast radius in the PR
```

## Key Lesson

```text
Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
```
