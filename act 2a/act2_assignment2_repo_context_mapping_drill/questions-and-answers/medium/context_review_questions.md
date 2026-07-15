# Medium Questions

## Q1. Why include `PricingService`?

## Answer

Coupons change the final checkout amount.

## Reasoning

Enterprise-only coupon support may change subtotal, discount amount, total amount, payment amount, tax, and refunds. Pricing must be inspected before implementation.

---

## Q2. Why include the API contract?

## Answer

The API response may need discount fields or rejection reason codes.

## Reasoning

If the API contract changes, clients may be affected. API owner approval and contract tests may be needed.

---

## Q3. Why include logging policy?

## Answer

Enterprise status, account details, or customer identity may be sensitive.

## Reasoning

Logs should use safe reason codes and correlation IDs, not PII.

---

## Q4. Why include rollback?

## Answer

Enterprise coupon support is production behavior.

## Reasoning

If the new rule causes checkout failures or pricing mistakes, the team needs a safe way to disable or revert it.
