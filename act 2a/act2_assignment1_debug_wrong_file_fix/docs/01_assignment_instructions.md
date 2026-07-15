# Assignment Instructions

## Assignment

Debug the wrong file fix.

## Scenario

A developer asks Claude Code:

```text
Fix the issue where expired coupons are still accepted during checkout.
```

Claude Code edits `WebCheckoutController.java` because that is where the request enters the system.

The happy-path web test passes, but the bug still exists in other flows.

## Production Symptoms

```text
Expired coupons are blocked in web checkout.
Expired coupons are still accepted in mobile checkout.
Expired coupons are still accepted in batch invoice checkout.
The controller now contains business validation logic.
The real bug in CouponPolicy.java remains unfixed.
```

## Architect Task

Compare the repo structure, source files, AI-generated change, and incident notes.

Decide:

```text
What did Claude fix?
What did Claude miss?
Where should the fix live?
What tests should have been added?
Should the PR have been approved?
```

## Key Lesson

```text
Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
```
