# Approval Checkpoint Prompt

```text
Do not modify files.

Analyze the request: Implement partial refunds for cancelled orders.

Inspect:
- CLAUDE.md
- CODEOWNERS
- CancellationService.java
- RefundPolicy.java
- PaymentGatewayClient.java
- OrderRepository.java
- Checkout API contract
- RefundServiceTest.java
- PaymentGatewayClientTest.java
- logging policy
- rollback runbook

Return an approval checkpoint with:
1. current vs proposed refund behavior
2. refund calculation rules and edge cases
3. payment gateway capture/refund behavior
4. gateway timeout, retry, duplicate-refund handling
5. API response and error-code impact
6. data model/repository impact
7. logging/security plan with no PII
8. tests required
9. rollback/feature flag plan
10. proposed small PR sequence
11. approval owners
12. open questions

Do not implement until the plan is approved.
```
