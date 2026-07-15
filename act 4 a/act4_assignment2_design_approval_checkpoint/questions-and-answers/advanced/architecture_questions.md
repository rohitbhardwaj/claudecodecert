# Advanced Questions

## Q1. What makes an approval checkpoint implementation-ready?

## Answer

It includes behavior, risks, tests, owners, rollback, and open questions.

## Reasoning

Implementation should begin only after key uncertainty is resolved or explicitly accepted.

---

## Q2. How should partial refunds be sliced into PRs?

## Answer

Example sequence:

```text
PR 1: characterization tests and API decision
PR 2: RefundPolicy calculation rules
PR 3: PaymentGatewayClient integration
PR 4: repository/audit fields if needed
PR 5: logging and rollback docs
```

## Reasoning

Small PRs reduce risk and simplify owner review.

---

## Q3. What is the difference between owner approval and reviewer approval?

## Answer

Reviewer approval checks code quality. Owner approval accepts domain-specific risk.

## Reasoning

Payments, API, security, and data owners understand risks that general reviewers may miss.

---

## Q4. What is the certification lesson?

## Answer

The right answer is usually the one that asks for explicit evidence before implementation.

## Reasoning

Certification scenarios test governance judgment and risk recognition.
