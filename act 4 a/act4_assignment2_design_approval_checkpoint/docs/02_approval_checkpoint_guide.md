# Approval Checkpoint Guide

## What Is an Approval Checkpoint?

An approval checkpoint is the evidence Claude must provide before editing production code.

It is not:

```text
a vague “looks good”
a meeting with no artifact
a screenshot
a line-count estimate
```

It is:

```text
a written plan
risk analysis
test plan
owner map
rollback plan
PR slicing plan
```

## Why Partial Refunds Need Approval

Partial refunds affect:

```text
customer money
payment gateway behavior
order state
API response
data persistence
logs and support reason codes
tests and rollback
```

## Approval Checkpoint Must Answer

```text
What changes?
What behavior is preserved?
What failure paths exist?
Who owns each risk?
What tests prove correctness?
How do we rollback?
What is the smallest safe PR sequence?
```
