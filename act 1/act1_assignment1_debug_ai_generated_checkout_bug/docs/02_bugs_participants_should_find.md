# Bugs Participants Should Find

| Area | Problem |
|---|---|
| Coupon validation | AI simplified logic and accidentally accepts expired coupons |
| Enterprise customer logic | AI inverted or weakened eligibility check |
| Payment mapping | Specific `PAYMENT_DECLINED` becomes generic `CHECKOUT_FAILED` |
| Observability | Original reason code removed from logs |
| Tests | Failure-path test removed or weakened |
| Prompt | “Fix any tests that fail” encouraged unsafe test changes |
| Review | No blast-radius review, no failure-path review, no rollback note |

## Expected PR Decision

```text
This PR should not have been approved.
```

## Strong Reason

The AI-generated change introduced silent behavior changes across coupon validation, enterprise customer eligibility, payment error mapping, observability, and test coverage.
