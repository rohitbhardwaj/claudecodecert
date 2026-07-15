# Facilitator Guide — Debug the AI-Generated Checkout Bug

## Learning Objective

Participants learn that AI-generated refactors can silently change production behavior even when code compiles and happy-path tests pass.

## Setup Script

Say:

```text
Claude Code was asked to simplify checkout validation.
The PR looked cleaner and happy-path tests passed.
But production behavior changed.
Your job is to debug what changed and decide whether the PR should have been approved.
```

## 7-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Participants compare files | 3 min |
| Fill worksheet | 2 min |
| Debrief | 1 min |

## 20-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain incident | 2 min |
| Inspect source files | 7 min |
| Complete worksheet | 5 min |
| Group discussion | 4 min |
| Debrief with strong answer | 2 min |

## Facilitation Prompts

Ask:

```text
What did Claude optimize for?
What behavior changed silently?
Which tests should have caught this?
What made the original prompt unsafe?
What should have blocked the PR?
What should Claude have been asked to do first?
```

## Strong Closing Line

The first risk of vibe coding is not bad syntax. It is silent behavior change.
