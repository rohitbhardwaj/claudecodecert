# Strong Sample Answer

| Repo area | Include in context? | Why? |
|---|---|---|
| Web checkout controller | Yes | One checkout entry point |
| Mobile checkout controller | Yes | Separate checkout path |
| Batch invoice job | Yes | Non-user-facing path may share policy |
| CouponPolicy | Yes | Likely source of coupon business rule |
| EnterpriseCustomerPolicy | Yes | Determines enterprise eligibility |
| PricingService | Yes | Discount changes final amount |
| API contract | Yes | Response may need rejection reason or discount fields |
| Existing tests | Yes | Preserve current behavior |
| Logging policy | Yes | Avoid PII and preserve reason codes |
| Feature flags / rollback | Yes | Production-safe rollout |
| CODEOWNERS | Yes | Identify approvers |
| CLAUDE.md | Yes | Repo-specific rules for Claude |

## Key Lesson

```text
Before Claude Code edits the repo, architects must decide what context the repo must provide.
```
