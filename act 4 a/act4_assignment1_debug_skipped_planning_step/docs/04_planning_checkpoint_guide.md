# Planning Checkpoint Guide

Before Claude edits production checkout behavior, it should return a planning checkpoint.

## Required Planning Output

```text
1. Problem restatement
2. Files inspected
3. Affected entry points
4. Shared policies affected
5. Pricing impact
6. Refund impact
7. API contract impact
8. Test strategy
9. Approval owners
10. PR slicing recommendation
11. Rollback / feature flag plan
12. Risks and open questions
```

## Why This Matters

Coupon stacking is not a simple local change. It can affect:

```text
web checkout
mobile checkout
pricing
refunds
API response
tests
rollout
support
```

## Planning Rule

```text
If a task changes production behavior, Claude must produce a plan before producing a diff.
```
