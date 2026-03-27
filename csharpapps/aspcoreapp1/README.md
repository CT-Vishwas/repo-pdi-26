# ASP.NET Core MVC App

A basic ASP.NET Core MVC web application with Razor views.

## Description

This is a standard ASP.NET Core MVC application that demonstrates the basic structure of an MVC web app with controllers, views, and models.

## Features

- MVC architecture
- Home, Privacy, and Error pages
- Static file serving
- HTTPS redirection
- Error handling

## Prerequisites

- .NET 9.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd aspcoreapp1
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Open your browser and navigate to `https://localhost:5001` (or the port shown in the console)

## Project Structure

- **Controllers/**: Contains MVC controllers
  - `HomeController.cs` - Handles home, privacy, and error pages
- **Models/**: Data models
  - `ErrorViewModel.cs` - Error page model
- **Views/**: Razor views
  - `Home/Index.cshtml` - Home page
  - `Home/Privacy.cshtml` - Privacy page
  - `Home/Error.cshtml` - Error page
- **wwwroot/**: Static files (CSS, JS, images)

## Routes

- `/` - Home page
- `/Home/Privacy` - Privacy policy page
- `/Home/Error` - Error page