# Easy Questions

## Q1. Why is fixing `WebCheckoutController.java` not enough?

## Answer

Because web checkout is only one entry point.

The same coupon rule is also used by mobile checkout and batch invoice checkout.

## Simple Reasoning

```text
If the bug is in a shared rule, fixing only one caller leaves other callers broken.
```

## Q2. Where should the expired coupon rule live?

## Answer

It should live in `CouponPolicy.java`.

## Simple Reasoning

```text
Coupon expiration is a business rule.
Business rules should live in the domain policy, not in a controller.
```

## Q3. Why did the happy-path test pass?

## Answer

Because the test only checked web checkout after the controller patch.

It did not test mobile checkout, batch checkout, or the domain policy directly.

## Simple Reasoning

```text
A narrow test can pass while the system is still broken.
```

## Q4. Should the PR have been approved?

## Answer

No.

## Simple Reasoning

```text
The PR fixed only one path and introduced architecture drift by moving business logic into the controller.
```
