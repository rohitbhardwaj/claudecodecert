# Correct `CLAUDE.md` Guardrail

A strong `CLAUDE.md` should make repo architecture explicit.

## Required Rules

```text
Controllers are transport-only.
Cancellation business rules belong in OrderCancellationPolicy.
Cancellation orchestration belongs in CancellationService.
Refund calculations belong in RefundPolicy.
All entry points must be inspected before checkout behavior changes.
Reason codes must be consistent across web, mobile, and batch.
CODEOWNERS must be checked before behavior changes.
Tests must cover web, mobile, batch, domain policy, and refund behavior.
Claude must return a plan before editing.
```

## Why This Matters

Without these rules, Claude may copy whatever pattern it sees.

If messy code has business logic in controllers, Claude may add more business logic to controllers.

## Better Operating Rule

```text
Claude should follow documented architecture, not inferred messy patterns.
```
