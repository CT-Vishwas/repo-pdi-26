# Kirana App v1

A full-featured ASP.NET Core Web API for a kirana (grocery) store management system with layered architecture.

## Description

This application demonstrates a complete layered architecture for a product inventory management system. It includes authentication, database integration, validation, and comprehensive API documentation.

## Features

- JWT-based authentication
- User registration and login
- Product CRUD operations
- MySQL database integration
- Fluent validation
- AutoMapper for DTO mapping
- Global exception handling
- Swagger/OpenAPI documentation
- Clean architecture (API, Core, Infrastructure layers)

## Prerequisites

- .NET 9.0 SDK
- MySQL Server

## Database Setup

1. Create a MySQL database
2. Update the connection string in `appsettings.json`
3. Run database migrations (if using EF Core migrations)

## How to Run

1. Navigate to the API project directory:
   ```bash
   cd KiranaAppv1/KiranaAppV1.API
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Open your browser and navigate to `https://localhost:5001/swagger` for API documentation

## API Endpoints

### Authentication
- `POST /api/auth/register` - User registration
- `POST /api/auth/login` - User login

### Products
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `POST /api/products` - Create new product
- `PUT /api/products/{id}` - Update product
- `DELETE /api/products/{id}` - Delete product

## Project Structure

```
KiranaAppV1/
├── KiranaAppV1.API/           # Web API layer
│   ├── Controllers/           # API controllers
│   ├── Middleware/            # Custom middleware
│   └── Properties/
├── KiranaAppV1.Core/          # Core business logic
│   ├── DTOs/                  # Data transfer objects
│   ├── Entities/              # Domain entities
│   └── Interfaces/            # Contracts
├── KiranaAppV1.Infrastructure/ # Data access layer
│   ├── Data/                  # Database context
│   ├── Mappings/              # AutoMapper profiles
│   ├── Repositories/          # Data repositories
│   └── Services/              # Business services
└── KiranaAppV1.Tests/         # Unit tests
```

## Technologies

- ASP.NET Core Web API
- Entity Framework Core
- MySQL Database
- JWT Authentication
- FluentValidation
- AutoMapper
- Swagger/OpenAPI
- xUnit (for testing)

## Security

- JWT token-based authentication
- Password hashing with ASP.NET Core Identity
- Role-based authorization
- Input validation and sanitization

## Configuration

Update `appsettings.json` with:
- Database connection string
- JWT settings (issuer, audience, key)
- Other environment-specific settings