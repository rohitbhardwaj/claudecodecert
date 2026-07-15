# Strong Sample Answer

| Messy pattern | Architecture rule to extract | Where should rule live? |
|---|---|---|
| Business logic in controller | Controllers must be transport-only | `CLAUDE.md`, architecture docs |
| Refund logic duplicated | Refund rules belong in `RefundPolicy` | `CLAUDE.md`, domain docs |
| Inconsistent reason codes | Use approved reason-code enum | `CLAUDE.md`, API docs |
| Happy-path-only tests | Add happy, failure, and edge-case tests | `CLAUDE.md`, PR template |
| PII-like logging | Log correlation ID and reason code only | security policy, CI scan |
| Missing domain CODEOWNERS | Domain policy changes need architecture approval | CODEOWNERS |
| Direct data access from service | Use repository abstraction | architecture docs |
| Unclear rollback rules | Production behavior changes need rollback plan | PR template, runbook |

## Key Lesson

```text
Good Claude Code governance converts tribal architecture knowledge into repo-readable rules.
```
