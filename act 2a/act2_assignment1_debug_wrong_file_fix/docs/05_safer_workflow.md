# Safer Claude Code Workflow

## Step 1 — Ask for Analysis First

```text
Do not edit files yet.
Find all checkout entry points and all usages of CouponPolicy.
Identify the shared source of truth for coupon expiration.
```

## Step 2 — Map the Blast Radius

Claude should identify:

```text
WebCheckoutController
MobileCheckoutController
InvoiceCheckoutJob
CheckoutService
CouponPolicy
tests for web/mobile/batch/domain
```

## Step 3 — Add Characterization Tests

Before editing behavior:

```text
CouponPolicyTest rejects expired coupons
WebCheckoutControllerTest rejects expired coupons
MobileCheckoutTest rejects expired coupons
InvoiceCheckoutJobTest rejects expired coupons
```

## Step 4 — Fix the Shared Rule

Make the change in:

```text
CouponPolicy.java
```

not in controller-specific code.

## Step 5 — Review Architecture

Confirm:

```text
business logic stays in domain policy
controllers stay thin
all flows behave consistently
```

## Step 6 — Document PR Evidence

PR should include:

```text
repo map
files inspected
blast radius
tests added
owner approval
rollback note
```
