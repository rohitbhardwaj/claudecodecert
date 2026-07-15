# Expected `CLAUDE.md` Sections

A strong `CLAUDE.md` for this repo should include:

```text
Repository purpose
Architecture boundaries
Controller rules
Service rules
Domain policy rules
Data access rules
Reason-code rules
Refund rules
Logging/security rules
Testing expectations
Approval owners
Rollback expectations
Plan-before-edit workflow
Never rules
```

## Must-Have Rules

```text
Controllers must be transport-only.
Business rules belong in domain policies.
Refund rules belong in RefundPolicy.
Services must use repository abstractions.
Use approved reason codes.
Do not log PII.
Add happy, failure, and edge-case tests.
Domain policy changes need architecture approval.
Production behavior changes need rollback plan.
Claude must analyze and return a plan before editing.
```
