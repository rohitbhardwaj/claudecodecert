# Easy Questions

## Q1. Why is editing before planning risky?

## Answer

Because the team has not agreed on scope, risks, tests, owners, or rollback.

## Reasoning

A diff can look useful while hiding production impact.

---

## Q2. What should Claude do before editing?

## Answer

Analyze the repo and return a plan.

## Reasoning

The plan gives humans a chance to approve scope and risk before code changes.

---

## Q3. Why is a large PR risky?

## Answer

It is harder to review and may mix unrelated changes.

## Reasoning

Small PRs make risk, tests, and rollback easier to understand.

---

## Q4. Why is rollback required?

## Answer

Production changes can fail.

## Reasoning

A rollback plan explains how to recover safely.
