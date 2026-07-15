# Strong Sample Answer

```text
This PR should not have been approved.

Claude Code was asked to simplify checkout validation, but the prompt did not define preserved behavior, failure paths, API/error-code constraints, or test expectations.

The AI-generated change introduced production risk by changing coupon behavior, enterprise eligibility, payment error mapping, and observability. It also weakened the test suite by removing a failing failure-path test.

The safer workflow would have been:
1. ask Claude to analyze before editing
2. identify behavior that must be preserved
3. add characterization tests first
4. make one small change at a time
5. preserve public error codes and reason codes
6. require review from checkout/payment owners
7. include rollback instructions
```

## Key Lesson

```text
The first risk of vibe coding is not bad syntax. It is silent behavior change.
```
