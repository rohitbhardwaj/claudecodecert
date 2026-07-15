# Act 2 Assignment 1 — Debug the Wrong File Fix

## Theme

Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.

## Scenario

A developer asks Claude Code:

```text
Fix the issue where expired coupons are still accepted during checkout.
```

Claude Code edits `WebCheckoutController.java` because that is where the request enters the system.

The happy-path test passes, but the bug still exists in other flows.

## Production Symptoms

```text
Expired coupons are blocked in web checkout.
Expired coupons are still accepted in mobile checkout.
Expired coupons are still accepted in batch invoice checkout.
The controller now contains business validation logic.
The real bug in CouponPolicy.java remains unfixed.
```

## Architect Task

Participants debug why Claude fixed the wrong file and identify the correct repo-aware fix.

## Key Lesson

```text
Repo-aware work means finding the shared source of truth, not patching the first file Claude sees.
```

## Included Artifacts

- Assignment instructions
- Participant worksheet
- Bug finding guide
- Strong sample answer
- Safer workflow guide
- Facilitator guide
- Debrief script
- Scoring rubric
- Review checklist
- Prompt examples
- One-page handout
- Complete `coupon-service` source simulation
- AI-generated bad diff and Claude response
- Incident symptoms and repo map
- Dedicated `questions-and-answers/` directory with easy, medium, and advanced Q&A
