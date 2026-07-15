# Messy Patterns Participants Should Find

| Messy pattern | What to notice |
|---|---|
| Business logic in controller | Controller calculates discounts and refund eligibility |
| Refund logic duplicated | Refund behavior appears in controller, service, and RefundPolicy |
| Inconsistent reason codes | Same condition returns different strings |
| Happy-path-only tests | Tests verify success but miss failure and edge cases |
| PII-like logging | Logger may log customer email or payment reference |
| Missing domain CODEOWNERS | Domain policy files lack architecture approval |
| Direct data access from service | Service bypasses repository abstraction expectations |
| Unclear rollback rules | Production behavior changes have no rollback requirement |
