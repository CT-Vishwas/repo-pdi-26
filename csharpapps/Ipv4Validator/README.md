# IPv4 Validator

A C# console application that validates IPv4 addresses.

## Description

This application takes an IPv4 address as input and validates it according to IPv4 standards. It checks for proper format, octet ranges, and leading zero rules.

## Features

- Input validation for IPv4 addresses
- Checks for exactly 4 octets separated by dots
- Validates each octet is between 0-255
- Prevents leading zeros (except for 0 itself)
- Provides clear validation results

## Prerequisites

- .NET 9.0 SDK

## How to Run

1. Navigate to the project directory:
   ```bash
   cd Ipv4Validator
   ```

2. Run the application:
   ```bash
   dotnet run
   ```

3. Enter an IPv4 address when prompted

## Sample Usage

```
--------IP VALIDATOR -----------
Enter the IPv4 Address: 192.168.1.1
Status: Valid

Enter the IPv4 Address: 256.1.1.1
Status: Invalid IP Format
```

## Validation Rules

- Must contain exactly 4 octets
- Each octet must be 0-255
- No leading zeros allowed (e.g., 001 is invalid)
- Proper dot separation