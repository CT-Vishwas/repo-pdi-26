# App6: Theme Switcher with Dark Mode

## Overview
An enhanced contact form with dark/light theme switching functionality. Demonstrates dynamic CSS theming, local storage persistence, and user preference management.

## Purpose
Learn and practice:
- Theme switching implementation
- CSS data attributes for styling
- LocalStorage API for persistence
- Dark mode best practices
- Event listeners for interactivity
- User preference handling

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
- Value-based styling
- Easy CSS selection
- Dynamic updates

### Dark Mode CSS
```css
html[data-theme="dark"] {
    background-color: #1a1a1a;
    color: #e0e0e0;
}

html[data-theme="light"] {
    background-color: #ffffff;
    color: #333333;
}
```

## Theme Implementation

### 1. Check Saved Preference
```javascript
const currentTheme = localStorage.getItem('theme');
if(currentTheme) {
    document.documentElement.setAttribute('data-theme', currentTheme);
}
```

### 2. Define Toggle Function
```javascript
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

### 3. Add Event Listener
```javascript
const switchBtn = document.getElementById('switchBtn');
switchBtn.addEventListener('click', toggleTheme);
```

## LocalStorage API

### Store Data
```javascript
localStorage.setItem('theme', 'dark');
```

### Retrieve Data
```javascript
const theme = localStorage.getItem('theme');
```

### Remove Data
```javascript
localStorage.removeItem('theme');
```

### Clear All
```javascript
localStorage.clear();
```

### Key Features
- Persists across page reloads
- Per-domain storage
- 5-10MB typical limit
- Synchronous (not async)
- Simple key-value storage

## CSS Attribute Selectors

Select elements by attribute value:

```css
/* Matches dark theme */
html[data-theme="dark"] { }

/* Matches light theme */
html[data-theme="light"] { }

/* Any element with attribute */
[data-theme] { }

/* Starts with value */
[data-theme^="d"] { }

/* Contains value */
[data-theme*="theme"] { }
```

## Color Schemes

### Dark Theme
```css
[data-theme="dark"] {
    --bg-primary: #1a1a1a;
    --bg-secondary: #2d2d2d;
    --text-primary: #e0e0e0;
    --text-secondary: #b0b0b0;
    --accent: #4a9eff;
    --border: #404040;
}
```

### Light Theme
```css
[data-theme="light"] {
    --bg-primary: #ffffff;
    --bg-secondary: #f5f5f5;
    --text-primary: #333333;
    --text-secondary: #666666;
    --accent: #0066cc;
    --border: #dddddd;
}
```

## Using CSS Variables

```css
/* Define variables */
html[data-theme="dark"] {
    --bg-color: #1a1a1a;
    --text-color: #e0e0e0;
}

/* Use variables */
body {
    background-color: var(--bg-color);
    color: var(--text-color);
}
```

## Step-by-Step Implementation

### 1. HTML Structure
```html
<html>
<head>
    <title>Theme Switcher</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Contact Form</h1>
        <button id="switchBtn">Switch Theme</button>
    </header>
    <!-- Form content -->
    <script>
        // JavaScript here
    </script>
</body>
</html>
```

### 2. CSS Setup
```css
/* Light theme (default) */
html[data-theme="light"],
html {
    --bg: white;
    --text: #333;
}

/* Dark theme */
html[data-theme="dark"] {
    --bg: #1a1a1a;
    --text: #e0e0e0;
}

/* Apply colors */
body {
    background: var(--bg);
    color: var(--text);
}
```

### 3. JavaScript Logic
```javascript
// Element reference
const btn = document.getElementById('switchBtn');

// Get saved theme
const saved = localStorage.getItem('theme');
if(saved) {
    document.documentElement.setAttribute('data-theme', saved);
}

// Toggle function
function toggle() {
    const current = localStorage.getItem('theme');
    const next = current === 'dark' ? 'light' : 'dark';
    
    document.documentElement.setAttribute('data-theme', next);
    localStorage.setItem('theme', next);
}

// Add listener
btn.addEventListener('click', toggle);
```

## Complete Example

### HTML
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Theme Switcher</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>Theme Demo</h1>
        <button id="themeToggle">🌙</button>
    </header>
    <main>
        <p>Click the button to switch themes</p>
    </main>
    <script>
        const toggle = document.getElementById('themeToggle');
        const html = document.documentElement;
        
        // Load saved theme
        const theme = localStorage.getItem('theme') || 'light';
        html.setAttribute('data-theme', theme);
        
        // Toggle theme
        toggle.addEventListener('click', () => {
            const current = html.getAttribute('data-theme');
            const next = current === 'light' ? 'dark' : 'light';
            html.setAttribute('data-theme', next);
            localStorage.setItem('theme', next);
            toggle.textContent = next === 'light' ? '🌙' : '☀️';
        });
    </script>
</body>
</html>
```

