# GitHub Copilot Code Agent – Instructions

These are the project-specific development guidelines for GitHub Copilot Code Agent. Follow these instructions strictly to ensure maintainability, testability, and architectural integrity.

---

## 1. Architecture

- **Hexagonal Architecture (Ports & Adapters):**
    - Structure the project following Hexagonal Architecture principles.
    - Separate clearly the following layers:
        - **Domain:** Core business rules and models.
        - **Application:** Use cases and service orchestration.
        - **Infrastructure:** Frameworks, databases, messaging, etc.
        - **External Interfaces:** Controllers, APIs, CLI, UI.
    - **Domain layer must not depend on any external libraries or frameworks.**
    - Use **interfaces (ports)** in domain/application layers.
    - Infrastructure implements these interfaces as **adapters**.
    - **Dependencies are inverted**: domain and application layers must never depend on infrastructure.

---

## 2. Change Management

- Maintain a `CHANGELOG.md` at the root of the repository.
- Follow the [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) format.
- Update the changelog with every **significant** commit, including:
    - `Added` for new features.
    - `Changed` for changes in existing functionality.
    - `Fixed` for bug fixes.
    - `Removed` for deprecated features.

---

## 3. Testability

- Ensure **isolated testability** of all components.
- **Domain & Application layers:**
    - Use **unit tests** only.
    - Avoid external dependencies.
- **Adapters & External Interfaces:**
    - Use **integration tests**.
- Use **mocks or stubs** to simulate external dependencies.
- **Minimum recommended test coverage: 80%**.

---

## 4. Best Practices for Kotlin and Spring Boot

- Use idiomatic Kotlin:
    - `data class`, `sealed class`, `object`, `extension functions`, etc.
- Follow Kotlin style conventions and organize packages by feature/module.
- Use **constructor-based dependency injection** with Spring Boot.
- Do **not** place business logic in:
    - Controllers
    - Infrastructure services
- Centralize:
    - **Validation** (e.g., using annotations or dedicated validators).
    - **Error handling** (preferably with `@ControllerAdvice`).
- Keep code:
    - **Clean**
    - **Modular**
    - **Single-responsibility**
- Document:
    - Public APIs (Swagger/OpenAPI recommended).
    - Complex logic within code via comments or KDoc.

---

_These guidelines are mandatory for all contributors and automation tools interacting with this repository._
