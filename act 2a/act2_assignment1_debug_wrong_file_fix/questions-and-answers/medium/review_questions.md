# Medium Questions

## Q1. What should the reviewer have asked before approving?

## Answer

The reviewer should have asked:

```text
What are all checkout entry points?
Where is the shared coupon validation rule?
Do mobile and batch flows use the same policy?
Are there tests for all flows?
Does this PR move business logic into the controller?
```

## Reasoning

A repo-aware fix requires understanding the blast radius, not just the edited file.

---

## Q2. What tests should have been required?

## Answer

At minimum:

```text
CouponPolicyTest rejects expired coupon.
WebCheckoutControllerTest rejects expired coupon.
MobileCheckoutTest rejects expired coupon.
InvoiceCheckoutJobTest rejects expired coupon.
```

## Reasoning

The policy test proves the shared rule. The flow tests prove all entry points use it correctly.

---

## Q3. What was wrong with the Claude context?

## Answer

Claude was not asked to inspect:

```text
MobileCheckoutController
InvoiceCheckoutJob
CouponPolicy
all related tests
repo map
```

## Reasoning

Incomplete context caused Claude to patch the visible symptom instead of the root cause.

---

## Q4. How should the PR be rewritten?

## Answer

The PR should:

```text
fix CouponPolicy.java
remove controller-level expiration logic
add cross-flow tests
include blast-radius notes
identify domain owner approval
```

## Reasoning

That aligns the implementation with the shared domain rule.
