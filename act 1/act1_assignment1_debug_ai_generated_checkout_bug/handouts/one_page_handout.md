# One-Page Handout — Debug the AI-Generated Checkout Bug

## Scenario

Claude Code was asked to simplify checkout validation.

Production symptoms:

```text
expired coupons accepted
valid enterprise customers rejected
payment decline shown as generic error
reason-code logs removed
failing test removed
```

## Bad Prompt

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

## Key Lesson

```text
The first risk of vibe coding is not bad syntax. It is silent behavior change.
```

## Safer Pattern

```text
Analyze before editing.
Preserve behavior.
Add characterization tests.
Make small changes.
Preserve error codes and reason codes.
Require owner review.
Include rollback.
```
