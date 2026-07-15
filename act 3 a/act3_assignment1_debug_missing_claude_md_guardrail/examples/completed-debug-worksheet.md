# Completed Debug Worksheet — Strong Example

| Review area | What happened? | Why is it risky? | Repo guardrail needed |
|---|---|---|---|
| `CLAUDE.md` quality | Weak guidance | Claude inferred from messy code | Define architecture boundaries |
| Controller logic | Cancellation logic added to controller | Business rules in transport layer | Controllers are transport-only |
| Domain policy | `OrderCancellationPolicy` bypassed | Shared cancellation rule missed | Cancellation rules live in domain policy |
| Mobile / batch behavior | Web works, mobile differs, batch missing | Inconsistent production behavior | Inspect all entry points |
| Refund behavior | Refund logic duplicated | Money behavior may diverge | Refund logic belongs in `RefundPolicy` |
| Reason codes | New web-only reason code used | Observability and support drift | Use approved reason-code enum |
| Approval owners | CODEOWNERS not checked | Owners not involved | Require owner review for behavior changes |
| Tests | Only web happy-path test added | Regression risk | Add web, mobile, batch, domain, refund tests |
