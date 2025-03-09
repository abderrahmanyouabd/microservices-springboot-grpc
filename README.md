# Java/Spring Microservices Project

## Services Overview

### Core Technologies
- **Languages**: Java
- **Framework**: Spring Boot
- **Database**: PostgreSQL, H2 (testing)
- **Communication**: gRPC, Kafka
- **API Documentation**: SpringDoc OpenAPI
- **Authentication**: JWT, Spring Security
- **Build Tool**: Maven
- **Data Serialization**: Protocol Buffers (Protobuf)

### Microservices Architecture
- **Patient Service**: Core patient data management
- **Billing Service**: Handles financial transactions
- **Notification Service**: Manages alerts and notifications
- **Auth Service**: Handles authentication and authorization

## Quick Setup Guide

### Patient Service
- PostgreSQL database connection
- Kafka integration for event streaming
- gRPC client for Billing Service communication

### Billing Service
- gRPC server implementation
- Protocol Buffer message definitions

### Notification Service
- Kafka consumer for event handling
- Protocol Buffer message deserialization

### Auth Service
- JWT authentication
- Spring Security implementation
- PostgreSQL user storage
- Default admin user creation

### Kafka Configuration
- Multi-listener setup (internal, external)
- Producer/consumer configuration
