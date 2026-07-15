# Facilitator Guide — Debug the Skipped Planning Step

## Learning Objective

Participants learn that governed Claude Code starts with planning and approval before implementation.

## Setup Script

Say:

```text
Claude was asked to add coupon stacking.
It immediately edited five production files.
The code compiles, but nobody agreed on scope, risk, tests, owners, or rollback.
Your job is to debug the workflow failure.
```

## 7-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Inspect missing plan and bad diff | 3 min |
| Complete worksheet | 2 min |
| Debrief | 1 min |

## 20-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain plan-first workflow | 2 min |
| Inspect repo and AI change | 6 min |
| Complete workflow worksheet | 5 min |
| Write planning checkpoint | 4 min |
| Certification questions and debrief | 3 min |

## Facilitation Prompts

Ask:

```text
What did Claude do before the team approved scope?
Which files should have been inspected first?
Which owners were missing?
Which test was unsafe?
What rollback evidence was missing?
What should the plan have said?
```

## Strong Closing Line

A governed Claude Code workflow starts with a plan, not a diff.
