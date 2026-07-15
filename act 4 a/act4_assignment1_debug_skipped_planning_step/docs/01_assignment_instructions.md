# Assignment Instructions

## Assignment

Debug the skipped planning step.

## Scenario

A developer asks Claude Code:

```text
Add support for coupon stacking during checkout.
```

Claude immediately edits code across several files:

```text
CheckoutService.java
CouponPolicy.java
PricingService.java
CheckoutController.java
CheckoutServiceTest.java
```

The PR passes happy-path tests, but reviewers notice the change is too large and unclear.

## Production Symptoms

```text
Some coupon combinations apply twice.
Mobile checkout returns a different total than web checkout.
Refund calculations do not match the discounted amount.
The API response changed without approval.
A failing pricing test was rewritten instead of fixed.
No rollback plan exists.
```

## Architect Task

Debug why the workflow failed and write the planning checkpoint Claude should have produced before editing.

## Key Lesson

```text
A governed Claude Code workflow starts with a plan, not a diff.
```