### CSS
```css
html {
    --bg: white;
    --text: black;
    --input-bg: white;
    --input-text: black;
}

html[data-theme="dark"] {
    --bg: #1a1a1a;
    --text: #e0e0e0;
    --input-bg: #2d2d2d;
    --input-text: #e0e0e0;
}

body {
    background: var(--bg);
    color: var(--text);
    transition: background 0.3s, color 0.3s;
}

input, textarea, select {
    background: var(--input-bg);
    color: var(--input-text);
    border: 1px solid var(--bg);
}

button {
    background: var(--bg);
    color: var(--text);
    border: 2px solid var(--text);
}
```

## Form Elements from App5

This app includes the same contact form as app5:
- Full name, email, phone inputs
- Age number input
- City select dropdown
- State datalist
- Gender radio buttons
- Profile picture upload
- Submit/Reset buttons

**Plus**: Theme switching functionality

## Accessibility Considerations

✓ Sufficient contrast in both themes
✓ Icons with text labels
✓ Keyboard accessible toggle
✓ Respects user preferences
✓ Smooth transitions
✓ No flashing/animations

### Prefers Dark Mode
```css
@media (prefers-color-scheme: dark) {
    html {
        --bg: #1a1a1a;
        --text: #e0e0e0;
    }
}
```

## Browser Support

| Feature | Support |
|---------|---------|
| data-* attributes | All browsers |
| CSS variables | Chrome 49+, Firefox 31+, Safari 9.1+ |
| LocalStorage | All browsers |
| Attribute selectors | All browsers |

## Performance Tips

1. **Cache DOM queries**
   ```javascript
   const btn = document.getElementById('switchBtn');
   // Reuse 'btn' variable
   ```

2. **Batch DOM updates**
   ```javascript
   // Bad: Multiple updates
   el.style.color = 'red';
   el.style.bg = 'blue';
   
   // Good: Single update
   el.setAttribute('data-theme', 'dark');
   ```

3. **Use CSS transitions**
   ```css
   body {
       transition: background 0.3s ease;
   }
   ```

## File Structure
```
app6/
├── index.html          # Form with theme switch
├── style.css           # Themed styling
└── .vscode/settings.json
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Theme switching implementation
- CSS data attributes
- CSS variables (custom properties)
- LocalStorage API
- Event listeners
- Dark mode design
- User preference persistence
- Attribute selectors
- Smooth transitions

## How to View

1. Open `index.html` in browser
2. View default theme
3. Click "Switch Theme" button
4. Observe color changes
5. Reload page - Theme persists!
6. Check DevTools:
   - Application tab → LocalStorage
   - Look for 'theme' key

## Practice Exercises

### Easy
1. Change theme colors
2. Add smooth transitions
3. Update button text based on theme

### Medium
4. Add system preference detection
   ```javascript
   const isDark = window.matchMedia('(prefers-color-scheme: dark)').matches;
   ```

5. Create multiple themes (3+ options)
6. Add icon indicators (sun/moon emoji)

### Hard
7. Save theme per user account
8. Add theme preview before apply
9. Create custom theme builder
10. Implement theme scheduling

## Common Patterns

### Simple Toggle
```javascript
button.addEventListener('click', () => {
    const theme = localStorage.getItem('theme');
    const next = theme === 'dark' ? 'light' : 'dark';
    document.documentElement.setAttribute('data-theme', next);
    localStorage.setItem('theme', next);
});
```

### With System Preference
```javascript
function initTheme() {
    const saved = localStorage.getItem('theme');
    const system = window.matchMedia('(prefers-color-scheme: dark)').matches;
    const theme = saved || (system ? 'dark' : 'light');
    document.documentElement.setAttribute('data-theme', theme);
}
```

## Testing

### Manual Testing
1. Switch to dark mode
2. Refresh page - Should stay dark
3. Switch to light mode
4. Navigate away and back - Should remember
5. Clear localStorage and refresh - Uses default

### Browser DevTools
1. F12 → Application
2. LocalStorage → Current domain
3. Look for 'theme' key
4. Edit to test different values

## Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| Theme doesn't persist | localStorage not set | Check JavaScript runs |
| No visual change | CSS not applied | Check data-theme selector |
| Flashing on load | Theme loads late | Add theme to HTML tag early |
| Mobile not saving | localStorage cleared | Check browser settings |

## Best Practices

✓ Store preference in localStorage
✓ Check on page load
✓ Support system preference
✓ Provide clear toggle button
✓ Use smooth transitions
✓ Test both themes
✓ Ensure sufficient contrast
✓ Document theme system

## Advanced Features

### Scheduled Themes
```javascript
function getScheduledTheme() {
    const hour = new Date().getHours();
    return hour < 6 || hour > 18 ? 'dark' : 'light';
}
```

### Multi-Theme System
```javascript
const themes = ['light', 'dark', 'sepia', 'high-contrast'];
let current = 0;

function nextTheme() {
    current = (current + 1) % themes.length;
    setTheme(themes[current]);
}
```

## Key Takeaways

✓ Data attributes enable flexible styling
✓ LocalStorage persists user preferences
✓ CSS variables simplify theme management
✓ Theme switching improves accessibility
✓ Dark mode reduces eye strain
✓ Respect user system preferences

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App5](../app5/README.md)** | **[Next: App7 →](../app7/README.md)**
