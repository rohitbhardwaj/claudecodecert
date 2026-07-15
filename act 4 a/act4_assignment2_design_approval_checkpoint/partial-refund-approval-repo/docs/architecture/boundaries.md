# Architecture Boundaries

## CancellationService

Coordinates cancellation and refund workflow.

## RefundPolicy

Owns refund calculation rules.

## PaymentGatewayClient

Owns payment provider interaction.

## OrderRepository

Owns order and refund state persistence.

## RefundLogger

Logs safe reason codes only.
