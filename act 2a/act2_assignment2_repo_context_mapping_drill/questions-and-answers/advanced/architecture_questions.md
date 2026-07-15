# Advanced Questions

## Q1. How much context is too much context?

## Answer

Too much irrelevant context can confuse the task, but missing critical context causes unsafe changes.

## Reasoning

A good context map includes files that determine behavior, contracts, tests, security, rollout, and ownership. It avoids unrelated modules.

---

## Q2. Should Claude inspect CODEOWNERS before implementation?

## Answer

Yes.

## Reasoning

CODEOWNERS identifies who must approve changes across API, pricing, security, platform, and architecture boundaries.

---

## Q3. Should Claude inspect CLAUDE.md first?

## Answer

Yes.

## Reasoning

CLAUDE.md contains repo-specific architecture rules and operating boundaries. It tells Claude how the team expects it to work.

---

## Q4. What is the deeper Act 2 lesson?

## Answer

Claude Code changes the unit of work from one file to a repository flow.

## Reasoning

The architect must define the repo context before Claude reasons about implementation.
