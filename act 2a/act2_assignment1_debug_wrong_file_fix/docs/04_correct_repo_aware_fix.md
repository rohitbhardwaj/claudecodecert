# Correct Repo-Aware Fix

## Wrong Fix

Claude patched the visible entry point:

```text
WebCheckoutController.java
```

That only protects the web checkout path.

## Correct Fix

The bug belongs in:

```text
CouponPolicy.java
```

because coupon expiration is a shared business rule used by:

```text
web checkout
mobile checkout
batch invoice checkout
```

## Correct Design

```text
Controllers should not own coupon expiration logic.
Controllers should delegate checkout behavior to CheckoutService.
CheckoutService should rely on CouponPolicy.
CouponPolicy should enforce active, remaining uses, and expiration rules.
```

## Tests Needed

```text
CouponPolicy rejects expired coupons.
Web checkout rejects expired coupons.
Mobile checkout rejects expired coupons.
Batch invoice checkout rejects expired coupons.
No controller duplicates domain validation.
```

## Review Requirement

The PR must include a repo map or blast-radius note showing all flows affected by coupon validation.
