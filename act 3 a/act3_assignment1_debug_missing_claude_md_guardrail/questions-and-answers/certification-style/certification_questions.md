# Certification-Style Questions

## Question 1

Claude adds cancellation business logic directly to `CheckoutController.java`. What is the primary architectural concern?

A. The controller has too many imports  
B. Business rules moved into the transport layer  
C. The method name is too long  
D. The code may need comments  

## Correct Answer

B. Business rules moved into the transport layer

## Reasoning

Controllers should handle request/response mapping. Cancellation rules belong in the domain or service layer.

---

## Question 2

What is the best first action before asking Claude to implement the cancellation feature?

A. Ask Claude to modify `CheckoutController.java`  
B. Ask Claude to remove failing tests  
C. Ask Claude to inspect `CLAUDE.md`, architecture docs, entry points, policies, tests, and CODEOWNERS  
D. Ask Claude to generate a new dependency  

## Correct Answer

C. Ask Claude to inspect `CLAUDE.md`, architecture docs, entry points, policies, tests, and CODEOWNERS

## Reasoning

Claude needs repo context and governance rules before implementation.

---

## Question 3

A repo has a weak `CLAUDE.md` that only says “write clean code.” What is the best improvement?

A. Add “make code shorter”  
B. Define architecture boundaries and safe/ask/never rules  
C. Delete `CLAUDE.md`  
D. Tell Claude to fix tests automatically  

## Correct Answer

B. Define architecture boundaries and safe/ask/never rules

## Reasoning

Generic guidance is not enough. Claude needs specific, enforceable repo rules.

---

## Question 4

Claude duplicates refund calculation inside the controller. What is the main risk?

A. The controller is easier to read  
B. Refund behavior may diverge from the shared refund policy  
C. The file becomes smaller  
D. Tests will always catch it  

## Correct Answer

B. Refund behavior may diverge from the shared refund policy

## Reasoning

Refunds are money-impacting rules and should have one source of truth.

---

## Question 5

Only a web happy-path cancellation test was added. What is missing?

A. More comments  
B. Mobile, batch, domain policy, and refund behavior tests  
C. A longer method name  
D. A README update only  

## Correct Answer

B. Mobile, batch, domain policy, and refund behavior tests

## Reasoning

The feature affects multiple flows and shared policies.

---

## Question 6

A Claude-assisted PR changes cancellation behavior but does not trigger CODEOWNERS approval. What is the best governance response?

A. Merge if CI passes  
B. Request owner review before merge  
C. Ask Claude to summarize the PR after merge  
D. Remove CODEOWNERS  

## Correct Answer

B. Request owner review before merge

## Reasoning

Behavior changes require responsible owner review.

---

## Question 7

Which statement best summarizes the lesson of this assignment?

A. Claude should always edit the first file it finds  
B. Happy-path tests are enough  
C. Repo guidance must tell Claude how engineering is supposed to work  
D. Controllers should contain all business logic  

## Correct Answer

C. Repo guidance must tell Claude how engineering is supposed to work

## Reasoning

Claude Code needs repo-readable architecture rules, not just access to files.
