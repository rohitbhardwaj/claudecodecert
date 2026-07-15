# Strong Sample Answer

```text
The PR should not have been approved.

Claude followed the messy visible code pattern because the repo did not clearly describe architecture boundaries.

Cancellation rules belong in OrderCancellationPolicy and CancellationService, not in CheckoutController.

A strong CLAUDE.md should have told Claude:
1. controllers are transport-only
2. cancellation business rules belong in domain policy
3. refund calculations belong in RefundPolicy
4. all checkout entry points must be inspected
5. reason codes must be consistent
6. CODEOWNERS must be checked before behavior changes
7. tests must cover web, mobile, batch, domain policy, and refund behavior
8. Claude must return a plan before editing
```

## Key Lesson

```text
When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.
```
