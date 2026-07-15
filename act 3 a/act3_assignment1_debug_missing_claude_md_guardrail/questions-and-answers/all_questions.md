# All Questions and Answers

## Easy

### Why is weak CLAUDE.md risky?

Because Claude may infer architecture from messy code.

### Why is business logic in a controller risky?

Because controllers are entry points, not business-rule owners.

### Where should cancellation rules live?

In `OrderCancellationPolicy` and orchestration through `CancellationService`.

### Should the PR have been approved?

No.

## Medium

### What should CLAUDE.md have said?

Architecture boundaries, required context, tests, owners, and plan-before-edit rules.

### Why is refund duplication dangerous?

Refund behavior can diverge and affect money.

### Why are reason codes important?

They support observability, support, and incident debugging.

### Why should CODEOWNERS be checked?

Owner review is needed for behavior changes.

## Advanced

### Is CLAUDE.md enough?

No. It needs CODEOWNERS, PR template, tests, CI, docs, and review discipline.

### What is the deeper architecture smell?

Lack of clear boundaries and source-of-truth policies.

### What if code conflicts with CLAUDE.md?

Follow documented architecture and flag messy code as technical debt.

### How is this cert-ready?

It tests wrong layer, missing guardrails, owner review, tests, and first-action judgment.

## Certification Style

### Primary architectural concern when Claude adds business logic to controller?

Business rules moved into the transport layer.

### Best first action before implementation?

Inspect CLAUDE.md, architecture docs, entry points, policies, tests, and CODEOWNERS.

### Best improvement for weak CLAUDE.md?

Define architecture boundaries and safe/ask/never rules.

### Main risk of duplicated refund logic?

Refund behavior may diverge from shared policy.

### Missing tests after web happy-path only?

Mobile, batch, domain policy, and refund behavior tests.

### Governance response when CODEOWNERS not triggered?

Request owner review before merge.

### Main lesson?

Repo guidance must tell Claude how engineering is supposed to work.
