# All Questions and Answers

## Easy

### Why is fixing `WebCheckoutController.java` not enough?

Because web checkout is only one entry point. Mobile and batch flows still use the broken shared policy.

### Where should the expired coupon rule live?

In `CouponPolicy.java`, because coupon expiration is a shared business rule.

### Why did the happy-path test pass?

Because it tested only the patched web path.

### Should the PR have been approved?

No. It fixed only one path and moved business logic into the controller.

## Medium

### What should the reviewer have asked?

What are all entry points, where is the shared policy, and are all flows tested?

### What tests should be required?

Policy, web, mobile, and batch expired-coupon tests.

### What was wrong with the Claude context?

It did not include all entry points, policy files, tests, or repo map.

### How should the PR be rewritten?

Fix `CouponPolicy.java`, remove controller logic, add cross-flow tests, and document blast radius.

## Advanced

### Is controller validation ever acceptable?

Only as a temporary defensive check, not as the source of truth.

### What is the architectural smell?

Business logic in the transport/controller layer.

### What is the deeper Claude Code lesson?

Repo-aware prompting must direct Claude to find shared source of truth.

### What should `CLAUDE.md` say?

Coupon rules belong in `CouponPolicy`; inspect all flows before editing checkout behavior.
