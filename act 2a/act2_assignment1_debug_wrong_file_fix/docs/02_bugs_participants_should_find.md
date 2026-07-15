# Bugs Participants Should Find

| Area | Problem |
|---|---|
| Wrong layer | Claude added expiration validation in `WebCheckoutController` |
| Root cause missed | `CouponPolicy.java` still accepts expired coupons |
| Inconsistent behavior | Web fixed, mobile and batch still broken |
| Architecture drift | Business rule moved into controller |
| Tests too narrow | Only web controller test added |
| Context too narrow | Claude was not asked to inspect all checkout entry points |
| Review gap | No repo map or blast-radius review |

## Expected PR Decision

```text
The PR should not have been approved.
```
