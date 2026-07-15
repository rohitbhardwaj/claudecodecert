# CLAUDE.md

## Architecture Rules

Coupon validation rules belong in:

```text
src/domain/CouponPolicy.java
```

Controllers must not contain coupon business rules.

Before changing checkout behavior, inspect:

```text
WebCheckoutController
MobileCheckoutController
InvoiceCheckoutJob
CheckoutService
CouponPolicy
all related tests
```

## Refactor Rule

Do not patch only the visible entry point. Find the shared source of truth.

## Test Rule

Checkout behavior changes require tests for:

```text
domain policy
web checkout
mobile checkout
batch invoice checkout
```
