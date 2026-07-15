# Repo-Aware Fix Review Checklist

```text
[ ] Did Claude identify all entry points?
[ ] Did Claude identify the shared source of truth?
[ ] Is business logic in the correct layer?
[ ] Are controllers still thin?
[ ] Are web, mobile, and batch flows covered?
[ ] Are domain policy tests included?
[ ] Does the PR include blast-radius notes?
[ ] Does the PR avoid duplicating validation logic?
[ ] Were CODEOWNERS or domain owners identified?
[ ] Is rollback documented if behavior changed?
```
