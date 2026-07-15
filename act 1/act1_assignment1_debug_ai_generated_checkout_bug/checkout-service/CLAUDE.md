# CLAUDE.md

## Checkout Refactor Rules

Claude must not change production behavior during cleanup unless explicitly approved.

Preserve:

```text
coupon expiration checks
enterprise customer eligibility
payment error codes
reason-code logging
failure-path tests
```

Claude must not:

```text
remove failing tests silently
weaken assertions
collapse public error codes
remove reason-code logs
```

Claude must analyze before editing and wait for approval before implementation.
