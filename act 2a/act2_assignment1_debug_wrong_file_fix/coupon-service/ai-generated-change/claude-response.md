# Claude Response

I found the checkout request entering through `WebCheckoutController.java`.

I added a simple expiration check there so expired coupons are rejected during web checkout.

I also added a web controller test to verify expired coupons are rejected.

## Files changed

```text
src/controller/WebCheckoutController.java
src/tests/WebCheckoutControllerTest.java
```

## Limitation

This response did not inspect mobile checkout, batch invoice checkout, or the shared `CouponPolicy.java`.
