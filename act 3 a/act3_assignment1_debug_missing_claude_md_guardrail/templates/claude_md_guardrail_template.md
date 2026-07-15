# CLAUDE.md Guardrail Template

## Architecture Boundaries

```text
Controllers are transport-only.
Services orchestrate use cases.
Domain policies own business rules.
RefundPolicy owns refund calculations.
Reason codes must come from approved enum.
```

## Before Editing Checkout Behavior

Claude must inspect:

```text
all controllers
batch processors
services
domain policies
refund policy
tests
CODEOWNERS
architecture docs
```

## Required Plan

Claude must return:

```text
current behavior summary
entry points affected
source-of-truth policy
test plan
approval owners
rollback considerations
```

## Never

```text
Do not add business rules to controllers.
Do not duplicate refund logic.
Do not invent reason codes.
Do not remove or weaken tests.
Do not edit before plan approval.
```
