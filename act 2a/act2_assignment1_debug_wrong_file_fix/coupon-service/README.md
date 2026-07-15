# Coupon Service — Wrong File Fix Simulation

This repo demonstrates a repo-aware agent failure.

Claude was asked to fix expired coupons during checkout.

It patched:

```text
src/controller/WebCheckoutController.java
```

But the real bug remained in:

```text
src/domain/CouponPolicy.java
```

## Goal

Find why the fix is wrong and identify the correct repo-aware fix.
