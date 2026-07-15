# All Questions and Answers

## Easy

### Why should Claude not implement immediately?

Because partial refunds affect money and production behavior.

### What is an approval checkpoint?

A written plan showing what will change and what risks were considered.

### Who approves refund calculation?

Finance/payments and architecture owners.

### Why include rollback?

To recover safely if production behavior fails.

## Medium

### Why include payment gateway timeout behavior?

Timeouts can cause duplicate refunds, missing refunds, or unclear state.

### Why include API contract impact?

Clients may depend on refund fields and error codes.

### Why include data/repository impact?

Partial refunds may need audit and state tracking.

### Why include logging/security?

Refund logs can expose sensitive data.

## Advanced

### What makes a checkpoint implementation-ready?

Behavior, risks, tests, owners, rollback, and open questions.

### How slice partial refund PRs?

Tests/API decision, RefundPolicy, gateway integration, data/audit, logging/rollback.

### Owner approval vs reviewer approval?

Owners accept domain risk; reviewers check code quality.

### Certification lesson?

Ask for explicit evidence before implementation.

## Certification Style

### Missing gateway timeout behavior?

Request changes to the plan before implementation.

### Best approval artifact?

Plan listing behavior, risks, tests, owners, and rollback.

### API response change owner?

API owner.

### No duplicate-refund handling?

Failure and edge-case planning missing.

### Logging changes owner?

Security / SRE.

### No rollback plan?

Request rollback/feature flag plan.

### Best definition of approval?

Evidence that risks were understood before code changed.
