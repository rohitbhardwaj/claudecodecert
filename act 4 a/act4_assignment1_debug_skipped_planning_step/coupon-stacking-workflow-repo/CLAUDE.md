# CLAUDE.md

## Workflow Rule

For production behavior changes, Claude must not edit files until it returns a plan and receives approval.

## Required Plan

```text
affected entry points
business rules
pricing/refund/API impact
tests
approval owners
rollback
PR slices
```

## Architecture Rules

Coupon rules belong in domain policies.

Pricing calculations belong in PricingService.

Refund calculations belong in RefundService.

Controllers are entry points only.
