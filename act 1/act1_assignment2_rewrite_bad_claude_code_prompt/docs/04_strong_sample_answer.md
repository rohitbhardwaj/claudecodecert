# Strong Sample Answer

```text
Do not modify files yet.

Analyze the checkout validation logic and identify opportunities to simplify it without changing production behavior.

Inspect:
- CLAUDE.md
- CheckoutService.java
- CouponPolicy.java
- EnterpriseCustomerPolicy.java
- PaymentResultMapper.java
- CheckoutServiceTest.java
- API error-code contract if present
- recent production incident notes if present

Return:
1. current behavior summary
2. behavior that must be preserved
3. failure paths that must remain tested
4. risky areas where simplification could change behavior
5. proposed small implementation plan
6. tests to add before code changes
7. approval owners needed
8. rollback considerations

Do not remove or weaken failing tests.
Do not change public error codes.
Do not remove reason-code logging.
Do not change enterprise eligibility logic unless explicitly approved.

Wait for human approval before editing files.
```

## Key Lesson

```text
Good Claude Code usage starts with a constrained analysis prompt, not an implementation command.
```
