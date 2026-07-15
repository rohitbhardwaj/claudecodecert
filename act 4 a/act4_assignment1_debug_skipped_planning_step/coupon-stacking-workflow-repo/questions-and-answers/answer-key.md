# All Questions and Answers

## Easy

### Why is editing before planning risky?

Because scope, risks, tests, owners, and rollback are not agreed.

### What should Claude do before editing?

Analyze the repo and return a plan.

### Why is a large PR risky?

It is hard to review and may mix unrelated changes.

### Why is rollback required?

Production changes can fail and need recovery.

## Medium

### Why involve pricing/finance owners?

Coupon stacking affects money behavior.

### Why is rewriting a failing pricing test risky?

It can hide a real defect.

### Why inspect mobile checkout?

Behavior must be consistent across entry points.

### Why inspect API contract?

Response fields or totals may change and affect clients.

## Advanced

### Approval to plan vs approval to merge?

Plan approval allows implementation; merge approval requires evidence the diff matches the plan.

### How slice the change?

Characterization tests, policy, pricing integration, API update if approved, rollout docs.

### Why feature flag?

To safely roll out or disable coupon stacking.

### Deeper certification lesson?

Governed AI workflows are evaluated by evidence and checkpoints.

## Certification Style

### Primary failure when Claude edits five files before plan?

Skipped planning and approval checkpoint.

### Which owner for pricing/refund impact?

Pricing/finance and architecture owners.

### Rewritten failing pricing test?

Request changes; do not hide defects.

### Best planning artifact?

Plan listing affected files, risks, tests, owners, and rollback.

### Mobile and web totals differ?

Cross-entry-point context and tests were missed.

### No rollback plan?

Request rollback or feature flag plan.

### Governed workflow?

Plan → Context → Approval → Implementation → Tests → Review → Merge.
