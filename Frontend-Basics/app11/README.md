# App11: Simple Calculator

## Overview
Interactive calculator performing basic math operations. Demonstrates event listeners, form input handling, switch statements, and DOM manipulation.

## Purpose
Learn and practice:
- HTML form structure
- JavaScript event listeners
- Switch statement logic
- parseInt conversion
- DOM element selection
- Template literals
- Input validation
- Mathematical operations

## Calculator Features

### Operations
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Division by zero handling

## Form Inputs

```html
<fieldset>
    <legend>Simple Calculator</legend>
    <label>Number 1</label>
    <input type="number" id="num1">
    
    <label>Number 2</label>
    <input type="number" id="num2">
    
    <label>Operator</label>
    <select id="op">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    
    <button id="calculateButton">Calculate</button>
</fieldset>
```

## JavaScript Logic

### Get Values
```javascript
let num1 = parseInt(document.getElementById('num1').value);
let num2 = parseInt(document.getElementById('num2').value);
let op = document.getElementById('op').value;
```

### Switch Statement
```javascript
switch (op) {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            result = "Cannot divide by zero";
        }
        break;
}
```

### Display Result
```javascript
let resultEl = document.getElementById('result');
resultEl.textContent = `The ${operation} of ${num1} and ${num2} is ${result}`;
```

## Event Listener

```javascript
const calculateButton = document.getElementById('calculateButton');
calculateButton.addEventListener('click', handleOnclick);
```

Modern approach vs inline onclick.

## Code Flow

```
User clicks "Calculate"
    ↓
addEventListener triggers
    ↓
handleOnclick() executed
    ↓
Get form values
    ↓
Switch on operator
    ↓
Calculate result
    ↓
Display in result field
```

## Error Handling

Division by zero:
```javascript
if (num2 != 0) {
    res.textContent = `The Division of ${num1} and ${num2} is ${num1 / num2}`;
} else {
    res.textContent = `Cannot perform division by zero`;
}
```

## Common Bugs

❌ Not converting string to number
❌ Forgetting break in switch cases
❌ No division by zero check
❌ Trying to modify innerHTML instead of textContent

## File Structure
```
app11/
└── index.html      # Calculator
```

## Learning Outcomes

- Form inputs (number, select)
- parseInt() conversion
- Event listeners
- Switch statements
- Comparison operators (!= for not equal)
- Template literals
- DOM element selection and manipulation
- Error handling
- User feedback

## How to Test

1. Open in browser
2. Enter two numbers
3. Select operator
4. Click Calculate
5. View result
6. Try division by zero - should show error

## Practice Exercises

**Easy**: Add more operators (%, **)
**Medium**: Add decimal support (parseFloat)
**Hard**: Add operation history, keyboard support

## Key Takeaways

✓ Switch statements handle multiple cases
✓ parseInt converts strings to numbers
✓ Event listeners handle user actions
✓ Error handling improves UX
✓ Template literals format output nicely

## Author
Vishwas K Singh

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App10](../app10/README.md)** | **[Next: App12 →](../app12/README.md)**
