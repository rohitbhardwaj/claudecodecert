# Rule Extraction Prompt

```text
Do not modify files.

Inspect the messy checkout repo and old PR comments.

Extract architecture rules that should be added to CLAUDE.md and supporting repo artifacts.

Focus on:
- controller boundaries
- service responsibilities
- domain policies
- refund behavior
- reason codes
- tests
- logging/security
- CODEOWNERS
- rollback

Return:
1. messy pattern
2. architecture rule
3. where the rule should live
4. why it matters
5. example CLAUDE.md wording

Do not edit files until the rules are approved.
```
