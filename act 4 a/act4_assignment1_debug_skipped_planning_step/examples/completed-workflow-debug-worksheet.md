# Completed Workflow Debug Worksheet — Strong Example

| Workflow step | What happened? | Why is it risky? | Correct governed action |
|---|---|---|---|
| Plan | Claude edited before plan | Scope, risks, owners unknown | Return planning checkpoint first |
| Context | Mobile/refund/pricing/API not analyzed | Hidden blast radius | Inspect all affected files |
| Approval | No API/pricing/architecture approval | Contract and money risk | Identify owners before editing |
| Implementation | Five files changed at once | Large unclear PR | Slice into smaller approved PRs |
| Tests | Pricing test rewritten | Safety net weakened | Add/repair tests, do not hide failures |
| Review | No blast-radius explanation | Reviewer lacks evidence | Include risk and file impact summary |
| Merge readiness | No rollback | Production recovery gap | Add feature flag/revert plan |
