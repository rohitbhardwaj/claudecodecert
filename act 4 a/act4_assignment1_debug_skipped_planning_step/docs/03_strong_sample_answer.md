# Strong Sample Answer

```text
The PR should not have been approved.

Claude skipped the planning checkpoint and started editing production behavior before the team agreed on scope, risks, tests, owners, and rollback.

Coupon stacking affects pricing, refund behavior, API response, web checkout, mobile checkout, and tests. Claude should have first produced a plan showing affected files, business rules, test strategy, approval owners, and rollback options.

The correct workflow should have been:
1. analyze before editing
2. identify affected entry points and shared policies
3. propose the smallest safe implementation plan
4. identify tests to add before code changes
5. identify approval owners
6. wait for approval
7. implement in small PRs
8. preserve and strengthen tests
9. include rollback plan
```

## Key Lesson

```text
A governed Claude Code workflow starts with a plan, not a diff.
```
