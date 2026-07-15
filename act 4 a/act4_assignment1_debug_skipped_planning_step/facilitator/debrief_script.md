# Debrief Script

## Opening

This was not only an implementation failure. It was a workflow failure.

## What Went Wrong

```text
Claude edited before planning.
The PR touched too many files.
Mobile, refund, pricing, and API impacts were not analyzed.
Owners were not identified.
A failing pricing test was rewritten.
Coupon stacking applied twice.
No rollback existed.
The PR lacked blast-radius explanation.
```

## Correct Workflow

```text
Analyze before editing.
Identify context and blast radius.
Return a plan.
Identify tests and owners.
Wait for approval.
Implement smallest slice.
Review diff against plan.
Merge only when evidence is complete.
```

## Closing Line

Plan before change. Approve before implementation. Review before merge.
