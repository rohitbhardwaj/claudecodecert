# Repo Map

## Entry Points

```text
WebCheckoutController
MobileCheckoutController
InvoiceCheckoutJob
```

## Shared Service

```text
CheckoutService
```

## Shared Business Rule

```text
CouponPolicy
```

## Correct Flow

```text
WebCheckoutController ─┐
MobileCheckoutController ├── CheckoutService ─── CouponPolicy
InvoiceCheckoutJob ──────┘
```

## Correct Fix Location

```text
CouponPolicy.java
```
