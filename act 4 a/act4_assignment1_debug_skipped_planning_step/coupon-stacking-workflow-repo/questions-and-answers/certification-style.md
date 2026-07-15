# Certification-Style Questions

## Question 1

Claude immediately edits five production files before returning a plan. What is the primary workflow failure?

A. Too few comments  
B. Skipped planning and approval checkpoint  
C. Wrong indentation  
D. Too many unit tests  

## Correct Answer

B. Skipped planning and approval checkpoint

## Reasoning

Governed Claude Code should analyze, plan, identify risks, and wait for approval before editing production behavior.

---

## Question 2

Coupon stacking affects pricing and refunds. Which owner should be involved?

A. Only the developer who prompted Claude  
B. Pricing/finance and architecture owners  
C. No one if tests pass  
D. Documentation owner only  

## Correct Answer

B. Pricing/finance and architecture owners

## Reasoning

Pricing and refund changes can affect money behavior and require responsible owner review.

---

## Question 3

A Claude-generated PR rewrites a failing pricing test to match the new behavior. What should the reviewer do?

A. Accept it because tests pass  
B. Request changes and require explanation or correction of the failing behavior  
C. Delete all pricing tests  
D. Merge and monitor  

## Correct Answer

B. Request changes and require explanation or correction of the failing behavior

## Reasoning

Rewriting failing tests can hide defects. Tests are evidence, not obstacles.

---

## Question 4

Which planning artifact is most appropriate before implementation?

A. Number of lines Claude expects to generate  
B. A plan listing affected files, risks, tests, owners, and rollback  
C. A screenshot of the editor  
D. A generic “looks good” note  

## Correct Answer

B. A plan listing affected files, risks, tests, owners, and rollback

## Reasoning

Approval should be based on explicit risk and implementation evidence.

---

## Question 5

Mobile checkout returns a different total than web checkout after coupon stacking. What was likely missed?

A. Cross-entry-point context and tests  
B. Code comments  
C. README formatting  
D. More imports  

## Correct Answer

A. Cross-entry-point context and tests

## Reasoning

Checkout behavior must be validated across all entry points.

---

## Question 6

No rollback plan exists for coupon stacking. What is the best response?

A. Merge if happy path passes  
B. Request changes and require rollback or feature flag plan  
C. Ask Claude to remove rollback mention  
D. Ignore because rollback is only needed for large projects  

## Correct Answer

B. Request changes and require rollback or feature flag plan

## Reasoning

Production behavior changes need recovery options.

---

## Question 7

Which statement best describes the governed workflow?

A. Implementation → Maybe tests → Merge  
B. Plan → Context → Approval → Implementation → Tests → Review → Merge  
C. Prompt → Diff → Merge  
D. Code → Ask questions later  

## Correct Answer

B. Plan → Context → Approval → Implementation → Tests → Review → Merge

## Reasoning

Governed Claude Code relies on explicit checkpoints.
