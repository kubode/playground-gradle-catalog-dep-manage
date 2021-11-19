# playground-gradle-bom-dep-manage

A sample project managing the dependencies using [Gradle version catalog](https://docs.gradle.org/current/userguide/platforms.html).

## Pros/Cons

Comparison with dependency management using `buildSrc`.

### Pros

- Type-safe dependency management.
- Don't need to use `buildSrc` for the dependency management.
- Don't need to re-compile `buildSrc` sources when the dependencies changed.
- Renovate works!! See [PRs](https://github.com/kubode/playground-gradle-catalog-dep-manage/pulls).

### Cons

- Needs to write the dependencies with TOML.
