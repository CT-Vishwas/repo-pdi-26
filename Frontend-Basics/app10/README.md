# App10: Variables & Data Types

## Overview
Comprehensive guide to JavaScript variables and data types. Covers var, let, const declarations and JavaScript's type system.

## Purpose
Learn and practice:
- Variable declaration (var, let, const)
- Data types (String, Number, Boolean, undefined, null, BigInt)
- Type checking with typeof
- Variable scope and reassignment
- Naming conventions
- Comments

## Variable Declarations

### var (Function Scope)
```javascript
var user = "vishwas";
console.log(user);     // "vishwas"
user = 10;             // Reassign
console.log(user);     // 10
var user = 20;         // Redeclare (allowed but not recommended)
```

**Issues**: Function scope, hoisting, redeclaration allowed

### let (Block Scope - Recommended)
```javascript
let age = 10;
console.log(age);      // 10
age = 20;              // Reassign (✓)
console.log(age);      // 20
let age = 30;          // Error: already declared
```

**Benefits**: Block scope, prevents accidental redeclaration

### const (Block Scope - Immutable)
```javascript
const minAge = 18;
console.log(minAge);   // 18
minAge = 25;           // Error: cannot modify
const minAge = 20;     // Error: already declared
```

**Benefits**: Prevents reassignment, clear intent

## Data Types

### String
```javascript
let user = "Vishwas";      // Double quotes
let user1 = 'Vishwas';     // Single quotes
let user2 = `Vishwas`;     // Template literal
console.log(typeof user);  // "string"
```

### String Operations
```javascript
let user1Things = "Vishwas's";  // Escaped quote
let combined = "This is " + "Java Script Language";
let template = `Hello ${user}`;  // Template literal
```

### Number
```javascript
let age1 = 10;              // Integer
let quantity = 23.5678;     // Decimal
let expoNumber = 23.56e08;  // Scientific notation
let hexNumber = 0x23;       // Hexadecimal
let years = 12637193018982918;  // Large number

console.log(typeof age1);   // "number"
console.log(typeof quantity);  // "number"
```

### BigInt
```javascript
let someNumber = 12637193018982918546n;  // n suffix
console.log(typeof someNumber);  // "bigint"
```

For very large numbers beyond Number.MAX_SAFE_INTEGER.

### Boolean
```javascript
let isANumber = true;
let isGreater = 5 > 6;  // false
console.log(typeof isANumber);  // "boolean"
```

### undefined
```javascript
let price;  // Not assigned
console.log(price);          // undefined
console.log(typeof price);   // "undefined"

let cost = undefined;        // Explicit
console.log("Value of cost " + cost);  // "undefined"
```

### null
```javascript
let empty = null;
console.log(empty);         // null
console.log(typeof empty);  // "object" (quirk in JS)
```

### Objects
```javascript
let user = {
    name: "John",
    age: 30,
    email: "john@example.com"
};
console.log(typeof user);   // "object"
```

## Type Checking

### typeof Operator
```javascript
console.log(typeof 10);              // "number"
console.log(typeof "hello");         // "string"
console.log(typeof true);            // "boolean"
console.log(typeof undefined);       // "undefined"
console.log(typeof {});              // "object"
console.log(typeof null);            // "object" (quirk)
console.log(typeof function(){});    // "function"
```

### Type Coercion
```javascript
let a = "5";
let b = 5;
console.log(a == b);   // true (loose comparison)
console.log(a === b);  // false (strict comparison)

let x = "10";
let y = x + 5;         // "105" (string concatenation)

let z = x - 5;         // 5 (number conversion)
```

## Naming Conventions

### Good Names ✓
```javascript
let firstName = "John";        // camelCase
let CONSTANT_VALUE = 100;      // CONSTANT (all caps)
let isValidEmail = true;       // Boolean (is, has, can prefix)
let getUserName = function(){  // Function (verb prefix)
```

### Bad Names ✗
```javascript
let a = 5;                     // Too short
let A = 10;                    // Uppercase variable
let my-variable = true;        // Can't use hyphens
let my variable = false;       // Can't use spaces
let 123abc = "test";           // Can't start with number
```

### Naming Rules
- Use meaningful, descriptive names
- Use camelCase for variables/functions
- Use UPPER_SNAKE_CASE for constants
- Start with letter or underscore (_)
- Can contain numbers (not at start)
- No special characters except $ and _
- No spaces or hyphens
- Case sensitive

## Comments

### Single Line
```javascript
// This is a single line comment
let x = 10;  // Comment here too
```

