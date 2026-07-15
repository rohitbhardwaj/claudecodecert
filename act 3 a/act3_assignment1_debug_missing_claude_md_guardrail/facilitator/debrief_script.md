# Debrief Script

## Opening

This failure is not just a code bug. It is a repo-governance bug.

## What Happened

```text
CLAUDE.md did not define architecture boundaries.
Claude added cancellation logic to CheckoutController.
Refund logic was duplicated.
Mobile and batch flows diverged.
Reason codes became inconsistent.
CODEOWNERS approval was not requested.
Only web happy-path tests were added.
```

## Correct Decision

```text
The PR should not have been approved.
```

## Missing Guardrail

```text
Controllers are transport-only.
Cancellation rules belong in OrderCancellationPolicy.
Refund logic belongs in RefundPolicy.
All entry points must be inspected.
CODEOWNERS must be checked.
Cross-flow tests are required.
Claude must plan before editing.
```

## Closing Line

Claude Code does not only need access to the repo. It needs the repo to explain how engineering is supposed to work.
