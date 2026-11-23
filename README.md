# WareCore — Warehouse Management System (WMS)

Backend REST API service for managing warehouse topology, product catalog, real-time inventory tracking, inbound goods receipts, cycle counts, and outbound order fulfillment.

## Tech Stack
* **Language & Framework:** Java 21, Spring Boot 4.2
* **Database & Migrations:** PostgreSQL 17, Liquibase
* **Data Access & Mapping:** Spring Data JPA, Hibernate, MapStruct, Lombok
* **API Documentation:** Springdoc OpenAPI 3 (Swagger UI)
* **Utilities:** Apache Commons (`lang3`, `collections4`)
* **Containerization:** Docker & Docker Compose

## Project Architecture
The application is structured as a **Modular Monolith** (package-by-feature) inside `com.warecore`:

* `common` — shared kernel.
* `auth` & `user` — authentication and user profile management.
* `topology` — physical warehouse topology management (`zones`, `racks`, `storage-bins`).
* `catalog` — product catalog management.
* `inventory` — stock levels, stock movements, and physical cycle counts.
* `inbound` — supplier goods receipt documents and items.
* `outbound` — customer outbound orders and picking tracking.
* `audit` — system activity and entity change logging.

## Getting Started

### Prerequisites
* JDK 21+
* Maven 3.9+ (or use included `./mvnw` wrapper)
* Docker & Docker Compose

### Local Setup
1. **Clone the repository:**
   ```bash
   git clone https://github.com/vladyslav-rynder/warecore
   cd warecore

2. **Start PostgreSQL database:**

   ```bash
   docker-compose up -d
   ```

3. **Run the application:**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Explore API Documentation:**
   Once the application is running, open Swagger UI in your browser:
    * `http://localhost:8080/swagger-ui.html`