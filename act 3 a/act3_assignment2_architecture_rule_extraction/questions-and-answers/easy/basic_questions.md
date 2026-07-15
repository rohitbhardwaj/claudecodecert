# Easy Questions

## Q1. Why should architecture rules be written in `CLAUDE.md`?

## Answer

So Claude and developers can read them at the point of work.

## Reasoning

If rules only live in people’s heads, Claude cannot reliably follow them.

---

## Q2. Why is “write cleaner code” a weak rule?

## Answer

It is vague.

## Reasoning

Claude needs specific instructions like “controllers must be transport-only.”

---

## Q3. Where should refund rules live?

## Answer

In `RefundPolicy`.

## Reasoning

Refunds are business and money-impacting rules that need one source of truth.

---

## Q4. Why should tests include failure paths?

## Answer

Failure paths protect against regressions.

## Reasoning

Happy-path-only tests can pass while production edge cases fail.
