# App1: Simple Interest Calculator

## Overview
A command-line utility that calculates simple interest based on principal amount, rate of interest, and time period. This is a beginner-friendly Node.js application demonstrating interactive CLI input and basic mathematical calculations.

## Purpose
Learn and practice:
- ES Module syntax in Node.js
- Readline for user input in CLI
- Basic financial calculations
- Number formatting

## Features
✓ Interactive command-line interface
✓ User-friendly prompts
✓ Accurate simple interest calculation
✓ Formatted output with 2 decimal places

## Technology Stack
| Component | Technology |
|-----------|-----------|
| **Runtime** | Node.js |
| **Module System** | ES Modules (`type: "module"`) |
| **Built-in APIs** | readline/promises, process |

## Installation

```bash
cd app1
# No dependencies to install, uses only Node.js built-in modules
```

## Usage

### Running the Program
```bash
node app.js
```

### Interactive Input
The program will prompt you to enter three values:

1. **Principal Amount**: The initial investment or loan amount
   ```
   Enter the Principal amount: 300000
   ```

2. **Rate of Interest**: Annual interest rate as a percentage
   ```
   Enter the rate of interest: 7
   ```

3. **Time in Months**: Duration for which interest is calculated
   ```
   Enter the Time in Months: 36
   ```

### Output
```
Simple interest for 300000 at 7 for the duration 36 months is 63000.00
```

## Mathematical Formula

```
Simple Interest (SI) = (P × R × T) / 100

Where:
  P = Principal amount
  R = Rate of interest (per annum, in %)
  T = Time period (in months, converted to years in calculation)
```

## Code Explanation

### Imports
```javascript
import * as readline from 'node:readline/promises';
import { stdin as input, stdout as output } from 'node:process';
```
- Uses Node.js built-in `readline` module for interactive prompts
- Imports standard input (stdin) and output (stdout) for I/O operations

### Creating Interface
```javascript
const rl = readline.createInterface({input, output});
```
- Creates a readline interface for user interaction

### Getting User Input
```javascript
const principal = await rl.question('Enter the Principal amount: ');
const rateOfInterest = await rl.question('Enter the rate of interest: ');
const timeInMonths = await rl.question('Enter the Time in Months: ');
rl.close();
```
- Uses async `question()` method to prompt and receive input
- Closes the interface after receiving all inputs

### Calculation
```javascript
let simpleInterest = principal * rateOfInterest * timeInMonths / 100;
```
- Calculates simple interest using the standard formula

### Output
```javascript
console.log(`Simple interest for ${principal} at ${rateOfInterest} for the duration ${timeInMonths} months is ${(simpleInterest).toFixed(2)}`);
```
- Displays result with formatted output (2 decimal places)

## Example Scenarios

### Scenario 1: Short-term Savings
```
Principal: 100,000
Rate: 5%
Time: 12 months (1 year)
Result: Simple Interest = 5,000
```

### Scenario 2: Long-term Investment
```
Principal: 500,000
Rate: 8%
Time: 60 months (5 years)
Result: Simple Interest = 200,000
```

### Scenario 3: Loan Payment
```
Principal: 300,000
Rate: 7%
Time: 36 months (3 years)
Result: Simple Interest = 63,000
```

## File Structure
```
app1/
├── app.js           # Main calculator application (ES Module)
├── package.json     # Project configuration
└── README.md        # This file
```

## Package.json Details
```json
{
  "name": "app1",
  "version": "1.0.0",
  "type": "module",
  "main": "app.js",
  "author": "Vishwas"
}
```
- **type: "module"**: Enables ES6 module syntax
- **main**: Entry point for the application

## Key Learning Points

1. **ES Modules**: Using `import` statements instead of CommonJS `require()`
2. **Async/Await**: Using promises with readline for non-blocking I/O
3. **Template Literals**: String interpolation with backticks
4. **Number Formatting**: Using `.toFixed()` for decimal precision
5. **CLI Interaction**: Creating interactive command-line applications

## Advantages of Simple Interest
- Easy to calculate
- Transparent and straightforward
- Good for short-term loans
- Easy to predict total repayment

## Related Concepts

### Simple Interest vs. Compound Interest
- **Simple Interest**: Interest calculated only on principal
- **Compound Interest**: Interest calculated on principal + accumulated interest

### Future Enhancements
- [ ] Add input validation
- [ ] Support for different time units (days, weeks, years)
- [ ] Display amortization schedule
- [ ] Comparison with compound interest
- [ ] Calculation history
- [ ] Interactive menu for multiple calculations

## Troubleshooting

| Issue | Solution |
|-------|----------|
| "Cannot find module" error | Ensure Node.js is installed and file is in correct directory |
| Module import fails | Check that `package.json` has `"type": "module"` |
| Non-numeric input | Program expects numbers - enter only numeric values |

## Testing

### Manual Test Cases
```bash
# Test 1: Standard calculation
Input: 300000, 7, 36
Expected Output: Simple interest for 300000 at 7 for the duration 36 months is 63000.00

# Test 2: High interest rate
Input: 100000, 12, 24
Expected Output: Simple interest for 100000 at 12 for the duration 24 months is 24000.00

# Test 3: Decimal values
Input: 250000, 6.5, 18
Expected Output: Simple interest for 250000 at 6.5 for the duration 18 months is 24250.00
```

## Performance Notes
- Very lightweight application
- Suitable for single calculations
- No external dependencies
- Fast runtime

## Author
Vishwas

## License
ISC

## References
- [Node.js Readline Documentation](https://nodejs.org/api/readline.html)
- [ES Modules in Node.js](https://nodejs.org/api/esm.html)
- [Simple Interest Formula](https://en.wikipedia.org/wiki/Simple_interest)
