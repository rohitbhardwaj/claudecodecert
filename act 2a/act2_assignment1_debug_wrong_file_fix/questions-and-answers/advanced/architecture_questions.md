# Advanced Questions

## Q1. Is it ever acceptable to validate coupon expiration in a controller?

## Answer

Only as a temporary defensive check in rare cases, and even then it should not replace the domain rule.

## Reasoning

Controllers are entry points. If business rules live there, each new entry point can drift from the others.

A shared policy prevents duplicated, inconsistent behavior.

---

## Q2. What is the architectural smell in this PR?

## Answer

Business logic moved into the transport layer.

## Reasoning

The controller should translate requests and responses. It should not own coupon expiration rules.

This creates hidden coupling between web checkout and coupon behavior.

---

## Q3. What is the deeper Claude Code lesson?

## Answer

Claude Code can reason across a repo, but only if prompted and constrained to do so.

## Reasoning

If the prompt is symptom-focused, Claude may patch the first visible file. If the prompt is repo-aware, Claude can map the system and find the source of truth.

---

## Q4. What should `CLAUDE.md` say to prevent this?

## Answer

It should say:

```text
Coupon validation rules belong in CouponPolicy.
Controllers must not contain coupon business rules.
Before changing checkout behavior, inspect web, mobile, batch, service, domain policy, and tests.
```

## Reasoning

Repo instructions make architecture boundaries visible to Claude and developers.
