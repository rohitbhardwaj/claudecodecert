# Bugs Participants Should Find

| Area | Problem |
|---|---|
| Weak repo guidance | `CLAUDE.md` did not explain architecture boundaries |
| Wrong layer | Cancellation business logic added to controller |
| Shared rule missed | `OrderCancellationPolicy.java` should own cancellation rules |
| Refund duplication | Refund logic duplicated instead of using `RefundPolicy` |
| Inconsistent flows | Web, mobile, and batch behavior diverge |
| Observability drift | Reason codes are inconsistent |
| Approval gap | CODEOWNERS not checked |
| Test gap | Only web happy-path test added |

## Expected PR Decision

```text
The PR should not have been approved.
```
