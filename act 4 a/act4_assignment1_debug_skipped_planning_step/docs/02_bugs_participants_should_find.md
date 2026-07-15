# Bugs Participants Should Find

| Area | Problem |
|---|---|
| Planning | Claude edited before producing a plan |
| Scope | Too many files changed in one PR |
| Context | Mobile, refund, pricing, and API contract impact not analyzed first |
| Approval | API, pricing, and architecture owners not consulted |
| Tests | Failing pricing test rewritten instead of fixed |
| Behavior | Coupon stacking applies discounts twice |
| Rollback | No rollback or feature flag |
| Review | PR lacks blast-radius explanation |

## Expected PR Decision

```text
The PR should not have been approved.
```
