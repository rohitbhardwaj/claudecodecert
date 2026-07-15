# Completed Debug Worksheet — Strong Example

| Debug area | What happened? | Why is it wrong? | Correct repo-aware action |
|---|---|---|---|
| Entry point | Claude patched `WebCheckoutController` | It only affects web checkout | Map all entry points first |
| Business rule location | Expiration logic added to controller | Coupon expiration is a domain rule | Fix `CouponPolicy.java` |
| Web checkout | Web expired coupons are blocked | Web-only behavior creates inconsistency | Keep web using shared policy |
| Mobile checkout | Mobile still accepts expired coupons | It bypasses the web controller patch | Add mobile test and fix policy |
| Batch checkout | Batch still accepts expired coupons | Batch flow also relies on shared policy | Add batch test and fix policy |
| Tests | Only web controller test added | Narrow tests miss shared rule failure | Add policy, web, mobile, batch tests |
| Prompt/context | Claude was not asked to inspect all entry points | Context was too narrow | Ask for repo map before editing |
| Review process | No blast-radius review | Reviewer missed inconsistent behavior | Require repo map and cross-flow tests |
