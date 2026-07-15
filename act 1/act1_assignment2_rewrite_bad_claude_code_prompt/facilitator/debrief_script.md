# Debrief Script

## Opening

The prompt is part of the architecture control system.

A vague prompt produces vague authority.

## Bad Prompt Problem

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

This prompt fails because it:

```text
does not preserve behavior
does not protect tests
does not define risk areas
does not require approval
does not require rollback thinking
```

## Strong Prompt Pattern

```text
Do not edit yet.
Analyze first.
Inspect known files.
Preserve behavior.
Identify risks.
Identify tests.
Identify approval owners.
Define rollback.
Wait for approval.
```

## Closing Line

Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.
