# Debrief Script

## Opening

This exercise prevents wrong-file fixes.

Good repo context tells Claude where the source of truth is and what the blast radius includes.

## Strong Context Includes

```text
web checkout
mobile checkout
batch invoice checkout
CouponPolicy
EnterpriseCustomerPolicy
PricingService
API contract
tests
logging policy
feature flags and rollback
CODEOWNERS
CLAUDE.md
```

## Main Lesson

```text
If Claude only sees the controller, it may patch the controller.
If Claude sees the repo map, it can find the shared rule.
```

## Closing Line

Before Claude Code edits the repo, architects must decide what context the repo must provide.
