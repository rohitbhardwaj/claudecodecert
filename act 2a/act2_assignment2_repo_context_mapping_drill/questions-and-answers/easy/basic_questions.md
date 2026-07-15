# Easy Questions

## Q1. Why include web, mobile, and batch checkout?

## Answer

Because enterprise-only coupons may be used through more than one checkout path.

## Simple Reasoning

```text
If Claude only sees web checkout, it may fix only web checkout.
```

---

## Q2. Why include `CouponPolicy`?

## Answer

Because coupon rules usually belong in the shared coupon policy.

## Simple Reasoning

```text
The shared policy is the source of truth. Fixing it protects all flows.
```

---

## Q3. Why include `EnterpriseCustomerPolicy`?

## Answer

Because the new coupon is enterprise-only.

## Simple Reasoning

```text
Claude must know how the system decides who is enterprise.
```

---

## Q4. Why include existing tests?

## Answer

To preserve current behavior and find missing coverage.

## Simple Reasoning

```text
Without tests, Claude may accidentally change behavior.
```
