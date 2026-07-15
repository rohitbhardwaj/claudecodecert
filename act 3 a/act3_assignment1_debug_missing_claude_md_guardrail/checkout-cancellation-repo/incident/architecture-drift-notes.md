# Architecture Drift Notes

## Drift 1 — Business Logic in Controller

Cancellation rules were placed in `CheckoutController.java`.

Expected:

```text
OrderCancellationPolicy
CancellationService
```

## Drift 2 — Refund Logic Duplicated

Refund calculation was copied into the controller.

Expected:

```text
RefundPolicy
```

## Drift 3 — Inconsistent Entry Points

Web path changed.

Mobile and batch were not updated consistently.

## Drift 4 — Weak Governance

`CLAUDE.bad.md` did not define architecture boundaries.

CODEOWNERS was not checked.