### Multi-Line
```javascript
/*
This is an example of multi line comment.
These are not for the interpreter but for other developers.
They help understand the code's purpose.
*/
```

### Documentation Comments
```javascript
/**
 * Calculate sum of two numbers
 * @param {number} a - First number
 * @param {number} b - Second number
 * @returns {number} Sum of a and b
 */
function add(a, b) {
    return a + b;
}
```

## Variable Scope

### Global Scope
```javascript
var globalVar = "accessible everywhere";

function test() {
    console.log(globalVar);  // Works
}
```

### Function Scope (var)
```javascript
function test() {
    var localVar = "only here";
}
console.log(localVar);  // Error: localVar not defined
```

### Block Scope (let, const)
```javascript
if(true) {
    let blockVar = "only in block";
    const blockConst = "only in block";
}
console.log(blockVar);  // Error
console.log(blockConst);  // Error

// Inside block is accessible
for(let i = 0; i < 3; i++) {
    console.log(i);  //  0, 1, 2
}
// console.log(i);  // Error: i not defined
```

## Hoisting

### var Hoisting
```javascript
console.log(x);  // undefined (hoisted)
var x = 5;
console.log(x);  // 5
```

### let/const Hoisting
```javascript
console.log(y);  // Error: ReferenceError
let y = 10;
```

## Type Conversions

### String to Number
```javascript
let str = "123";
let num = Number(str);       // 123
let num2 = parseInt(str);    // 123
let num3 = parseFloat("12.5");  // 12.5
```

### Number to String
```javascript
let num = 123;
let str = String(num);       // "123"
let str2 = num.toString();   // "123"
```

### Boolean Conversions
```javascript
console.log(Boolean(1));      // true
console.log(Boolean(0));      // false
console.log(Boolean(""));     // false
console.log(Boolean("hello")); // true
console.log(Boolean(null));   // false
console.log(Boolean(undefined)); // false
```

## Best Practices

### Do's ✓
- Use const by default
- Use let for reassignable variables
- Avoid var in modern code
- Give meaningful names
- Write comments for complex logic
- Use consistent naming style

### Don'ts ✗
- Don't use var
- Don't create too many global variables
- Don't use ambiguous names
- Don't mix naming styles
- Don't reassign const

## File Structure
```
app10/
└── index.html     # HTML with JS examples
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Variable declaration methods (var, let, const)
- Differences between var, let, const
- Data types in JavaScript
- Type checking with typeof
- Type conversions
- Variable scope
- Naming conventions
- Comments usage
- Best practices

## Practice Exercise Order

1. **Variables**
   - Declare variables with const, let
   - Try reassigning
   - Check scope

2. **Data Types**
   - Create each type
   - Use typeof to check
   - Convert between types

3. **Naming**
   - Rename variables properly
   - Use consistent style
   - Make names meaningful

4. **Comments**
   - Add explaining comments
   - Document functions
   - Clarify complex logic

## Common Questions

**Q: Should I use var?**
A: No, use let/const instead. They have better scope and prevent errors.

**Q: When use const vs let?**
A: Use const by default. Use let only when you need to reassign.

**Q: What's the difference between == and ===?**
A: == allows type coercion (loose). === requires exact type match (strict).

**Q: Can I use numbers in variable names?**
A: Yes, but not at the start: `let var1` ✓, but not `let 1var` ✗

## Complete Example

```javascript
// Person information
const firstName = "John";       // Immutable
const lastName = "Doe";         // Immutable
let age = 30;                   // Can change
let email = "john@example.com"; // Can change

// Combine names
const fullName = firstName + " " + lastName;
console.log(`${fullName} is ${age} years old`);

// Increment age
age = age + 1;
age++;

// Check types
console.log(typeof firstName);   // "string"
console.log(typeof age);         // "number"
```

## Browser Console Testing

1. Open DevTools (F12)
2. Go to Console tab
3. Type and execute:
   ```javascript
   let x = 5;
   let y = "hello";
   console.log(typeof x);
   console.log(typeof y);
   ```

## Next Steps

1. Master variable declarations
2. Understand all data types
3. Learn type conversions
4. Practice scope rules
5. Move to operations and control flow

## References

- MDN: [Variables](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/First_steps/Variables)
- MDN: [Data Types](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures)
- [JavaScript.info Variables](https://javascript.info/variables)

## Key Takeaways

✓ Use const by default
✓ Use let for reassignable variables  
✓ Avoid var in modern code
✓ Understand all data types
✓ Type check with typeof
✓ Use meaningful variable names

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App9](../app9/README.md)** | **[Next: App11 →](../app11/README.md)**
