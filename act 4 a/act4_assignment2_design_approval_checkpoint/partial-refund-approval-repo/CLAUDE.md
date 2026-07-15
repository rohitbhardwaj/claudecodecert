# CLAUDE.md

## Workflow Rule

Claude must not edit files for production refund behavior until an approval checkpoint is reviewed.

## Required Approval Evidence

```text
current vs proposed behavior
refund calculation rules
gateway failure behavior
API impact
data impact
logging/security
tests
rollback
PR slicing
approval owners
```

## Never

```text
Do not implement refund logic before approval.
Do not log PII.
Do not ignore gateway timeouts.
Do not remove or weaken tests.
```
