# Advanced Questions

## Q1. What is the difference between approval to plan and approval to merge?

## Answer

Approval to plan allows implementation. Approval to merge requires evidence that the diff matches the approved plan.

## Reasoning

Implementation can drift from the approved scope.

---

## Q2. How should this change be sliced?

## Answer

One possible sequence:

```text
PR 1: characterization tests
PR 2: CouponStackingPolicy
PR 3: pricing integration
PR 4: API/response update if approved
PR 5: rollout/rollback docs
```

## Reasoning

Small PRs reduce review risk and make rollback easier.

---

## Q3. Why is feature flagging useful here?

## Answer

Coupon stacking can affect customer totals.

## Reasoning

A feature flag allows safe rollout or quick disablement.

---

## Q4. What is the deeper certification lesson?

## Answer

Governed AI workflows are evaluated by evidence and control points, not just generated code.

## Reasoning

Certification-style scenarios test whether candidates know when to stop, plan, approve, review, and merge.
