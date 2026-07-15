# Bad Prompt Analysis

## Original Prompt

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

## Why This Prompt Is Unsafe

| Problem | Why it matters |
|---|---|
| Vague objective | “Clean up” does not define success |
| Optimizes for simplicity | Business rules may be removed or collapsed |
| No behavior preservation | Existing edge cases may silently change |
| No file/context list | Claude may miss API contracts, tests, incident notes, or repo rules |
| No failure-path protection | Happy-path tests may pass while regressions escape |
| “Fix any tests that fail” | Encourages weakening/removing tests |
| No risk analysis | Payment, API, observability, and customer eligibility impacts may be missed |
| No approval checkpoint | Claude may implement risky changes without human review |
| No rollback | Production recovery is not considered |

## Better Prompt Shape

```text
Do not edit yet.
Analyze first.
Inspect the right files.
Preserve behavior.
Identify risks and tests.
Return a plan.
Wait for approval.
```
