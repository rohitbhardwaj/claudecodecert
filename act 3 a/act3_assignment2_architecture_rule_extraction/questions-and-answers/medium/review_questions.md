# Medium Questions

## Q1. Why should CODEOWNERS cover domain policies?

## Answer

Domain policy changes affect business behavior.

## Reasoning

Architecture owners should review changes to business-rule source-of-truth files.

---

## Q2. Why is direct data access from service risky?

## Answer

It can bypass repository abstractions and consistency rules.

## Reasoning

Data access should be controlled through defined boundaries to avoid hidden coupling.

---

## Q3. Why should reason codes be standardized?

## Answer

They support consistent API behavior, logging, support, and observability.

## Reasoning

If each file invents its own reason code, clients and support cannot reliably interpret failures.

---

## Q4. Why should rollback rules be in the PR template and runbook?

## Answer

Production behavior changes need recovery plans.

## Reasoning

A rule in `CLAUDE.md` guides work, but PR and runbook fields make rollback reviewable.
