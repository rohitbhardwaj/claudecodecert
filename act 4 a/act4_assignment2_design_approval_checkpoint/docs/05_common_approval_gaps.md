# Common Approval Gaps

## Gap 1 — Happy Path Only

Claude describes successful partial refund but omits failures.

Risk:

```text
payment gateway timeouts, duplicate refunds, and retries may behave incorrectly
```

## Gap 2 — Money Logic Without Finance Owner

Risk:

```text
refund amounts may be wrong or violate policy
```

## Gap 3 — API Change Without API Owner

Risk:

```text
clients may break or misinterpret refund status
```

## Gap 4 — Data Change Without Data Owner

Risk:

```text
order state or refund audit fields may be missing
```

## Gap 5 — Logging Without Security Review

Risk:

```text
customer PII or payment data could be logged
```

## Gap 6 — No Rollback

Risk:

```text
partial refund failures cannot be safely disabled or reverted
```
