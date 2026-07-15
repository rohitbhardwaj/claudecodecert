# One-Page Handout — Debug the Skipped Planning Step

## Failure Pattern

```text
Prompt asks for implementation.
Claude edits immediately.
Team reviews a diff without agreeing on scope, risk, tests, owners, or rollback.
```

## Key Lesson

```text
A governed Claude Code workflow starts with a plan, not a diff.
```

## Correct Workflow

```text
Plan → Context → Approval → Implementation → Tests → Review → Merge
```

## Planning Must Include

```text
affected files
entry points
business rules
pricing/refund/API impact
tests
approval owners
rollback
PR slices
```
