# Facilitator Guide — Debug the Wrong File Fix

## Learning Objective

Participants learn that repo-aware work means finding the shared source of truth, not patching the first visible file.

## Setup Script

Say:

```text
Claude Code saw the web checkout controller and patched the symptom there.
The web path now looks fixed.
But mobile and batch still fail.
Your job is to debug why this is a wrong-file fix.
```

## 7-Minute Live Version

| Segment | Time |
|---|---:|
| Explain scenario | 1 min |
| Participants inspect repo map and diff | 3 min |
| Complete worksheet | 2 min |
| Debrief | 1 min |

## 20-Minute Workshop Version

| Segment | Time |
|---|---:|
| Explain repo-aware risk | 2 min |
| Inspect source files | 6 min |
| Inspect bad diff and incident | 4 min |
| Complete worksheet | 4 min |
| Group debrief | 4 min |

## Facilitation Prompts

Ask:

```text
Why did Claude choose the controller?
Where does the business rule belong?
Which flows still fail?
Which tests were missing?
What repo context should Claude have inspected?
What should the PR reviewer have required?
```

## Strong Closing Line

Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
