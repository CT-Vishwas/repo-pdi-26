# Vault Manager

A secure password vault manager built with C# that encrypts and stores password entries.

## Description

This console application provides a secure way to store and manage passwords. It uses encryption to protect sensitive data and stores entries in a JSON file.

## Features

- Secure password storage with encryption
- Master key authentication
- Add new password entries
- View all stored entries
- JSON-based persistent storage
- Event-driven notifications

## Prerequisites

- .NET 9.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd VaultManager
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Enter the master key when prompted
4. Choose from the menu options

## Menu Options

1. Add Password - Store a new password entry
2. View all - Display all stored entries (decrypted)
3. Exit - Close the application

## Security Features

- Password encryption using master key
- Secure input for sensitive data
- Persistent storage in vault.json
- Event notifications for vault operations

## Data Structure

Each password entry contains:
- Service name
- Username
- Encrypted password

## Files

- `vault.json` - Encrypted password storage file (created automatically)