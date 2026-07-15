# Analysis-First Claude Code Prompt Template

```text
Do not modify files yet.

Analyze [area/change] and identify opportunities to [goal] without changing production behavior.

Inspect:
- CLAUDE.md
- [relevant source file]
- [relevant policy file]
- [relevant mapper/contract]
- [relevant tests]
- [API contract if present]
- [incident notes if present]

Return:
1. current behavior summary
2. behavior that must be preserved
3. failure paths that must remain tested
4. risky areas where changes could alter behavior
5. proposed small implementation plan
6. tests to add before code changes
7. approval owners needed
8. rollback considerations

Do not remove or weaken failing tests.
Do not change public contracts unless approved.
Do not remove observability or reason-code logging.
Wait for human approval before editing files.
```
