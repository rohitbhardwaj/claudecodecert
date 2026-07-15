# Facilitator Guide — Missing `CLAUDE.md` Guardrail

## Learning Objective

Participants learn that Claude Code needs explicit repo-readable architecture guidance.

## Setup Script

Say:

```text
Claude was asked to add cancellation support.
The repo contained messy examples and weak guidance.
Claude followed the pattern it saw and added business logic to the controller.
Your job is to debug what went wrong and define the missing repo guardrails.
```

## 7-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Inspect weak CLAUDE.md and bad diff | 3 min |
| Complete worksheet | 2 min |
| Debrief | 1 min |

## 20-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain repo-guidance risk | 2 min |
| Inspect source files and bad diff | 6 min |
| Review production symptoms | 3 min |
| Write missing CLAUDE.md rules | 5 min |
| Certification-style questions | 2 min |
| Debrief | 2 min |

## Facilitation Prompts

Ask:

```text
What did Claude infer from the repo?
What should the repo have told Claude?
Where should cancellation rules live?
Why is controller logic risky?
Which tests were missing?
Who should approve this change?
```

## Strong Closing Line

When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.
