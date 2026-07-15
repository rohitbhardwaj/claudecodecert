# One-Page Handout — Architecture Rule Extraction

## Problem

Architecture knowledge exists only in:

```text
senior engineers’ heads
old PR comments
tribal memory
```

Claude cannot reliably follow rules it cannot read.

## Key Lesson

```text
Good Claude Code governance converts tribal architecture knowledge into repo-readable rules.
```

## Strong Rules

```text
Controllers are transport-only.
Refund rules belong in RefundPolicy.
Use approved reason-code enum.
Add happy, failure, and edge-case tests.
Do not log PII.
Domain policies need architecture approval.
Use repository abstraction.
Production behavior changes need rollback plan.
```

## Where Rules Live

```text
CLAUDE.md
architecture docs
security policy
CODEOWNERS
PR template
runbook
CI checks
```
