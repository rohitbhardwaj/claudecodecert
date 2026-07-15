# Debrief Script

## Opening

This exercise is about converting tribal knowledge into repo guidance.

## Key Findings

```text
Controllers contain business logic.
Refund logic is duplicated.
Reason codes are inconsistent.
Tests are mostly happy path.
Logging rules are missing.
CODEOWNERS misses domain policies.
Services sometimes bypass repository abstractions.
Rollback requirements are unclear.
```

## Strong Rules

```text
Controllers are transport-only.
Refund rules belong in RefundPolicy.
Use approved reason-code enum.
Add happy, failure, and edge-case tests.
Do not log PII.
Domain policies require architecture approval.
Use repository abstraction.
Production behavior changes need rollback plan.
```

## Closing Line

If Claude cannot read the architecture rule, it cannot reliably follow the architecture rule.
