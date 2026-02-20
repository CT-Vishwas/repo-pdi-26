# App12: Theme Switcher Contact Form

## Overview
Contact form with dynamic theme switching. Combines form handling with localStorage persistence and dark/light mode support.

## Purpose
Learn and practice:
- Theme switching with data attributes
- LocalStorage API
- CSS variable theming
- Event listeners
- Dynamic HTML attributes
- User preferences
- Contact form inputs

## Key Features

### Theme Toggle Button
```html
<header>
    <h1>A Simple Contact Form</h1>
    <button id="switchBtn" type="button">Switch Theme</button>
</header>
```

### Data Attribute
```html
<html data-theme="dark">
```

Value changes with theme.

## JavaScript Implementation

### Load Saved Theme
```javascript
const currentTheme = localStorage.getItem('theme');
if(!currentTheme){
    document.documentElement.setAttribute('data-theme', currentTheme);
}
```

### Toggle Function
```javascript
function toggleTheme(){
    const currentTheme = localStorage.getItem('theme');
    if(currentTheme === 'dark'){
        document.documentElement.setAttribute('data-theme', 'light');
        localStorage.setItem('theme','light');
    } else {
        document.documentElement.setAttribute('data-theme', 'dark');
        localStorage.setItem('theme','dark');
    }
}
```

### Add Event Listener
```javascript
switchBtn.addEventListener('click', toggleTheme);
```

## CSS Implementation

### Light Theme (data-theme="light")
```css
html[data-theme="light"] {
    --bg: white;
    --text: #333;
    --input-bg: white;
}
```

### Dark Theme (data-theme="dark")
```css
html[data-theme="dark"] {
    --bg: #1a1a1a;
    --text: #e0e0e0;
    --input-bg: #2d2d2d;
}
```

### Apply Variables
```css
body {
    background: var(--bg);
    color: var(--text);
}

input {
    background: var(--input-bg);
    color: var(--text);
}
```

## Form Structure

Same comprehensive contact form as app5:
- Full name, email, phone inputs
- Age number input
- City dropdown
- State datalist
- Gender radio buttons
- Profile upload
- Submit/Reset buttons

**Plus**: Theme switching!

## LocalStorage Details

### Store
```javascript
localStorage.setItem('theme', 'dark');
```

### Retrieve
```javascript
const theme = localStorage.getItem('theme');
```

### Persist
Data survives:
- Page refresh
- Browser close/open
- Navigate away and back

## CSS Attribute Selector

```css
html[data-theme="dark"] { }    /* Dark theme */
html[data-theme="light"] { }   /* Light theme */
```

## Browser Support

✓ All modern browsers support:
- data attributes
- localStorage
- CSS variables (98%+)

## File Structure
```
app12/
├── index.html      # Form with theme toggle
└── style.css       # Themed styles
```

## Learning Outcomes

- Theme switching mechanism
- LocalStorage API
- CSS data attributes
- CSS variables
- Event listeners
- Dynamic HTML manipulation
- User preference persistence
- Contact forms

## How to Test

1. Open in browser
2. View default theme
3. Click "Switch Theme"
4. Colors change
5. Reload page - theme persists
6. Check DevTools Application tab
7. See theme in localStorage

## Testing ThemeStorage

1. Open DevTools (F12)
2. Go to Application tab
3. Click LocalStorage
4. Select current domain
5. Look for 'theme' key
6. Click button to see value change

## Practice Exercises

**Easy**: Change theme colors
**Medium**: Add system preference detection
**Hard**: Create 3+ theme options

## Common Issues

❌ Theme doesn't persist - localStorage not enabled
❌ No visual change - CSS variables not applied
❌ Flashing on load - Theme loaded too late

## Key Takeaways

✓ localStorage saves user preferences
✓ data attributes enable flexible styling
✓ CSS variables simplify theme management
✓ Respect user preferences improves UX
✓ Theme switching enhances accessibility

## Author
Vishwas K Singh

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App11](../app11/README.md)** | **[Next: App13 →](../app13/README.md)**
