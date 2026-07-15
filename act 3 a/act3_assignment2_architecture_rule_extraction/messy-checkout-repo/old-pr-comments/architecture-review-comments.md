# Old Architecture Review Comments

## PR #182

Please do not put refund rules in controllers. Refund behavior should go through `RefundPolicy`.

## PR #197

CheckoutController is becoming too smart. Controllers should be transport-only.

## PR #205

We keep creating reason-code strings inline. We need approved reason codes.

## PR #219

CheckoutService should not directly create data utilities. Use repository abstraction.

## PR #230

Domain policy changes should have architecture owner review.
