# Safer Workflow

## Step 1 — Analyze Before Editing

Claude should have been asked to inspect the current behavior first.

```text
Do not modify files yet.
Analyze checkout validation and identify simplification opportunities without changing behavior.
```

## Step 2 — Preserve Behavior

The prompt should have explicitly protected:

```text
coupon validity rules
enterprise customer eligibility
payment error codes
reason-code logging
failure-path tests
public API behavior
```

## Step 3 — Add Characterization Tests

Before refactoring, add tests for current behavior:

```text
expired coupon rejected
non-enterprise rejected from enterprise-only discount
enterprise customer accepted
payment declined maps to PAYMENT_DECLINED
reason code appears in logs
```

## Step 4 — Small PR

The PR should have been split into:

```text
PR 1: characterization tests
PR 2: small refactor without behavior change
PR 3: optional cleanup with explicit approvals
```

## Step 5 — Review and Rollback

The PR should include:

```text
review owner
blast-radius note
tests run
rollback plan
```
