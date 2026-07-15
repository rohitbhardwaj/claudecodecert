# One-Page Handout — Debug the Wrong File Fix

## Scenario

Claude was asked to fix expired coupons during checkout.

It patched:

```text
WebCheckoutController.java
```

But the real bug remained in:

```text
CouponPolicy.java
```

## Production Result

```text
Web checkout fixed.
Mobile checkout still broken.
Batch checkout still broken.
Business logic moved into controller.
```

## Key Lesson

```text
Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
```

## Safer Pattern

```text
Map entry points.
Find shared domain policy.
Add cross-flow tests.
Fix the shared source.
Avoid controller business logic.
Document blast radius.
```
