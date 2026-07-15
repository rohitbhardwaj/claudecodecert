# Facilitator Guide — Rewrite the Bad Claude Code Prompt

## Learning Objective

Participants learn how to convert a vague implementation command into a constrained analysis-first Claude Code prompt.

## Setup Script

Say:

```text
The original prompt did not just ask Claude to refactor. It also told Claude to fix failing tests.
That created an unsafe incentive.
Now your job is to rewrite the prompt so Claude analyzes first and waits for approval.
```

## 5-Minute Live Version

| Segment | Time |
|---|---:|
| Show bad prompt | 45 sec |
| Participants fill worksheet | 2 min |
| Share strong prompt | 1 min |
| Debrief | 1 min |

## 12-Minute Workshop Version

| Segment | Time |
|---|---:|
| Analyze bad prompt | 2 min |
| Build prompt with element cards | 4 min |
| Write full prompt | 3 min |
| Pair review using scorecard | 2 min |
| Debrief | 1 min |

## Facilitation Prompts

Ask:

```text
What should Claude not do yet?
What files must Claude inspect?
What behavior must not change?
What tests must not be removed?
What risks should Claude identify?
Who should approve?
When should Claude stop?
```

## Strong Closing Line

Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.
