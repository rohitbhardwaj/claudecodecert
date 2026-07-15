# Support Ticket Examples

## Ticket 1

```text
Customer used an expired coupon and still received a discount.
Expected: INVALID_COUPON.
Actual: checkout succeeded.
```

## Ticket 2

```text
Enterprise customer with active agreement could not check out.
Expected: success.
Actual: CHECKOUT_FAILED.
```

## Ticket 3

```text
Payment was declined by issuer, but customer saw generic checkout failure.
Expected: PAYMENT_DECLINED.
Actual: CHECKOUT_FAILED.
```

## Ticket 4

```text
Support searched logs for reasonCode but new logs only show "checkout_failed".
Expected: checkout_failed reasonCode=PAYMENT_DECLINED.
Actual: checkout_failed.
```
