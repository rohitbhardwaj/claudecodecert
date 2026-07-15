# Rule Extraction Playbook

## Step 1 — Find Repeated Review Feedback

Look for old PR comments like:

```text
Do not put refund rules in controllers.
Use reason-code enum.
Add failure-path tests.
Do not log customer email.
```

## Step 2 — Convert Feedback into Rules

Bad:

```text
Clean this up.
```

Good:

```text
Controllers must remain transport-only. Business rules belong in domain policies.
```

## Step 3 — Place Rules Where Claude Can Use Them

Use:

```text
CLAUDE.md
architecture docs
security policy
PR template
CODEOWNERS
CI checks
```

## Step 4 — Make Rules Specific and Testable

A good rule answers:

```text
What should be done?
Where should it live?
What should not happen?
Who approves?
What tests are required?
```

## Step 5 — Add Examples

Claude performs better when rules include examples.

Example:

```text
Refund calculations belong in RefundPolicy. Do not duplicate refund logic in CheckoutController or RefundService.
```
