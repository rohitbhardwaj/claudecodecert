# Act 1 Assignment 2 — Rewrite the Bad Claude Code Prompt

## Theme

Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.

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
preserve behavior
identify risks
identify tests
identify approval owners
define rollback
wait for approval before editing
```

## Included Artifacts

- Assignment instructions
- Participant prompt rewrite worksheet
- Strong sample answer
- Prompt rewrite guide
- Bad prompt analysis
- Prompt quality rubric
- Prompt element cards
- Facilitator guide
- Debrief script
- Scoring rubric
- Reusable prompt templates
- One-page handout
- Source context repo for prompt practice
- `CLAUDE.md`, source files, tests, API contract notes, incident notes, rollback runbook, PR template, and CI workflow
