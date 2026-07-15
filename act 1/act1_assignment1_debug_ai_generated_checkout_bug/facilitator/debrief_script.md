# Debrief Script

## Opening

This PR is dangerous because it appears cleaner while changing behavior.

## Findings

```text
Expired coupons are accepted.
Enterprise customer eligibility was weakened/inverted.
PAYMENT_DECLINED became CHECKOUT_FAILED.
Logs no longer contain original reason codes.
A failure-path test was removed or weakened.
The prompt encouraged unsafe test fixing.
The review missed blast radius and rollback.
```

## Decision

```text
This PR should not have been approved.
```

## Safer Workflow

```text
Analyze first.
Preserve behavior.
Add characterization tests.
Make one small change at a time.
Preserve public error codes and reason codes.
Require owner review.
Include rollback instructions.
```

## Closing Line

The first risk of vibe coding is not bad syntax. It is silent behavior change.
