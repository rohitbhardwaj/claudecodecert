# Medium Questions

## Q1. What should `CLAUDE.md` have said?

## Answer

It should define architecture boundaries, required context, testing expectations, approval owners, and plan-before-edit rules.

## Reasoning

Claude needs repo-readable guidance at the point of work.

---

## Q2. Why is refund duplication dangerous?

## Answer

Refund logic affects money behavior.

## Reasoning

If refund rules are duplicated, web, mobile, and batch may calculate refunds differently.

---

## Q3. Why are reason codes important?

## Answer

They help support, observability, and incident debugging.

## Reasoning

If reason codes are inconsistent, support cannot reliably trace failures.

---

## Q4. Why should CODEOWNERS be checked?

## Answer

Behavior changes require review by responsible owners.

## Reasoning

Cancellation and refund behavior may require architecture, checkout, finance, and QA approval.
