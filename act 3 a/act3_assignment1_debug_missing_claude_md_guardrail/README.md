# Act 3 Assignment 1 — Debug the Missing `CLAUDE.md` Guardrail

## Theme

When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.

## Scenario

A team asks Claude Code:

```text
Add order cancellation support to checkout.
```

Claude inspects the repo and finds business logic scattered across controllers, services, and utility classes.

Because `CLAUDE.md` is missing or weak, Claude follows the messy pattern and adds cancellation logic directly into `CheckoutController.java`.

The code compiles and the happy-path test passes, but the implementation creates architecture drift.

## Production Symptoms

```text
Web checkout cancellation works.
Mobile cancellation behaves differently.
Batch cancellation is not supported.
Refund logic is duplicated.
Cancellation reason codes are inconsistent.
Controller now contains business rules.
No CODEOWNERS approval was requested.
```

## Architect Task

Participants debug why Claude placed logic in the wrong layer and identify what `CLAUDE.md` should have said.

## Key Lesson

```text
When repo guidance is missing, Claude learns from the code it sees — even when the code is architecturally wrong.
```

## Included Artifacts

- Assignment instructions
- Participant worksheet
- Bug finding guide
- Strong sample answer
- Correct `CLAUDE.md` guide
- Facilitator guide
- Debrief script
- Scoring rubric
- Review checklist
- Prompt examples
- One-page handout
- Complete `checkout-cancellation-repo` source simulation
- `CLAUDE.md` and `CLAUDE.bad.md`
- Source files for controllers, batch processor, services, domain policies, and tests
- AI-generated bad diff and Claude response
- Production symptoms and architecture drift notes
- Certification-style Q&A with answers and reasoning
