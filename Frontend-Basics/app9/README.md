# App9: JavaScript Basics

## Overview
An introduction to JavaScript in browsers, demonstrating console logging, DOM element selection, and event handling with functions.

## Purpose
Learn and practice:
- Running JavaScript in HTML
- Console API for debugging
- DOM element selection
- Event listeners and handlers
- Button click events
- Function definition and calling
- Passing arguments to functions

## Key JavaScript Concepts

### Inline Script
```html
<script>
    console.log("I am Learning Javascript");
    var para = document.getElementById('para');
    console.log(para);
</script>
```

### External Script
```html
<script src="script.js" type="text/javascript"></script>
```

### Function Definition
```javascript
function btnclick(fname){
    console.log('Name Entered is: ');
    console.log(fname);
}
```

## DOM Selection

### getElementById
```javascript
var element = document.getElementById('para');
```
- Selects element by ID
- Returns first matching element
- Used for unique elements

### Value Access
```javascript
var input = document.getElementById('fullname');
var value = input.value;  // Get input value
```

## Event Handling

### Inline Event
```html
<button onclick="btnclick(fullname.value)">Click Me</button>
```

Directly calls function on click.

### Event Listener
```javascript
element.addEventListener('click', function() {
    // Handle click
});
```

More modern approach.

## Console Logging

### Basic Output
```javascript
console.log("Text");
console.log(variable);
console.log(object);
```

### Log Types
```javascript
console.log("Info");           // Normal
console.log.warn("Warning");   // Warning
console.log.error("Error");    // Error
console.log.info("Info");      // Info
```

## Event Flow

```
User clicks button
    ↓
onclick="btnclick(...)" triggers
    ↓
Function btnclick() executes
    ↓
console.log() outputs to console
    ↓
Can view in DevTools F12
```

## Complete Code Example

### HTML
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sample JS APP</title>
    <script>
        console.log("I am Learning Javascript");
        var para = document.getElementById('para');
        console.log(para);
    </script>
</head>
<body>
    Running JS in a Browser
    <p id="para">This is a Paragraph Tag</p>

    <input type="text" id="fullname"/>
    <button onclick="btnclick(fullname.value)">Click Me</button>

    <script src="script.js"></script>
    <script>
        console.log("Hello World");
        function btnclick(fname){
            console.log('Name Entered is: ');
            console.log(fname);
        }
    </script>
</body>
</html>
```

### External script.js
```javascript
console.log('Hi, I am Vishwas K singh');
```

## Script Execution Order

```html
1. <script> in head
   - Executes immediately
   - DOM elements below not available yet

2. HTML body content
   - Rendered to page

3. <script> at end of body
   - DOM elements are available
   - Executes after page loads
```

Best practice: Put scripts at end of body or use defer.

## Debugging with Console

### View Output
1. Open DevTools: F12 or Right-click → Inspect
2. Go to "Console" tab
3. See console.log() output
4. Type JavaScript to test

### Console Methods

```javascript
console.log()      // Normal log
console.warn()     // Warning (yellow)
console.error()    // Error (red)
console.table()    // Table format
console.clear()    // Clear console
console.count()    // Count occurrences
```

## Functions

### Definition
```javascript
function nameFunction(parameter1, parameter2) {
    // Function body
    return result;
}
```

### Calling
```javascript
nameFunction(arg1, arg2);
```

### Return Values
```javascript
function add(a, b) {
    return a + b;
}

var result = add(5, 3);  // result = 8
```

## Template Literals vs Concatenation

### String Concatenation
```javascript
var name = "John";
var message = "Hello " + name;
console.log(message);
```

### Template Literals
```javascript
var name = "John";
var message = `Hello ${name}`;
console.log(message);
```

Template literals are more readable!

## Common DOM Methods

| Method | Purpose | Returns |
|--------|---------|---------|
| `getElementById()` | Select by ID | Element |
| `querySelector()` | Select by CSS | First Element |
| `querySelectorAll()` | Select all CSS | NodeList |
| `getElementsByClass()` | Select by class | Collection |

## Variables

### var (Old)
```javascript
var x = 10;
x = 20;  // Can reassign
var x = 5;  // Can redeclare
```

### let (Modern)
```javascript
let x = 10;
x = 20;  // Can reassign
let x = 5;  // Error: already declared
```

### const (Constant)
```javascript
const x = 10;
x = 20;  // Error: cannot modify
```

## File Structure
```
app9/
├── index.html       # HTML with JS
└── script.js        # External JavaScript
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Running JavaScript in browsers
- Inline vs external scripts
- Console API for debugging
- DOM element selection
- Event handling (onclick)
- Function definition and calling
- Passing function arguments
- Debugging with DevTools

## How to Test

1. Open `index.html` in browser
2. Open DevTools: F12
3. Go to Console tab
4. See initial logs:
   - "I am Learning Javascript"
   - The paragraph element object
   - "Hello World"
5. Enter your name in text input
6. Click "Click Me" button
7. See logged message in console

## Practice Exercises

### Easy
1. Console log different values
2. Change function to log something else
3. Create new function
4. Pass different arguments

### Medium
4. Add more input fields
5. Create function with math
6. Log results
7. Use template literals

### Hard
8. Add event listeners with code
9. Modify DOM elements
10. Create interactive features

## Common Mistakes

❌ Referencing elements before they load
❌ Forgetting parentheses when calling functions
❌ Using var in modern code (use let/const)
❌ Console errors blocking script execution

## Browser DevTools Tips

### Console Tab
- **Errors** (red): Problems in code
- **Warnings** (yellow): Potential issues
- **Logs** (gray): Normal output
- Type JS directly to test

### Sources Tab
- View your HTML and JS files
- Set breakpoints for debugging
- Step through code execution

### Application Tab
- View localStorage
- Cookies
- Session storage

## Debugging Tips

```javascript
// Check if element exists
console.log(document.getElementById('id'));

// Log entire objects
console.log(element);

// Conditional logging
if(value) {
    console.log("Condition true");
}

// Count function calls
console.count('functionName');
```

## Next Steps

1. Add more event listeners
2. Manipulate HTML with JavaScript
3. Work with arrays and loops
4. Create interactive features
5. Build mini-projects

## References

- MDN: [JavaScript Basics](https://developer.mozilla.org/en-US/docs/Learn/Getting_started_with_the_web/JavaScript_basics)
- MDN: [DOM API](https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model)
- [JavaScript.info](https://javascript.info/)

## Key Takeaways

✓ JavaScript brings interactivity
✓ Console.log() is essential for debugging
✓ Functions make code reusable
✓ Event listeners handle user actions
✓ DevTools are powerful debugging tools
✓ DOM methods select and manipulate elements

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App8](../app8/README.md)** | **[Next: App10 →](../app10/README.md)**
