# Kirana App

An ASP.NET Core Web API for managing products in a kirana (grocery) store.

## Description

This RESTful API provides endpoints to manage products in an inventory system. It includes Swagger documentation and demonstrates basic CRUD operations.

## Features

- RESTful API endpoints
- Swagger/OpenAPI documentation
- Product management (Create, Read)
- In-memory data storage
- JSON responses

## Prerequisites

- .NET 9.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd kiranaapp
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Open your browser and navigate to `https://localhost:5001/swagger` for API documentation

## API Endpoints

### Products

- `POST /api/v1/Product` - Create a new product
- `GET /api/v1/Product` - Get all products
- `GET /api/v1/Product/{id}` - Get product by ID

## Sample Product Data

```json
{
  "id": 1,
  "name": "Rice",
  "isEnabled": true,
  "price": 0.0,
  "quantity": 0
}
```

## Project Structure

- **Controllers/**: API controllers
  - `ProductController.cs` - Product management endpoints
- **Models/**: Data models
  - `Product.cs` - Product entity
- **Services/**: Business logic
  - `ProductService.cs` - Product operations

## Technologies

- ASP.NET Core Web API
- Swagger/OpenAPI
- In-memory data storage