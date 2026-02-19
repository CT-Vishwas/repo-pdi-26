# Frontend Basics - Complete Documentation

A comprehensive collection of 15 frontend web applications demonstrating HTML, CSS, and JavaScript fundamentals. These projects progress from basic HTML structure to advanced JavaScript patterns and API integration.

## 📋 Applications Overview

| App | Name | Type | Technologies | Concepts |
|-----|------|------|--------------|----------|
| [app1](#app1) | Web Page Structure | HTML | HTML5 | Semantic tags, headings, lists |
| [app2](#app2) | Tourist Attractions | HTML | HTML5 | Semantic structure, sections |
| [app3](#app3) | Resume/Portfolio | HTML | HTML5 | Tables, links, contact info |
| [app4](#app4) | Media Player | HTML | HTML5 | Audio, video tags |
| [app5](#app5) | Contact Form | HTML+CSS | HTML5, CSS3 | Forms, inputs, styling |
| [app6](#app6) | Styled Contact Form | HTML+CSS | HTML5, CSS3 | Forms, styling |
| [app7](#app7) | Grid Layout | HTML+CSS | CSS Grid | Layout, responsive design |
| [app8](#app8) | Flexbox Layout | HTML+CSS | Flexbox | Layout, responsive design |
| [app9](#app9) | JavaScript Basics | HTML+JS | JavaScript | DOM, events, console |
| [app10](#app10) | Variables & Types | HTML+JS | JavaScript | Variables, data types |
| [app11](#app11) | Simple Calculator | HTML+JS | JavaScript | Events, DOM, logic |
| [app12](#app12) | Theme Switcher | HTML+CSS+JS | HTML5, CSS3, JS | Local storage, dark mode |
| [app13](#app13) | DOM Manipulation | HTML+JS | JavaScript | DOM creation, classList |
| [app14](#app14) | Array Operations | HTML+JS | JavaScript | Arrays, methods, console |
| [app15](#app15) | User API Fetch | HTML+JS | JavaScript, Bootstrap | Async, fetch API, DOM |

---

## Learning Path

### Beginner (HTML Fundamentals)
- **app1**: Start here - basic HTML structure
- **app2**: Practice semantic HTML
- **app3**: Learn complex HTML (tables, links)
- **app4**: Explore media elements

### Intermediate (CSS & Forms)
- **app5**: Master form elements
- **app6**: Add professional styling
- **app7**: Learn CSS Grid
- **app8**: Understand Flexbox

### Advanced (JavaScript)
- **app9**: JavaScript in browsers
- **app10**: Variables and data types
- **app11**: Interactive features
- **app12**: State management
- **app13**: Dynamic DOM manipulation
- **app14**: Working with arrays
- **app15**: API integration

---

## <a name="app1"></a>App1: Web Page Structure

### Purpose
Demonstrate fundamental HTML structure and semantic tag usage.

### Features
- Proper DOCTYPE and meta tags
- Heading hierarchy (h1, h2, h3)
- Paragraph and list elements
- Text formatting (strong, em, mark, del)
- Semantic structure

### Key Elements
```html
<h1> - Main heading
<h2>, <h3> - Subheadings
<p> - Paragraphs
<ul>, <li> - Unordered lists
<strong> - Bold text
<em> - Italic text
<mark> - Highlighted text
<del> - Strikethrough text
```

### Learning Outcomes
- HTML5 document structure
- Semantic HTML tags
- Text formatting options
- List creation
- Accessibility basics

### File Structure
```
app1/
├── index.html      # Main HTML document
└── .vscode/settings.json
```

---

## <a name="app2"></a>App2: Tourist Attractions

### Purpose
Create a structured informational page using semantic HTML.

### Features
- Header and footer sections
- Semantic HTML structure
- Navigation and main content areas
- Tourist attraction information
- Link usage

### Key Concepts
- `<header>` - Page header
- `<section>` - Content sections
- `<main>` - Main content
- `<footer>` - Page footer
- `<ul>`, `<li>` - Lists of attractions

### Content
Information about Mysuru tourist attractions including:
- Chamundi Hill
- Mysuru Palace
- Rangantittu Bird Sanctuary
- Jagan Mohan Palace

### Learning Outcomes
- Semantic HTML structure
- Proper use of header/footer/section
- List organization
- Text emphasis (strong, em)

### File Structure
```
app2/
├── index.html      # Tourist information page
└── .vscode/settings.json
```

---

## <a name="app3"></a>App3: Resume/Portfolio

### Purpose
Build a complex multi-section resume using tables, links, and semantic markup.

### Features
- Profile image display
- Contact information with links
- Social media links
- Email and phone links
- Experience section
- Education table
- Horizontal rule separator

### Key Elements
```html
<img> - Profile picture
<a href="mailto:"> - Email link
<a href="tel:"> - Phone link
<a target="_blank" rel="noopener"> - External links
<table>, <tr>, <td>, <th> - Education table
<thead>, <tbody> - Table sections
```

### Sections
1. Header with profile image
2. Contact information
3. Social links (LinkedIn, GitHub)
4. Experience details
5. Education table

### Learning Outcomes
- Image insertion
- Creating hyperlinks
- Email and phone links
- Table creation and structure
- Resume organization

### File Structure
```
app3/
├── index.html      # Resume/portfolio page
└── .vscode/settings.json
```

---

## <a name="app4"></a>App4: Media Player

### Purpose
Demonstrate HTML5 audio and video element usage.

### Features
- Video player with controls
- Loop playback
- Audio player with controls
- Muted audio by default
- Responsive media sizing

### Key Elements
```html
<video>
  <source> - Video file
  controls - Play/pause/volume controls
  loop - Continuous playback
  width - Video width

<audio>
  <source> - Audio file
  controls - Player controls
  muted - Silent by default
```

### Media Features
- Video: MP4 format (H.264 codec)
- Audio: MP3 format
- Custom sizing
- Browser compatibility with fallbacks

### Learning Outcomes
- HTML5 media elements
- Video/audio attributes
- Source elements
- Responsive media sizing
- Playback controls

### File Structure
```
app4/
├── index.html      # Media player page
├── sample.mp4      # Sample video file
└── sample_audio.mp3 # Sample audio file
```

---

## <a name="app5"></a>App5: Contact Form

### Purpose
Learn form creation with various input types and CSS styling.

### Features
- Text, email, and tel inputs
- Number input with range
- Select dropdown
- Datalist with autocomplete
- Radio buttons
- File upload
- Form buttons (Submit, Reset)
- Input validation
- Fieldset and legend

### Form Fields
1. **Full Name** - Text input
2. **Email** - Email input with validation
3. **Phone** - Tel input with pattern
4. **Age** - Number input with min/max
5. **City** - Select dropdown
6. **State** - Datalist (autocomplete)
7. **Gender** - Radio buttons
8. **Profile Picture** - File input

### Styling
```css
body background: aquamarine
Labels styled with monospace font
Input styling
Button styling
```

### Form Elements
```html
<fieldset> - Group related inputs
<legend> - Fieldset title
<label> - Input labels
<input type="text|email|tel|number|file|radio">
<select> - Dropdown
<datalist> - Autocomplete suggestions
<button type="submit|reset">
```

### Learning Outcomes
- Form creation
- Input types and attributes
- Form validation
- Styling forms with CSS
- Input placeholders
- File uploads

### File Structure
```
app5/
├── index.html      # Contact form
├── style.css       # Form styling
└── .vscode/settings.json
```

---

## <a name="app6"></a>App6: Styled Contact Form with Dark Mode

### Purpose
Enhance the contact form with professional CSS styling and dark/light theme switching.

### Features
- Same form as app5
- Professional CSS styling
- Dark mode support
- Light mode support
- Theme persistence (localStorage)
- Dynamic theme switching with button
- Better visual hierarchy

### Dark Mode Implementation
```javascript
- localStorage stores theme preference
- data-theme attribute on HTML element
- CSS variables for theme colors
- Toggle button switches themes
- Persistence across page reloads
```

### CSS Features
- Custom color schemes
- Form styling
- Button effects
- Input styling
- Label formatting
- Responsive layout

### Interactive Features
```html
<button id="switchBtn"> - Theme toggle
```

### JavaScript
```javascript
- localStorage.getItem/setItem
- document.documentElement.setAttribute
- Event listeners for buttons
- Theme toggle function
```

### Learning Outcomes
- CSS styling best practices
- Dark mode implementation
- Local storage API
- Dynamic CSS with data attributes
- User preference persistence
- Theme management

### File Structure
```
app6/
├── index.html      # Form with theme switch
├── style.css       # Styled form with theme support
└── .vscode/settings.json
```

---

## <a name="app7"></a>App7: CSS Grid Layout

### Purpose
Demonstrate CSS Grid for creating responsive multi-column layouts.

### Features
- CSS Grid layout
- Equal-width columns
- Full viewport height (100vh)
- Gap between columns
- Responsive design
- Three-column layout

### Layout Code
```css
display: grid;
grid-template-rows: 100vh;
grid-template-columns: repeat(3, 1fr);
gap: 5px;
```

### Layout Benefits
- Perfect equal columns
- Responsive without media queries
- Easy gap management
- Consistent alignment

### Concepts Covered
- Grid container and items
- grid-template-columns
- repeat() function
- 1fr (fractional units)
- Gap property
- Viewport height (100vh)

### Learning Outcomes
- CSS Grid fundamentals
- Column creation
- Responsive layouts
- Grid sizing
- Gap management

### File Structure
```
app7/
├── index.html      # Grid layout demo
└── style.css       # Grid styling
```

---

## <a name="app8"></a>App8: Flexbox Layout

### Purpose
Demonstrate Flexbox for creating flexible layouts.

### Features
- Flexbox layout
- Two-column split layout
- Full viewport height
- Equal-width sections
- Flexible container

### Layout Code
```css
.container {
  display: flex;
  height: 100vh;
}
.left, .right {
  flex: 1;
  /* Equal width */
}
```

### Flexbox Benefits
- Flexible sizing
- Easy centering
- Order control
- Alignment options
- Simple two-column layout

### Concepts Covered
- Flexbox container
- Flex items
- Flex property (shorthand)
- Flex-direction
- Height management
- Equal width distribution

### Learning Outcomes
- Flexbox fundamentals
- Two-column layouts
- Item distribution
- Flex sizing
- Container alignment

### File Structure
```
app8/
├── index.html      # Flexbox layout demo
└── style.css       # Flexbox styling
```

---

## <a name="app9"></a>App9: JavaScript Basics

### Purpose
Introduction to JavaScript in browsers and DOM manipulation.

### Features
- Inline JavaScript in HTML
- External JavaScript file
- Console logging
- DOM element selection
- Button click events
- Event handling
- Function creation

### Key JavaScript Concepts
```javascript
console.log() - Output to console
document.getElementById() - Select elements
const, let, var - Variable declaration
function - Function definition
window.onclick - Event handling
Arguments and parameters
```

### Code Examples
```javascript
// Select element
var para = document.getElementById('para')

// Function definition
function btnclick(fname) {
    console.log('Name Entered is: ' + fname)
}

// Event handling
<button onclick="btnclick(fullname.value)">
```

### Learning Outcomes
- Browser console
- DOM selection
- Event listeners
- Function calling
- Variable scoping
- Browser APIs
- Debugging with console

### File Structure
```
app9/
├── index.html      # HTML with inline JS
└── script.js       # External JavaScript
```

---

## <a name="app10"></a>App10: Variables & Data Types

### Purpose
Learn JavaScript variables and data types fundamentals.

### Features
- Variable declaration (var, let, const)
- Variable reassignment
- Data types (String, Number, Boolean, null, undefined, BigInt)
- Type checking with typeof
- Comments (single and multi-line)
- Naming conventions
- Variable scope

### Variable Declaration
```javascript
var user = "vishwas";      // Function scope
let age = 10;               // Block scope
const minAge = 18;          // Constant (immutable)
```

### Data Types
```javascript
// String
let name = "Vishwas"

// Number
let age = 25
let quantity = 23.5678
let hexNumber = 0x23

// Boolean
let isANumber = true
let isGreater = 5 > 6

// undefined
let price;  // Not assigned

// null
let cost = null

// BigInt
let largeNumber = 12637193018982918546n
```

### Concepts Covered
- Variable declaration methods
- Type coercion
- typeof operator
- Naming conventions
- Comments
- Scope (var vs let vs const)
- Variable reassignment

### Learning Outcomes
- Variable types and usage
- Data type differences
- Type checking
- Naming best practices
- Comments usage
- Scope understanding
- Immutability with const

### File Structure
```
app10/
└── index.html      # HTML with commented JS examples
```

---

## <a name="app11"></a>App11: Simple Calculator

### Purpose
Build an interactive calculator using JavaScript events and DOM manipulation.

### Features
- Number input fields
- Operator selection (dropdown)
- Calculate button
- Result display
- Switch statement for operations
- Event listeners
- Input validation
- Division by zero handling

### Operations
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)

### JavaScript Features
```javascript
parseInt() - Convert strings to integers
switch statement - Operation selection
Template literals - String formatting
getElementById() - Element selection
addEventListener() - Event handling
textContent - Set element text
```

### Code Structure
```javascript
function handleOnclick() {
    // Get input values
    let num1 = parseInt(document.getElementById('num1').value);
    let num2 = parseInt(document.getElementById('num2').value);
    let op = document.getElementById('op').value;
    
    // Switch on operation
    switch (op) {
        case '+':
            // Add numbers
        case '-':
            // Subtract
        // ... etc
    }
}
```

### Special Cases
- Division by zero handling
- Integer conversion
- Result formatting

### Learning Outcomes
- Form input handling
- Event listeners
- Switch statements
- Mathematical operations
- Error handling
- DOM manipulation
- User feedback

### File Structure
```
app11/
└── index.html      # Calculator application
```

---

## <a name="app12"></a>App12: Theme Switcher

### Purpose
Create a dynamic theme switcher with persistent storage.

### Features
- Light/Dark theme support
- Theme toggle button
- LocalStorage persistence
- Dynamic CSS application
- Data attributes for styling
- Professional contact form
- Smooth theme switching

### Theme Implementation
```html
<!-- Data attribute for styling -->
<html data-theme="dark">

<!-- Toggle button -->
<button id="switchBtn">Switch Theme</button>
```

### JavaScript Logic
```javascript
// Get saved theme
const currentTheme = localStorage.getItem('theme');

// Set theme on page load
if(currentTheme) {
    document.documentElement.setAttribute('data-theme', currentTheme);
}

// Toggle theme
function toggleTheme() {
    const current = localStorage.getItem('theme');
    if(current === 'dark') {
        document.documentElement.setAttribute('data-theme', 'light');
        localStorage.setItem('theme', 'light');
    } else {
        document.documentElement.setAttribute('data-theme', 'dark');
        localStorage.setItem('theme', 'dark');
    }
}
```

### CSS Styling
```css
/* Light mode */
html[data-theme="light"] { }

/* Dark mode */
html[data-theme="dark"] { }
```

### Learning Outcomes
- LocalStorage API
- Data attributes
- CSS attribute selectors
- Event listeners
- Theme management
- User preferences
- State persistence
- Dynamic styling

### File Structure
```
app12/
├── index.html      # Form with theme button
└── style.css       # Theme styles
```

---

## <a name="app13"></a>App13: DOM Manipulation

### Purpose
Learn dynamic DOM element creation and removal.

### Features
- Create new elements
- Append elements to DOM
- Remove elements
- Toggle CSS classes
- Event listeners
- Hide/show functionality

### JavaScript Methods
```javascript
document.createElement() - Create elements
element.appendChild() - Add child
element.remove() - Delete element
element.classList.toggle() - Toggle class
element.textContent - Set text
```

### Code Example
```javascript
// Hide element
function hideEle() {
    elementHide.remove();
}

// Add element
function addNewEle() {
    let newEle = document.createElement('div');
    newEle.textContent = "Hello";
    addEle.appendChild(newEle);
}
```

### Interactive Features
- Hide button - Removes element
- Add button - Creates and appends new div
- Dynamic content creation
- Event-driven DOM changes

### Learning Outcomes
- DOM creation
- Element manipulation
- Class toggling
- Dynamic content
- Event handling
- DOM traversal
- Element removal

### File Structure
```
app13/
└── index.html      # DOM manipulation demo
```

---

## <a name="app14"></a>App14: Array Operations

### Purpose
Learn array methods and manipulations in JavaScript.

### Features
- Array creation
- Push - Add to end
- Pop - Remove from end
- Shift - Remove from start
- Unshift - Add to start
- Array iteration
- Console logging

### Array Methods
```javascript
push() - Add items to array
pop() - Remove last item
shift() - Remove first item
unshift() - Add items to start
```

### Example Code
```javascript
let shoppingCart = ['Milk', 'Bread', 'Eggs'];

// Add items
shoppingCart.push('Cheese', 'Apples');

// Remove from end
const removed = shoppingCart.pop();

// Remove from start
const first = shoppingCart.shift();

// Add to start
shoppingCart.unshift('Butter', 'Juice');
```

### Use Case
Shopping cart management with dynamic items.

### Learning Outcomes
- Array creation
- Array methods
- Mutable operations
- Array iteration
- Real-world applications
- Console debugging
- Data structure manipulation

### File Structure
```
app14/
├── index.html      # Array demo page
├── script.js       # Array operations
├── script1-6.js    # Additional scripts
└── utils.js        # Utility functions
```

---

## <a name="app15"></a>App15: User API Fetch

### Purpose
Fetch data from external API and display it dynamically using Bootstrap.

### Features
- Async/await for API calls
- Fetch API
- External data (Random User API)
- Destructuring assignment
- Dynamic DOM creation
- Bootstrap styling
- Responsive card layout
- Page load event

### API Integration
```javascript
const api_url = 'https://randomuser.me/api'

async function getUser() {
    const response = await fetch(api_url);
    const data = await response.json();
    // Process data
}
```

### Data Processing
```javascript
// Destructuring
let {title, first, last} = user.name;
let {email} = user;
let {city, state, country} = user.location;
let {medium} = user.picture;

// Create display
let fullname = title + ". " + first + " " + last;
```

### Bootstrap Components
- Navbar
- Card layout
- Responsive grid
- Footer
- Image styling

### Features
- Fetches random user API
- Displays user profile card
- Shows user information
- Displays user photo
- Responsive design
- Professional layout

### Learning Outcomes
- Async/await syntax
- Fetch API
- Promise handling
- JSON parsing
- Destructuring
- Bootstrap framework
- DOM manipulation
- External APIs
- Responsive design

### File Structure
```
app15/
├── index.html      # User card page
├── index.js        # Fetch logic
├── style.css       # Custom styles
└── Bootstrap CDN   # External styling
```

---

## Technology Stack Summary

### HTML5 Features Used
- Semantic elements (header, main, section, article, footer)
- Form elements (input, select, datalist, fieldset)
- Media elements (audio, video)
- Data attributes
- Meta tags for viewport and charset

### CSS3 Features Used
- Flexbox layout
- CSS Grid
- Custom properties/variables
- Media queries (implicit)
- Attribute selectors
- Pseudo-classes

### JavaScript Features Used
- Variables (var, let, const)
- Functions
- Events and listeners
- DOM manipulation (getElementById, createElement, appendChild)
- Array methods (push, pop, shift, unshift)
- Async/await
- Fetch API
- LocalStorage API
- Template literals
- Destructuring
- Switch statements

### External Libraries
- Bootstrap 5.3.8 (app15)

---

## Development Setup

### Prerequisites
- Web browser (Chrome, Firefox, Safari, Edge)
- Text editor (VS Code recommended)
- Live Server extension (optional for local testing)

### Opening Applications
1. Navigate to app folder
2. Open `index.html` in browser
3. Or use VS Code Live Server

### Browser Developer Tools
- F12 or Ctrl+Shift+I - Open DevTools
- Console tab - View console.log output
- Inspector tab - View HTML structure
- Network tab - Monitor API calls
- Application tab - View localStorage

---

## Learning Recommendations

### For Beginners
1. Start with app1-4 to understand HTML
2. Move to app5-8 for CSS
3. Progress to app9-15 for JavaScript

### Practice Projects
- Modify form styling (app5/6)
- Change calculator operations (app11)
- Create new theme colors (app12)
- Add more array operations (app14)
- Fetch different API (app15)

### Challenge Activities
1. Add validation to calculator
2. Implement multi-level undo in theme switcher
3. Create draggable elements (app13)
4. Build todo list with localStorage
5. Create multi-user display (app15)

---

## Common Patterns

### Form Handling
```html
<form>
  <input type="text" id="name">
  <button type="submit">Submit</button>
</form>

<script>
  document.getElementById('form').addEventListener('submit', (e) => {
    e.preventDefault();
    // Handle form
  });
</script>
```

### Event Listeners
```javascript
element.addEventListener('click', function() {
    // Handle click
});
```

### DOM Manipulation
```javascript
const el = document.getElementById('id');
el.appendChild(document.createElement('div'));
el.remove();
```

### Async Operations
```javascript
async function getData() {
    const response = await fetch(url);
    const data = await response.json();
    return data;
}
```

---

## Best Practices Applied

✓ Semantic HTML structure
✓ Accessible form labels
✓ CSS separation from HTML
✓ Event delegation
✓ Async/await for clean code
✓ Local storage for persistence
✓ Bootstrap for responsive design
✓ Error handling
✓ Comments and documentation
✓ Progressive enhancement

---

## Performance Tips

- Minimize reflows by batch DOM changes
- Use event delegation for dynamic elements
- Cache DOM selections
- Use const/let instead of var
- Async load external scripts
- Compress images
- Use CDN for libraries

---

## Browser Compatibility

- **HTML5**: All modern browsers
- **CSS Grid/Flexbox**: Chrome 51+, Firefox 52+, Safari 10.1+, Edge 15+
- **Fetch API**: Chrome 40+, Firefox 39+, Safari 10.1+, Edge 14+
- **LocalStorage**: All browsers
- **Async/Await**: Chrome 55+, Firefox 52+, Safari 10.1+, Edge 15+

---

## Resources

### Documentation
- [MDN Web Docs](https://developer.mozilla.org/)
- [W3Schools](https://www.w3schools.com/)
- [HTML Living Standard](https://html.spec.whatwg.org/)
- [CSS-Tricks](https://css-tricks.com/)

### Tools
- VS Code
- Browser DevTools
- Live Server
- Bootstrap CDN
- Random User API

---

## Author
Vishwas K Singh

## License
MIT

## Last Updated
February 2026

