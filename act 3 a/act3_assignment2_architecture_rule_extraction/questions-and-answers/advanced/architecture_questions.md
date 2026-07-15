# Advanced Questions

## Q1. How do you decide whether a rule belongs in `CLAUDE.md` or CI?

## Answer

Use `CLAUDE.md` for guidance and CI for enforceable automated checks.

## Reasoning

Claude can follow instructions, but automated gates catch violations consistently.

---

## Q2. What is the best way to convert PR comments into governance?

## Answer

Identify repeated comments, turn them into specific rules, add them to repo artifacts, and create tests/checks where possible.

## Reasoning

Repeated review comments indicate missing system-level guidance.

---

## Q3. What is the main risk of tribal architecture knowledge?

## Answer

It does not scale across people, time, or AI tools.

## Reasoning

Claude and new developers cannot follow rules that are not visible in the repo.

---

## Q4. Why is this important for certification readiness?

## Answer

Certification-style questions often test architectural judgment and governance, not syntax.

## Reasoning

Candidates must recognize where rules belong and how to make AI-assisted changes safe.
