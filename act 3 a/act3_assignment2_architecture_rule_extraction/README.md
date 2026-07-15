# Act 3 Assignment 2 — Architecture Rule Extraction from Messy Code

## Theme

Good Claude Code governance converts tribal architecture knowledge into repo-readable rules.

## Scenario

The checkout repo has grown over time.

Architecture knowledge exists only in senior engineers’ heads and old PR comments.

Claude Code is being used by new developers, but the repo has no clear architecture rules.

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

Participants extract architecture rules from messy code and old PR comments, then write them as clear `CLAUDE.md` instructions.

## Key Lesson

```text
Good Claude Code governance converts tribal architecture knowledge into repo-readable rules.
```

## Included Artifacts

- Assignment instructions
- Participant worksheet
- Messy pattern guide
- Strong sample answer
- Expected `CLAUDE.md`
- Rule extraction playbook
- Facilitator guide
- Debrief script
- Scoring rubric
- Completed worksheet example
- Source repo simulation
- `CLAUDE.before.md` and `CLAUDE.after.expected.md`
- Old architecture and security PR comments
- Source files showing messy patterns
- Certification-style Q&A with answers and reasoning
