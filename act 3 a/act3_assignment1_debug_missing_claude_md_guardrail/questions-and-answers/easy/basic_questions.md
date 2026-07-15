# Easy Questions

## Q1. Why is a weak `CLAUDE.md` risky?

## Answer

Because Claude may infer architecture from messy code.

## Reasoning

If the repo does not explain the intended architecture, Claude may copy bad existing patterns.

---

## Q2. Why is business logic in a controller risky?

## Answer

Because controllers are entry points, not the source of business rules.

## Reasoning

If each controller has its own rules, web, mobile, and batch behavior can diverge.

---

## Q3. Where should cancellation rules live?

## Answer

In `OrderCancellationPolicy` and orchestration through `CancellationService`.

## Reasoning

Cancellation is a business rule and should be shared across all entry points.

---

## Q4. Should the PR have been approved?

## Answer

No.

## Reasoning

It passed a web happy-path test but created architecture drift and inconsistent behavior.
