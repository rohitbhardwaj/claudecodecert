# Bug Hunt Checklist

Use this checklist while reviewing the source repo.

```text
[ ] Did Claude fix only web checkout?
[ ] Is the real coupon expiration rule still wrong?
[ ] Do mobile and batch flows still accept expired coupons?
[ ] Did business validation move into the controller?
[ ] Were tests added only for web checkout?
[ ] Did Claude inspect all entry points?
[ ] Did the PR include a repo map?
[ ] Did the PR include a blast-radius review?
```

## Final Question

```text
Where is the shared source of truth?
```
