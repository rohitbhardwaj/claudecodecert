# Context Selection Checklist

Before asking Claude to change code, confirm:

```text
[ ] All user-facing entry points are included.
[ ] Non-user-facing batch or async flows are included.
[ ] Shared domain policies are included.
[ ] Pricing or money-impacting services are included.
[ ] API contract is included.
[ ] Existing tests are included.
[ ] Security/logging policy is included.
[ ] Feature flags and rollback docs are included.
[ ] CODEOWNERS is included.
[ ] CLAUDE.md is included.
```

## Final Check

```text
Can Claude explain the full blast radius before writing code?
```
