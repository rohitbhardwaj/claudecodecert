# Assignment Instructions

## Assignment

Architecture Rule Extraction from Messy Code

## Scenario

The checkout repo has grown over time. Architecture knowledge exists only in senior engineers’ heads and old PR comments.

Claude Code is now being used by new developers, but the repo has no clear architecture rules.

The team wants to create a useful `CLAUDE.md`.

## Current Repo Problems

```text
Controllers sometimes contain business logic.
Services sometimes call database utilities directly.
Reason codes are inconsistent.
Tests focus mostly on happy paths.
Refund behavior is split across three files.
Security logging rules are not documented.
CODEOWNERS exists but does not cover domain policies.
```

## Architect Task

Extract architecture rules and write them as clear `CLAUDE.md` instructions.

## Output

Participants should produce:

```text
messy pattern
architecture rule
where the rule should live
example CLAUDE.md instruction
```

## Key Lesson

```text
Good Claude Code governance converts tribal architecture knowledge into repo-readable rules.
```
