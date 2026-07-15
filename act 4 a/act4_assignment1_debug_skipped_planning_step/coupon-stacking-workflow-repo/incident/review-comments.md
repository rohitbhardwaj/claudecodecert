# Review Comments

## Architecture Reviewer

This PR should have started with a plan. Coupon stacking affects pricing, refunds, API response, and multiple checkout entry points.

## Pricing Reviewer

The implementation appears to apply discounts twice for some combinations.

## QA Reviewer

A failing pricing test was rewritten. Please restore the original intent and add failure-path tests.

## API Owner

API response appears to have changed without approval.

## SRE

No rollback or feature flag plan is included.
