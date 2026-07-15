# Debrief Script

## Opening

This is a classic repo-aware agent failure.

Claude fixed the file closest to the user request, not the shared source of truth.

## Findings

```text
The controller now blocks expired coupons for web checkout.
CouponPolicy still accepts expired coupons.
Mobile checkout still accepts expired coupons.
Batch invoice checkout still accepts expired coupons.
Business logic moved into the controller.
Only web controller tests were added.
The PR lacked repo map and blast-radius review.
```

## Correct Decision

```text
The PR should not have been approved.
```

## Correct Fix

```text
Fix CouponPolicy.java.
Add tests at CouponPolicy, web, mobile, and batch levels.
Keep controllers thin.
Document blast radius.
```

## Closing Line

Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
