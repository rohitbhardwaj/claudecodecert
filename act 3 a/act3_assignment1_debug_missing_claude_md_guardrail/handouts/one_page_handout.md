# One-Page Handout — Missing `CLAUDE.md` Guardrail

## Failure Pattern

```text
Weak CLAUDE.md
+ messy repo examples
+ vague feature request
= Claude follows wrong architecture pattern
```

## What Went Wrong

```text
Cancellation logic added to controller.
Domain policy bypassed.
Refund logic duplicated.
Mobile and batch diverged.
Reason codes inconsistent.
CODEOWNERS not checked.
Tests too narrow.
```

## Key Lesson

```text
When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.
```

## Correct Guardrail

```text
Controllers are transport-only.
Business rules live in domain policies.
Refund logic lives in RefundPolicy.
All entry points must be inspected.
CODEOWNERS must be checked.
Claude must plan before editing.
```
