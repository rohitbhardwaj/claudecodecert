# CLAUDE.md

## Architecture Boundaries

Controllers must remain transport-only. Do not place business rules in controllers.

Services orchestrate use cases and must use repository abstractions for data access.

Domain policies own business rules:

```text
CouponPolicy
RefundPolicy
PaymentPolicy
```

Refund behavior belongs in `RefundPolicy`. Do not duplicate refund calculations in controllers or services.

## Reason Codes

Use approved reason-code enum or API contract values. Do not invent new reason-code strings.

## Logging

Do not log PII such as customer email, billing address, payment token, or account name.

Log only:

```text
correlationId
reasonCode
channel
safe status
```

## Tests

For behavior changes, add:

```text
happy-path tests
failure-path tests
edge-case tests
```

Do not remove or weaken existing tests.

## Approval

Domain policy changes require architecture approval.

Security/logging changes require security approval.

Production behavior changes require rollback plan.

## Claude Workflow

Analyze first. Return a plan. Wait for approval before editing files.
