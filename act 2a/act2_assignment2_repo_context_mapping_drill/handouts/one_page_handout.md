# One-Page Handout — Repo Context Mapping Drill

## Task

```text
Add support for enterprise-only coupons during checkout.
```

## Must Include Context

```text
Web checkout controller
Mobile checkout controller
Batch invoice job
CouponPolicy
EnterpriseCustomerPolicy
PricingService
API contract
Existing tests
Logging policy
Feature flags / rollback
CODEOWNERS
CLAUDE.md
```

## Key Lesson

```text
Before Claude Code edits the repo, architects must decide what context the repo must provide.
```

## Simple Rule

```text
Do not let Claude patch one file until it understands the flow.
```
