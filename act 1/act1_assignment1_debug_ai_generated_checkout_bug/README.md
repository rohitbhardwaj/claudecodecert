# Act 1 Assignment 1 — Debug the AI-Generated Checkout Bug

## Theme

The first risk of vibe coding is not bad syntax. It is silent behavior change.

## Scenario

A developer used Claude Code to:

```text
clean up and simplify checkout validation
```

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

Participants debug the AI-generated change and decide whether the PR should have been approved.

## Key Lesson

```text
The first risk of vibe coding is not bad syntax. It is silent behavior change.
```

## Included Artifacts

- Assignment instructions
- Participant debug worksheet
- Strong sample answer
- Facilitator guide
- Debrief script
- Scoring rubric
- Bug finding guide
- Safer workflow guide
- Prompt critique
- Review checklist
- Source repo simulation:
  - `before/`
  - `after-ai-generated/`
  - `incident/`
  - `worksheets/`
  - PR template
  - CI workflow
