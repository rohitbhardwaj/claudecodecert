# CLAUDE.md

## Repo Rules for Claude

Before changing checkout coupon behavior, Claude must inspect:

```text
all checkout entry points
shared coupon policy
enterprise customer policy
pricing service
API contract
existing tests
logging policy
feature flags and rollback
CODEOWNERS
```

Claude must not implement until the context map is approved.

## Architecture Rule

Business rules belong in domain policies and pricing services, not controllers.
