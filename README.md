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
