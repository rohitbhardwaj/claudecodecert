# Certification-Style Questions

## Question 1

Claude proposes partial refund logic but does not mention payment gateway timeout behavior. What should the architect do?

A. Approve because the happy path works  
B. Request changes to the plan before implementation  
C. Ask Claude to delete payment tests  
D. Merge and monitor  

## Correct Answer

B. Request changes to the plan before implementation

## Reasoning

Payment gateway failure paths are part of refund correctness and must be planned before implementation.

---

## Question 2

Which is the best approval checkpoint artifact?

A. “Looks good” comment  
B. A plan listing behavior, risks, tests, owners, and rollback  
C. A screenshot of the generated code  
D. Number of lines changed  

## Correct Answer

B. A plan listing behavior, risks, tests, owners, and rollback

## Reasoning

Approval should be based on explicit evidence and risk understanding.

---

## Question 3

Partial refunds may change customer-visible API responses. Who should approve this part?

A. API owner  
B. Only the developer  
C. Documentation owner only  
D. No one if unit tests pass  

## Correct Answer

A. API owner

## Reasoning

API response and error-code changes affect clients and require contract review.

---

## Question 4

Claude’s plan includes refund happy path but no duplicate-refund handling. What is missing?

A. Failure and edge-case planning  
B. More comments  
C. README formatting  
D. Shorter method names  

## Correct Answer

A. Failure and edge-case planning

## Reasoning

Refund systems must handle retries, duplicate calls, and partial failures.

---

## Question 5

Which owner should review logging changes for partial refunds?

A. Security / SRE  
B. Only frontend owner  
C. No one  
D. Documentation owner  

## Correct Answer

A. Security / SRE

## Reasoning

Refund logs may expose sensitive customer or payment information.

---

## Question 6

A plan proposes partial refunds but no rollback or disable path. What should happen?

A. Approve if code looks simple  
B. Request rollback/feature flag plan  
C. Merge and monitor  
D. Delete tests  

## Correct Answer

B. Request rollback/feature flag plan

## Reasoning

Production behavior changes need safe recovery options.

---

## Question 7

Which statement best describes approval?

A. Approval is a meeting  
B. Approval is evidence that risks were understood before code changed  
C. Approval is based on generated line count  
D. Approval happens only after merge  

## Correct Answer

B. Approval is evidence that risks were understood before code changed

## Reasoning

Governed Claude Code needs explicit risk evidence before implementation.
