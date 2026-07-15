# One-Page Handout — Rewrite the Bad Claude Code Prompt

## Bad Prompt

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

## Why It Failed

```text
vague goal
no behavior preservation
no test protection
no risk analysis
no approval checkpoint
no rollback thinking
```

## Safe Prompt Pattern

```text
Do not edit yet.
Analyze first.
Inspect the right context.
Preserve behavior.
Identify tests.
Identify risks.
Identify owners.
Define rollback.
Wait for approval.
```

## Key Lesson

```text
Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.
```
