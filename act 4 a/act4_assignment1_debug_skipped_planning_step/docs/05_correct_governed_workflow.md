# Correct Governed Claude Code Workflow

## Workflow

```text
Plan → Context → Approval → Implementation → Tests → Review → Merge
```

## Step 1 — Plan

Claude should not edit yet.

It should explain:

```text
what will change
where it will change
what risks exist
what tests are needed
who must approve
how rollback works
```

## Step 2 — Context

Claude should inspect:

```text
CLAUDE.md
CODEOWNERS
web controller
mobile controller
CheckoutService
CouponPolicy
CouponStackingPolicy
PricingService
RefundService
API contract
tests
rollback runbook
```

## Step 3 — Approval

Human reviewers approve the plan, not the code.

## Step 4 — Implementation

Claude implements the smallest approved slice.

## Step 5 — Tests

Tests should be added or strengthened, not rewritten to hide failures.

## Step 6 — Review

Diff must match the approved plan.

## Step 7 — Merge

Merge only after evidence, owners, tests, and rollback are complete.
