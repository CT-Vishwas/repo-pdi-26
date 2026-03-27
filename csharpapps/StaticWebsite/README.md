# Static Website

A basic ASP.NET Core Razor Pages static website.

## Description

This is a simple static website built with ASP.NET Core Razor Pages. It serves static files and provides a basic web page structure.

## Features

- Razor Pages for content
- Static file serving
- HTTPS redirection
- Error handling

## Prerequisites

- .NET 9.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd StaticWebsite
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Open your browser and navigate to `https://localhost:5001`

## Project Structure

- **Pages/**: Razor pages
  - `_ViewImports.cshtml` - Shared imports
  - Other page files
- **wwwroot/**: Static assets
  - CSS, JavaScript, images
- **Properties/**: Launch settings

## Technologies

- ASP.NET Core Razor Pages
- Static file middleware