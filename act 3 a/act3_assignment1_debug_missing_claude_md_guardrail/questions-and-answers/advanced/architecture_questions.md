# Advanced Questions

## Q1. Is `CLAUDE.md` enough by itself?

## Answer

No.

## Reasoning

`CLAUDE.md` provides guidance, but governance also needs CODEOWNERS, PR templates, tests, CI checks, architecture docs, and review discipline.

---

## Q2. What is the deeper architecture smell?

## Answer

The repo lacks clear boundaries and source-of-truth policies.

## Reasoning

Claude exposed the problem by following existing messy patterns.

---

## Q3. What should happen when code conflicts with `CLAUDE.md`?

## Answer

Claude should follow the documented architecture and flag conflicting code as technical debt.

## Reasoning

The purpose of repo guidance is to prevent bad patterns from being repeated.

---

## Q4. How would you make this cert-ready?

## Answer

Teach candidates to identify wrong layer, missing guardrail, missing owner review, missing tests, and the correct first action.

## Reasoning

Certification questions often test governance judgment, not syntax.
