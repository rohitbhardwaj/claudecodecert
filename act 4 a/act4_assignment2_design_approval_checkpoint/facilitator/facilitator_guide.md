# Facilitator Guide — Design the Approval Checkpoint

## Learning Objective

Participants learn that approval must be based on evidence, not informal confidence.

## Setup Script

Say:

```text
In Assignment 1, Claude edited before the team agreed on scope and risks.
Now we design the checkpoint that prevents that failure.
Claude should not implement partial refunds until the plan has enough evidence for owners to approve.
```

## 6-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Participants fill approval worksheet | 3 min |
| Review strong sample answer | 1 min |
| Certification question | 1 min |

## 15-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain approval evidence | 2 min |
| Inspect repo context | 4 min |
| Complete worksheet | 4 min |
| Write approval checkpoint prompt | 3 min |
| Debrief | 2 min |

## Facilitation Prompts

Ask:

```text
What failure paths matter?
Who owns money behavior?
What does payment gateway timeout do?
Will the API response change?
What data must be stored?
What logging is safe?
What tests prove correctness?
How can we rollback?
```

## Strong Closing Line

Approval is not a meeting. It is evidence that the right risks were understood before code changed.
