# Strong Sample Answer

| Approval area | What must Claude provide? | Who approves? |
|---|---|---|
| Business behavior | Current vs proposed refund rules | Product / architecture |
| Money/refund logic | Refund calculation and edge cases | Finance / payments |
| Payment gateway impact | Capture/refund API behavior | Payments owner |
| API contract | Response/error-code changes | API owner |
| Data model / repository | Data fields and migration impact | Data owner |
| Logging/security | Reason codes, no PII | Security / SRE |
| Tests | Happy, failure, edge, gateway timeout | QA / architecture |
| Rollback | Feature flag/revert/disable path | SRE / platform |
| PR slicing | Small PR sequence | Architecture / tech lead |

## Key Lesson

```text
Approval is not a meeting. It is evidence that the right risks were understood before code changed.
```
