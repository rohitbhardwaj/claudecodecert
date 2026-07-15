# Assignment Instructions

## Assignment

Debug the missing `CLAUDE.md` guardrail.

## Scenario

A team asks Claude Code:

```text
Add order cancellation support to checkout.
```

Because repo guidance is weak, Claude adds cancellation logic directly into `CheckoutController.java`.

The happy-path web test passes, but production behavior diverges across web, mobile, and batch.

## Production Symptoms

```text
Web checkout cancellation works.
Mobile cancellation behaves differently.
Batch cancellation is not supported.
Refund logic is duplicated.
Cancellation reason codes are inconsistent.
Controller now contains business rules.
No CODEOWNERS approval was requested.
```

## Architect Task

Review the source files, weak `CLAUDE.md`, bad diff, and incident notes.

Answer:

```text
Why did Claude place logic in the wrong layer?
What architecture guardrails were missing?
What should CLAUDE.md have said?
Should the PR have been approved?
```

## Key Lesson

```text
When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.
```
