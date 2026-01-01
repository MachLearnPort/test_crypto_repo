# Multi-Language Dependency Manifest Sample Repository

This repository contains multiple subprojects demonstrating various build systems
and dependency management approaches. It serves as a sample repository for testing
dependency manifest and lockfile parsers across different ecosystems.

## Project Structure

| Directory | Build System | Manifest Files |
|-----------|--------------|----------------|
| `java-maven-app/` | Maven | `pom.xml` |
| `java-gradle-app/` | Gradle (Kotlin DSL) | `build.gradle.kts`, `settings.gradle.kts` |
| `python-pip-app/` | pip | `requirements.txt`, `requirements-dev.txt` |
| `python-poetry-app/` | Poetry | `pyproject.toml`, `poetry.lock` |
| `node-npm-app/` | npm | `package.json`, `package-lock.json` |

## Features

Each subproject includes:
- Production dependencies (including cryptographic libraries)
- Development/test dependencies
- Various version specification formats (exact, ranges, constraints)

### Tricky Cases Included

- **Python pip**: Environment markers, extras specifications, version ranges
- **Maven/Gradle**: Test scope dependencies, BOM imports
- **Poetry**: Dependency groups (main vs dev)

## Usage

Each subproject can be built independently using its respective build tool.
See individual project directories for specific build instructions.

## Managing Crypto Assets

To add or remove crypto assets that can be picked up by a monitoring service, update the appropriate manifest file for each ecosystem.

### Java Maven (`java-maven-app/pom.xml`)

**Add a dependency:**
```xml
<dependencies>
  <!-- Add inside the <dependencies> block -->
  <dependency>
    <groupId>org.example</groupId>
    <artifactId>crypto-library</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

**Remove a dependency:** Delete the entire `<dependency>...</dependency>` block for the library.

---

### Java Gradle (`java-gradle-app/build.gradle.kts`)

**Add a dependency:**
```kotlin
dependencies {
    implementation("org.example:crypto-library:1.0.0")
    // Use runtimeOnly() for runtime-only dependencies
    // Use testImplementation() for test dependencies
}
```

**Remove a dependency:** Delete the corresponding `implementation()`, `runtimeOnly()`, or `testImplementation()` line.

---

### Python pip (`python-pip-app/requirements.txt`)

**Add a dependency:**
```
crypto-library>=1.0.0,<2.0.0
# With extras:
crypto-library[extra-feature]>=1.0.0
# With environment markers:
crypto-library>=1.0.0; python_version >= "3.10"
```

**Remove a dependency:** Delete the line containing the package name.

---

### Python Poetry (`python-poetry-app/pyproject.toml`)

**Add a dependency:**
```toml
[tool.poetry.dependencies]
crypto-library = "^1.0.0"
# With extras:
crypto-library = {version = "^1.0.0", extras = ["extra-feature"]}

# For dev-only dependencies:
[tool.poetry.group.dev.dependencies]
dev-crypto-tool = "^1.0.0"
```

**Remove a dependency:** Delete the line from the appropriate section.

**Update lockfile:** After changes, run `poetry lock` to regenerate `poetry.lock`.

---

### Node.js npm (`node-npm-app/package.json`)

**Add a dependency:**
```json
{
  "dependencies": {
    "crypto-library": "^1.0.0"
  },
  "devDependencies": {
    "dev-crypto-tool": "^1.0.0"
  }
}
```

**Remove a dependency:** Delete the key-value pair from `dependencies` or `devDependencies`.

**Update lockfile:** After changes, run `npm install` to regenerate `package-lock.json`.

---

### Monitoring Service Detection

A monitoring service will typically detect changes by:

1. **Scanning manifest files** - The files listed in the Project Structure table above
2. **Parsing lockfiles** - `poetry.lock` and `package-lock.json` for resolved transitive dependencies
3. **Tracking git commits** - Detecting when dependencies are added, removed, or updated
