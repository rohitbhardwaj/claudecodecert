# Bug Hunt Checklist

```text
[ ] Is `CLAUDE.md` weak or missing architecture boundaries?
[ ] Did Claude add business logic to the controller?
[ ] Did Claude bypass OrderCancellationPolicy?
[ ] Did Claude duplicate RefundPolicy logic?
[ ] Are web, mobile, and batch flows inconsistent?
[ ] Are cancellation reason codes inconsistent?
[ ] Was CODEOWNERS checked?
[ ] Were only web happy-path tests added?
[ ] Did Claude return a plan before editing?
```

## Final Question

```text
Did Claude follow documented architecture or infer architecture from messy code?
```
