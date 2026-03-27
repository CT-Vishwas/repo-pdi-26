# Random User API

An ASP.NET Core Web API that fetches random user data from an external service.

## Description

This API demonstrates HTTP client usage in ASP.NET Core by fetching user data from JSONPlaceholder and providing weather forecast data.

## Features

- External API integration
- Weather forecast endpoint
- Random user data retrieval
- OpenAPI documentation

## Prerequisites

- .NET 10.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd randomuser
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Open your browser and navigate to `https://localhost:5001/openapi` for API documentation

## API Endpoints

- `GET /weatherforecast` - Get weather forecast data
- `GET /api/Users` - Get random user data

## Sample Responses

### Weather Forecast
```json
[
  {
    "date": "2024-01-15",
    "temperatureC": 25,
    "summary": "Warm",
    "temperatureF": 77
  }
]
```

### Random User
```json
{
  "name": {
    "firstName": "John",
    "lastName": "Doe"
  },
  "email": "john.doe@example.com",
  "gender": "male"
}
```

## Project Structure

- **Controllers/**: API controllers
  - `UsersController.cs` - User data endpoints
- **Models/**: Data models
  - `UserModels.cs` - User-related classes
- **Services/**: External service integration
  - `UserServices.cs` - HTTP client for external API

## External Dependencies

- JSONPlaceholder API for user data