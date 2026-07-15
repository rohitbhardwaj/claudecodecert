# Assignment Instructions

## Assignment

Debug the AI-generated checkout bug.

## Scenario

A developer used Claude Code to “clean up and simplify checkout validation.”

The PR passed basic happy-path tests, but after deployment, customers started reporting checkout issues.

## Production Symptoms

```text
Some invalid coupons are accepted.
Some valid enterprise customers are rejected.
Payment decline errors are shown as generic checkout failures.
Support cannot trace failures because logs lost the original reason code.
One failing test was removed in the PR.
```

## Developer Prompt

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

## Architect Task

Compare the `before/` and `after-ai-generated/` source files.

Decide:

```text
What changed?
Why is it risky?
Should the PR have been approved?
What safer workflow should have been used?
```

## Key Lesson

```text
The first risk of vibe coding is not bad syntax. It is silent behavior change.
```
