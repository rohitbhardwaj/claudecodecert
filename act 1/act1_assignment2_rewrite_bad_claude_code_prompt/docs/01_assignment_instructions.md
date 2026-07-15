# Assignment Instructions

## Assignment

Rewrite the bad Claude Code prompt.

## Scenario

The original prompt caused the checkout incident:

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

The team now wants a safer Claude Code prompt for the same task.

## Architect Task

Rewrite the prompt so Claude Code must:

```text
analyze first
inspect relevant files
preserve behavior
identify tests
identify risk areas
identify approval owners
define rollback
wait for approval before editing
```

## Key Lesson

```text
Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.
```
