# Medium Questions

## Q1. Why must payment gateway timeout behavior be included?

## Answer

Refunds may fail or partially complete when the gateway times out.

## Reasoning

Timeouts can cause duplicate refunds, missing refunds, or unclear order states.

---

## Q2. Why include API contract impact?

## Answer

Clients may need new refund status, amount, or error-code fields.

## Reasoning

Public API changes require API owner review and contract tests.

---

## Q3. Why include data/repository impact?

## Answer

Partial refunds may require audit fields or refund state tracking.

## Reasoning

Without data support, the system may not prove what refund occurred.

---

## Q4. Why include logging/security?

## Answer

Refund logs can expose sensitive customer or payment data.

## Reasoning

Logs should use reason codes and correlation IDs, not PII.
