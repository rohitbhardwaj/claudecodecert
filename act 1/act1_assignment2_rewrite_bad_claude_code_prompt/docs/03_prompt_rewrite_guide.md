# Prompt Rewrite Guide

A safe Claude Code prompt should have eight parts.

## 1. Stop Editing

```text
Do not modify files yet.
```

## 2. Define the Task as Analysis

```text
Analyze checkout validation and identify simplification opportunities without changing production behavior.
```

## 3. Specify Context

```text
Inspect CLAUDE.md, CheckoutService, policies, mapper, tests, API contract, and incident notes.
```

## 4. Preserve Behavior

```text
Preserve coupon rules, enterprise eligibility, payment error codes, reason-code logging, and failure-path tests.
```

## 5. Require Tests

```text
Identify existing tests and tests to add before code changes.
```

## 6. Identify Risk Areas

```text
Call out API, payment, eligibility, observability, and rollback risks.
```

## 7. Identify Approvals

```text
List checkout, payment, API, QA, and architecture owners if approval is needed.
```

## 8. Wait for Approval

```text
Return a plan and wait for human approval before editing.
```
