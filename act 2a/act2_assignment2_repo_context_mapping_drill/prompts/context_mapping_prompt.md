# Safe Context Mapping Prompt

```text
Do not modify files yet.

For the task "Add support for enterprise-only coupons during checkout," map the repository context that must be inspected before implementation.

Inspect:
- CLAUDE.md
- CODEOWNERS
- web checkout controller
- mobile checkout controller
- batch invoice job
- checkout service
- CouponPolicy
- EnterpriseCustomerPolicy
- PricingService
- API contract
- existing tests
- logging policy
- feature flags and rollback docs

Return:
1. all affected entry points
2. shared source-of-truth policies
3. pricing/API/logging/rollback impacts
4. tests that must be preserved or added
5. approval owners
6. files to include in implementation context
7. files that should not be edited without approval

Do not implement until the context map is approved.
```
