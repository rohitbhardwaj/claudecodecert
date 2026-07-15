# Repo Context Selection Guide

## Why Context Mapping Matters

Claude Code can reason across a repository, but it only reasons well when it is given or directed toward the right context.

For enterprise-only coupons, the change is not just one file.

It can affect:

```text
entry points
shared policies
pricing
API contracts
tests
logging
rollout
approval owners
repo-specific rules
```

## Good Context Selection Answers

A strong answer includes:

```text
all checkout entry points
shared domain policies
pricing calculation
API contract
existing tests
logging/security policy
feature flags and rollback
CODEOWNERS
CLAUDE.md
```

## Bad Context Selection Answers

Weak answers include only:

```text
the controller
the file mentioned in the ticket
one happy-path test
```

## Rule of Thumb

```text
If a change affects business behavior, include every entry point, the shared rule, tests, contract, observability, rollout, and owners.
```
