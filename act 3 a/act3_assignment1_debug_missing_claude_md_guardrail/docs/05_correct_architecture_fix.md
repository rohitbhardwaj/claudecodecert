# Correct Architecture Fix

## Wrong Implementation

Claude placed cancellation logic in:

```text
CheckoutController.java
```

## Correct Design

Cancellation should flow through:

```text
CheckoutController
MobileCheckoutController
BatchOrderProcessor
        ↓
CancellationService
        ↓
OrderCancellationPolicy
RefundPolicy
```

## Correct Responsibilities

| Component | Responsibility |
|---|---|
| `CheckoutController` | HTTP request/response only |
| `MobileCheckoutController` | Mobile request/response only |
| `BatchOrderProcessor` | Batch entry point only |
| `CancellationService` | Orchestrates cancellation |
| `OrderCancellationPolicy` | Determines whether order can be cancelled |
| `RefundPolicy` | Calculates refund behavior |
| Tests | Verify web, mobile, batch, domain policy, refund behavior |

## Required Tests

```text
web cancellation works
mobile cancellation works consistently
batch cancellation supported or explicitly rejected
policy rejects shipped orders
refund policy calculates correct refund
reason codes are consistent
```
