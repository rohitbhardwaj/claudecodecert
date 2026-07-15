# Architecture Boundaries

## Controllers

Entry points only.

## CheckoutService

Coordinates checkout flow.

## CouponPolicy

Owns coupon rules.

## EnterpriseCustomerPolicy

Owns enterprise eligibility.

## PricingService

Owns discount math.

## Logging

Reason codes only. No PII.
