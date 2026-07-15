# Certification-Style Questions

## Question 1

A repo has recurring PR comments saying “do not put refund rules in controllers.” Where should this rule be captured for Claude Code?

A. Only in Slack  
B. Only in a meeting note  
C. `CLAUDE.md` and architecture docs  
D. Nowhere, because reviewers will catch it  

## Correct Answer

C. `CLAUDE.md` and architecture docs

## Reasoning

Claude and developers need repo-readable rules at the point of work.

---

## Question 2

Which rule is most appropriate for `CLAUDE.md`?

A. “Write cleaner code.”  
B. “Controllers must remain transport-only; business rules belong in domain policies.”  
C. “Make the code shorter.”  
D. “Fix tests if they fail.”  

## Correct Answer

B. “Controllers must remain transport-only; business rules belong in domain policies.”

## Reasoning

It is specific, enforceable, and architecture-aligned.

---

## Question 3

Claude sees refund logic in three files and adds a fourth copy. What governance artifact would best prevent this?

A. A rule in `CLAUDE.md` that RefundPolicy is the source of truth  
B. A longer README introduction  
C. A prettier code formatter  
D. A larger controller class  

## Correct Answer

A. A rule in `CLAUDE.md` that RefundPolicy is the source of truth

## Reasoning

Claude needs to know where the business rule belongs.

---

## Question 4

A service directly calls a low-level database utility even though the architecture expects repository abstraction. What should be added?

A. “Make service faster”  
B. “Services must use repository abstraction; do not call database utilities directly”  
C. “Use shorter method names”  
D. “Move all code to controller”  

## Correct Answer

B. “Services must use repository abstraction; do not call database utilities directly”

## Reasoning

The rule states the boundary clearly and prevents hidden coupling.

---

## Question 5

A Claude-assisted PR changes reason-code strings in multiple places. What is the best governance rule?

A. Allow each file to invent reason codes  
B. Use approved reason-code enum or API contract values  
C. Remove all reason codes  
D. Only log stack traces  

## Correct Answer

B. Use approved reason-code enum or API contract values

## Reasoning

Standard reason codes support consistent behavior, observability, and client contracts.

---

## Question 6

Which artifact should route domain policy changes to architecture reviewers?

A. CODEOWNERS  
B. README only  
C. Slack thread  
D. Local IDE settings  

## Correct Answer

A. CODEOWNERS

## Reasoning

CODEOWNERS automatically routes file changes to responsible reviewers.

---

## Question 7

A repo has happy-path-only tests. Which `CLAUDE.md` rule is strongest?

A. “Add some tests.”  
B. “Add happy, failure, and edge-case tests; do not remove or weaken existing tests.”  
C. “Make tests shorter.”  
D. “Fix tests if they fail.”  

## Correct Answer

B. “Add happy, failure, and edge-case tests; do not remove or weaken existing tests.”

## Reasoning

The rule is specific and protects the safety net.

---

## Question 8

Production behavior changes have no rollback guidance. Where should rollback expectations be captured?

A. PR template and rollback runbook  
B. Only in a private chat  
C. Nowhere unless an incident happens  
D. In a code comment only  

## Correct Answer

A. PR template and rollback runbook

## Reasoning

Rollback needs to be reviewable before merge and actionable during incident response.
