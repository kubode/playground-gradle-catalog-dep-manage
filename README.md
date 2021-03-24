# playground-gradle-bom-dep-manage

A sample project managing the dependencies using BoM.

## Pros

- Don't need to use `buildSrc` for the dependency management.
- Dependabot and Renovate works!!

## Cons

- Needs to declare the dependencies with String like `implementation("group.id:artifact-id”)` on each submodule’s `dependencies` block.
- Needs to add `implementation(platform(project(":platform")))` on each submodule’s `dependencies` block.
