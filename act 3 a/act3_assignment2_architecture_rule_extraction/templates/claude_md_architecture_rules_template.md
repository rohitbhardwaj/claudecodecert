# CLAUDE.md Architecture Rules Template

## Architecture Boundaries

```text
Controllers:
Services:
Domain policies:
Data access:
Logging:
```

## Rules

```text
Controllers must remain transport-only.
Business rules belong in domain policies.
Refund behavior belongs in RefundPolicy.
Services must use repository abstraction.
Use approved reason-code enum.
Do not log PII.
```

## Testing Expectations

```text
Add happy-path tests.
Add failure-path tests.
Add edge-case tests.
Do not remove or weaken existing tests.
```

## Approval Expectations

```text
Domain policy changes require architecture approval.
API changes require API owner approval.
Security/logging changes require security approval.
Production behavior changes require rollback plan.
```

## Claude Workflow

```text
Analyze first.
Return plan.
Wait for approval before editing.
```
