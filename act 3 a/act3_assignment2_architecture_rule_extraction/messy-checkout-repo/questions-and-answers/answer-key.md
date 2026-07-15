# All Questions and Answers

## Easy

### Why should architecture rules be written in CLAUDE.md?

So Claude and developers can read them at the point of work.

### Why is “write cleaner code” weak?

It is vague and not enforceable.

### Where should refund rules live?

In `RefundPolicy`.

### Why should tests include failure paths?

They protect against regressions.

## Medium

### Why should CODEOWNERS cover domain policies?

Domain policies change business behavior and need architecture review.

### Why is direct data access from service risky?

It bypasses repository abstractions and creates hidden coupling.

### Why standardize reason codes?

For consistent API behavior, support, and observability.

### Why put rollback rules in PR template and runbook?

To make production recovery reviewable and actionable.

## Advanced

### CLAUDE.md or CI?

Use CLAUDE.md for guidance and CI for enforceable automated checks.

### How do you convert PR comments into governance?

Find repeated comments, make specific rules, add them to repo artifacts, and enforce where possible.

### Main risk of tribal knowledge?

It does not scale to new developers or AI tools.

### Why cert-ready?

Certification questions test governance and architecture judgment.

## Certification Style

### Where capture “do not put refund rules in controllers”?

`CLAUDE.md` and architecture docs.

### Most appropriate CLAUDE.md rule?

“Controllers must remain transport-only; business rules belong in domain policies.”

### Prevent fourth copy of refund logic?

Add source-of-truth rule: refund behavior belongs in `RefundPolicy`.

### Prevent direct DB utility calls?

Services must use repository abstraction.

### Prevent reason-code drift?

Use approved reason-code enum or API contract values.

### Route domain policy changes?

CODEOWNERS.

### Strongest test rule?

Add happy, failure, and edge-case tests; do not remove or weaken existing tests.

### Capture rollback expectations?

PR template and rollback runbook.
