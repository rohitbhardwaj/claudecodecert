# Bug Hunt Checklist

Use this while comparing `before/` and `after-ai-generated/`.

```text
[ ] Did coupon expiration behavior change?
[ ] Did enterprise eligibility behavior change?
[ ] Did payment error mapping change?
[ ] Did logs lose reason code detail?
[ ] Were failure-path tests removed?
[ ] Were test assertions weakened?
[ ] Did the PR description explain behavior preservation?
[ ] Was there a rollback note?
[ ] Were checkout/payment owners identified?
```

## Final Question

```text
Would you trust this PR in production?
```
