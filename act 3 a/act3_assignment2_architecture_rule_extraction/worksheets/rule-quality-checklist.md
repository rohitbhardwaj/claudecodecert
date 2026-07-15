# Rule Quality Checklist

A good repo rule is:

```text
[ ] Specific
[ ] Enforceable
[ ] Architecture-aligned
[ ] Easy for Claude and humans to understand
[ ] Connected to tests or review evidence
[ ] Clear about where logic belongs
[ ] Clear about what not to do
[ ] Clear about approval owner when needed
```

## Weak Rule Example

```text
Write cleaner code.
```

## Strong Rule Example

```text
Controllers must remain transport-only. Business rules belong in domain policies.
```
