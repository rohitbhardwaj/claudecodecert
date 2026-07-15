# Common Mistakes

## Mistake 1 — Only Include Web Checkout

Why it is wrong:

```text
Enterprise-only coupons may also apply to mobile and batch invoice checkout.
```

## Mistake 2 — Skip Pricing

Why it is wrong:

```text
Coupons change final amount and may affect tax, payment, and refunds.
```

## Mistake 3 — Skip API Contract

Why it is wrong:

```text
The response may need discount reason, rejection reason, or discount amount fields.
```

## Mistake 4 — Skip Existing Tests

Why it is wrong:

```text
Without tests, Claude may change existing behavior without noticing.
```

## Mistake 5 — Skip Logging Policy

Why it is wrong:

```text
Enterprise customer data may be sensitive. Logs should use reason codes, not PII.
```

## Mistake 6 — Skip CODEOWNERS

Why it is wrong:

```text
Architects need to know who must approve API, pricing, security, and rollout changes.
```
