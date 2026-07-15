# Completed Debug Worksheet — Strong Example

| Debug area | What changed? | Why is it risky? | What should have happened? |
|---|---|---|---|
| Coupon validation | Expiration check removed/weakened | Expired coupons can be accepted | Preserve expiration behavior and add test |
| Enterprise customer logic | Eligibility changed from strict active enterprise to weak type check | Some valid enterprise customers rejected and some invalid customers may pass | Preserve business rule and add characterization tests |
| Payment error mapping | `PAYMENT_DECLINED` maps to `CHECKOUT_FAILED` | Clients/support lose specific error signal | Preserve public error code |
| Logging / reason codes | Reason code removed from logs | Support cannot trace failures | Log safe reason code and correlation ID |
| Tests | Failure-path test removed/weakened | Regression escaped happy-path tests | Never remove failing tests silently |
| Prompt quality | “Fix any tests that fail” | Encourages weakening tests | Ask for analysis and test plan first |
| Review process | No blast-radius or rollback review | Risky production change approved | Require checkout/payment owner review and rollback |
