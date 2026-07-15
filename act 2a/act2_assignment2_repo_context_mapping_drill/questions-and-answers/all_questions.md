# All Questions and Answers

## Easy

### Why include web, mobile, and batch checkout?

Because enterprise-only coupons may be used through multiple checkout paths.

### Why include CouponPolicy?

Because it is likely the shared source of truth for coupon rules.

### Why include EnterpriseCustomerPolicy?

Because the new coupon is enterprise-only.

### Why include existing tests?

To preserve behavior and reveal missing coverage.

## Medium

### Why include PricingService?

Because coupons affect final amount and possibly tax, payment, and refunds.

### Why include the API contract?

Because response fields or rejection reasons may change.

### Why include logging policy?

To avoid PII and preserve reason-code observability.

### Why include rollback?

Because production checkout behavior needs a safe disable or revert path.

## Advanced

### How much context is too much?

Include behavior, contracts, tests, security, rollout, and owners. Exclude unrelated modules.

### Should Claude inspect CODEOWNERS?

Yes, to identify approvers.

### Should Claude inspect CLAUDE.md?

Yes, to follow repo-specific rules.

### What is the deeper lesson?

Claude Code changes the unit of work from one file to a repository flow.
