# Prompt Critique

## Original Prompt

```text
Clean up the checkout validation logic and make the code simpler. Fix any tests that fail.
```

## Problems

| Prompt issue | Why it is risky |
|---|---|
| “Clean up” is vague | Claude may optimize for simplicity over behavior preservation |
| “Make code simpler” is underspecified | Can collapse important business rules |
| No preserved behavior listed | Existing edge cases can silently change |
| No failure paths listed | Tests may focus only on happy path |
| “Fix any tests that fail” | Encourages weakening/removing tests |
| No approval checkpoint | Claude may edit risky areas without review |
| No rollback requirement | Production safety not considered |

## Better Direction

Use a constrained analysis prompt before implementation.
