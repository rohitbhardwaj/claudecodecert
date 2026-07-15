# Approval Evidence Checklist

Before Claude edits files, the plan must include:

```text
[ ] Current refund behavior
[ ] Proposed partial refund behavior
[ ] Refund calculation rules
[ ] Edge cases
[ ] Payment gateway capture/refund behavior
[ ] Payment gateway timeout and retry behavior
[ ] API response and error-code impact
[ ] Data model and repository impact
[ ] Logging and PII safety
[ ] Tests for happy path
[ ] Tests for failure path
[ ] Tests for edge cases
[ ] Tests for payment gateway timeout
[ ] Rollback or feature flag plan
[ ] PR slicing plan
[ ] Approval owners
```

## Strong Rule

```text
If the plan does not explain failure behavior, it is not ready for implementation.
```
