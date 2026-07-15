# Quick Prompt Scorecard

| Criterion | Points |
|---|---:|
| Says do not edit yet | 1 |
| Asks for analysis before implementation | 1 |
| Lists relevant files/context | 1 |
| Defines behavior to preserve | 1 |
| Protects failure-path tests | 1 |
| Prevents weakening/removing tests | 1 |
| Preserves public error codes | 1 |
| Preserves reason-code logging | 1 |
| Identifies approval owners | 1 |
| Requires waiting for approval | 1 |

## Score

```text
/10
```

## Interpretation

```text
9–10: Strong governed prompt
7–8: Good but missing one safety element
5–6: Better than vibe prompt but still risky
0–4: Unsafe for production refactor
```
