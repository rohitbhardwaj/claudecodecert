# CLAUDE.md

## Architecture Boundaries

Controllers are transport-only.

Cancellation business rules belong in:

```text
src/domain/OrderCancellationPolicy.java
```

Cancellation orchestration belongs in:

```text
src/service/CancellationService.java
```

Refund calculations belong in:

```text
src/domain/RefundPolicy.java
```

## Before Editing Checkout Behavior

Claude must inspect:

```text
CheckoutController
MobileCheckoutController
BatchOrderProcessor
CheckoutService
CancellationService
OrderCancellationPolicy
RefundPolicy
all related tests
CODEOWNERS
```

## Required Behavior

```text
web, mobile, and batch behavior must be consistent
reason codes must use approved values
refund logic must not be duplicated
```

## Required Plan

Claude must return an implementation plan before editing files.

## Never

```text
Do not add business rules to controllers.
Do not duplicate refund calculations.
Do not invent new reason codes without approval.
Do not remove or weaken tests.
```
