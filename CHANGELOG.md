# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Hexagonal Architecture implementation with clear layer separation:
  - Domain layer with core models and ports
  - Application layer with use cases
  - Infrastructure layer with Kafka configuration and adapters
  - Interface layer with controllers and DTOs
- Kafka integration setup with basic producer configuration
- Spring Boot configuration in YAML format
- Test environment configuration with separate application-test.yml
- Base Message interface and MessagePort for messaging operations
- KafkaMessageAdapter implementation for message handling
- SendMessageUseCase implementation for business logic
- Improved project structure with clear package organization
- Apache Camel integration:
  - Added core Camel dependencies (camel-core, camel-kafka, camel-jackson)
  - Basic Camel configuration with demo route
  - Timer-based route example in CamelConfig

### Changed
- Migrated from application.properties to application.yml
- Moved Application.kt to infrastructure/config package
- Updated package structure to follow hexagonal architecture patterns

## [0.1.0] - 2025-06-01

### Added
- First release with foundational architecture and project setup.
