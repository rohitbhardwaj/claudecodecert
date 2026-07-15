# CLAUDE.md

## Checkout Validation Rules

Claude must preserve:

```text
coupon expiration behavior
enterprise customer eligibility
payment error codes
reason-code logging
failure-path tests
```

Claude must not:

```text
remove failing tests
weaken assertions
collapse public error codes
remove reason-code logging
change enterprise eligibility without approval
```

Claude must analyze before editing and wait for approval.
