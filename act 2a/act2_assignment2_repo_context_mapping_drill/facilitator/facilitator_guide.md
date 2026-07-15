# Facilitator Guide — Repo Context Mapping Drill

## Learning Objective

Participants learn to choose the right repository context before asking Claude Code to propose or implement changes.

## Setup Script

Say:

```text
In Assignment 1, Claude fixed the wrong file because it did not have or use the right repo context.
Now your job is to decide what context Claude must inspect before changing enterprise-only coupon behavior.
```

## 5-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Participants complete worksheet | 2 min |
| Show strong sample answer | 1 min |
| Debrief | 1 min |

## 15-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain repo context risk | 2 min |
| Inspect repo structure | 4 min |
| Complete context map | 4 min |
| Write first Claude prompt | 3 min |
| Debrief | 2 min |

## Facilitation Prompts

Ask:

```text
Which paths can apply coupons?
Where does enterprise eligibility live?
What changes money?
What changes the API contract?
What tests protect behavior?
What logging risks exist?
What controls rollout?
Who must approve?
```

## Strong Closing Line

Before Claude Code edits the repo, architects must decide what context the repo must provide.
