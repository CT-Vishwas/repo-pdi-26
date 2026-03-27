# Banking App

A C# console application that demonstrates object-oriented programming concepts in banking, including inheritance and polymorphism.

## Description

This application showcases banking operations with BankAccount and SavingsAccount classes. It demonstrates inheritance, method overriding, and polymorphism.

## Features

- BankAccount base class with deposit/withdraw functionality
- SavingsAccount derived class with interest calculation
- Polymorphic behavior demonstration
- Input validation for transactions

## Prerequisites

- .NET 8.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd BankingApp
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

## Sample Output

```
Deposited $500.00. New balance: $1,500.00
Interest of $25.00 added. New balance: $1,525.00
Deposited $100.00. New balance: $2,100.00
Deposited $100.00. New balance: $1,600.00
```

## Classes

- **BankAccount**: Base class with basic banking operations
- **SavingsAccount**: Derived class that adds interest on deposits

## Concepts Demonstrated

- Inheritance
- Method overriding
- Polymorphism
- Encapsulation