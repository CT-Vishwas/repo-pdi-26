# App8: Flexbox Layout

## Overview
Demonstrates Flexbox for creating flexible one-dimensional layouts. Shows how to create a two-column layout with equal widths using CSS Flexbox.

## Purpose
Learn and practice:
- Flexbox fundamentals
- Flex container and items
- Equal-width columns
- Flexible sizing
- Layout properties
- Responsive layouts

## Key Concepts

### Flexbox Setup

```css
.container {
    display: flex;
    height: 100vh;
}

.left, .right {
    flex: 1;  /* Equal width */
}
```

### What This Does
- **display: flex** - Enable Flexbox
- **height: 100vh** - Full viewport height
- **flex: 1** - Each child gets equal space

## Layout Structure

```
┌─────────────────────────────┐
│                             │
│    Left (flex: 1)           │
│                             │
├─────────────┬───────────────┤
│             │               │
│   flex:1    │   flex:1      │  100vh height
│  (50%)      │   (50%)       │
│             │               │
└─────────────┴───────────────┘

Width: Full container width
Height: 100vh (Viewport height)
```

## HTML Structure

```html
<div style="display: flex; height: 100vh;">
    <div style="flex: 1;">A</div>
    <div style="flex: 1;">B</div>
</div>
```

Simple and elegant!

## CSS Explanation

### display: flex
Enables Flexbox:
```css
display: flex;
```

### height: 100vh
Full viewport height:
```css
height: 100vh;        /* 100% of viewport height */
height: 500px;        /* Fixed height */
height: auto;         /* Content height */
```

### flex: 1
Shorthand for flexible sizing:
```css
flex: 1;  /* Shorthand */

/* Equivalent to: */
flex-grow: 1;      /* Grow to fill space */
flex-shrink: 1;    /* Shrink if needed */
flex-basis: 0;     /* Base size */
```

## Flex Properties

### Flex Container Properties

| Property | Values | Purpose |
|----------|--------|---------|
| flex-direction | row, column | Main axis direction |
| flex-wrap | wrap, nowrap | Wrap items or not |
| justify-content | flex-start, center, space-between | Main axis alignment |
| align-items | flex-start, center, stretch | Cross axis alignment |
| gap | 10px | Spacing between items |

### Flex Item Properties

| Property | Purpose | Example |
|----------|---------|---------|
| flex | Shorthand | flex: 1 |
| flex-grow | Growth factor | flex-grow: 2 |
| flex-shrink | Shrink factor | flex-shrink: 1 |
| flex-basis | Base size | flex-basis: 200px |
| order | Item order | order: 2 |
| align-self | Individual alignment | align-self: center |

## Common Flexbox Patterns

### Equal Width Columns
```css
.container {
    display: flex;
}
.item {
    flex: 1;  /* All equal */
}
```

### Ratio-Based Columns
```css
.container {
    display: flex;
}
.item:first-child {
    flex: 2;  /* 2/3 width */
}
.item:last-child {
    flex: 1;  /* 1/3 width */
}
```

### Fixed and Flexible
```css
.container {
    display: flex;
}
.sidebar {
    flex: 0 0 250px;  /* Fixed 250px */
}
.main {
    flex: 1;          /* Remaining space */
}
```

### Center Everything
```css
.container {
    display: flex;
    justify-content: center;    /* Horizontal center */
    align-items: center;        /* Vertical center */
    height: 100vh;
}
```

### Row Layout (Default)

```css
.container {
    display: flex;
    flex-direction: row;  /* Default */
}
```

Items arranged left to right.

### Column Layout

```css
.container {
    display: flex;
    flex-direction: column;
}
```

Items stacked top to bottom.

## Flex Direction

```
row (→):           col-rev (↑):
┌─┬─┬─┐           ┌─┐
│1│2│3│           │3│
└─┴─┴─┘           │2│
                  │1│
                  └─┘

row-rev (←):       column (↓):
┌─┬─┬─┐           ┌─┐
│3│2│1│           │1│
└─┴─┴─┘           │2│
                  │3│
                  └─┘
```

## Complete Example

### HTML
```html
<!DOCTYPE html>
<html>
<head>
    <title>Flexbox</title>
    <style>
        .container {
            display: flex;
            height: 100vh;
            gap: 0;
        }
        
        .left, .right {
            flex: 1;
        }
        
        .left {
            background: lightblue;
        }
        
        .right {
            background: lightgreen;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="left">Left (A)</div>
        <div class="right">Right (B)</div>
    </div>
</body>
</html>
```

## Comparison: Flexbox vs Grid

| Feature | Flexbox | Grid |
|---------|---------|------|
| Dimensions | 1D | 2D |
| Direction | Single axis | Both axes |
| Alignment | Content-based | Space-based |
| Use Case | Components | Layouts |
| Browser Support | Modern | Modern |

## Common Flexbox Layouts

### Navbar
```css
nav {
    display: flex;
    justify-content: space-around;
    align-items: center;
}
```

### Card Grid
```css
.cards {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
}
.card {
    flex: 1 1 300px;  /* Min 300px */
}
```

### Sidebar + Main
```css
body {
    display: flex;
    height: 100vh;
}
aside {
    flex: 0 0 250px;  /* Fixed width */
}
main {
    flex: 1;          /* Remaining space */
}
```

### Centered Content
```css
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}
```

### Space Distribution
```css
/* Space around items */
justify-content: space-around;

/* Space between items */
justify-content: space-between;

/* Equal space between and outside */
justify-content: space-evenly;

/* Left-align items */
justify-content: flex-start;

/* Right-align items */
justify-content: flex-end;

/* Center items */
justify-content: center;
```

### Item Alignment
```css
/* All items align */
align-items: center;      /* Vertical center */
align-items: flex-start;  /* Top align */
align-items: flex-end;    /* Bottom align */
align-items: stretch;     /* Full height */
```

## File Structure
```
app8/
├── index.html      # Flexbox layout demo
└── style.css       # Flexbox styling
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Flexbox fundamentals
- Flex container setup
- flex: 1 for equal sizing
- Viewport height usage
- flex-direction
- justify-content and align-items
- Gap property
- Responsive layouts

## How to View

1. Open `index.html` in browser
2. See two-column layout
3. Resize window - layout adapts
4. Full height (100vh)
5. Equal width columns
6. Inspect with F12

## Practice Exercises

### Easy Modifications

1. **Change gap**
   ```css
   gap: 10px;    /* Add spacing */
   ```

2. **Add 3 columns**
   ```html
   <div class="item">C</div>
   ```
   ```css
   .item {
       flex: 1;
   }
   ```

3. **Change colors**
   ```css
   .left {
       background: red;
   }
   ```

### Medium Challenges

4. **Unequal widths**
   ```css
   .left {
       flex: 2;  /* 66% width */
   }
   .right {
       flex: 1;  /* 33% width */
   }
   ```

5. **Column layout**
   ```css
   .container {
       flex-direction: column;
   }
   ```

6. **Add content**
   ```html
   <h1>Main Content</h1>
   <p>Lorem ipsum</p>
   ```

### Hard Challenges

7. **Responsive layout**
   ```css
   @media (max-width: 768px) {
       .container {
           flex-direction: column;
       }
   }
   ```

8. **Complex flex layout**
   ```css
   .container {
       display: flex;
       flex-wrap: wrap;
   }
   .item {
       flex: 1 1 200px;
   }
   ```

## Common Questions

**Q: What's the difference between `flex: 1` and `flex: auto`?**
A: `flex: 1` gives equal distribution. `flex: auto` considers content size.

**Q: How do I make columns different widths?**
A: Use different flex values: `flex: 2` and `flex: 1` for 2:1 ratio.

**Q: Can I use Flexbox for multi-row layouts?**
A: Use `flex-wrap: wrap` to wrap items to new rows.

**Q: Is Flexbox responsive by default?**
A: Yes, items shrink/grow with container. For better control, use media queries.

## Sizing in Flexbox

```css
/* Method 1: flex shorthand */
flex: 1;       /* Grow, all equal */

/* Method 2: flex-grow */
flex-grow: 1;  /* Growth proportion */

/* Method 3: fixed width */
flex: 0 0 300px;  /* Don't grow/shrink, 300px */

/* Method 4: percentage */
width: 50%;
```

## Alignment Examples

### Center Everything
```css
display: flex;
justify-content: center;  /* Horizontal */
align-items: center;      /* Vertical */
height: 100vh;
```

### Space Between
```css
display: flex;
justify-content: space-between;
align-items: center;
```

### Wrap and Center
```css
display: flex;
flex-wrap: wrap;
justify-content: center;
gap: 20px;
```

## Browser Support

All modern browsers support Flexbox:
- Chrome 26+
- Firefox 20+
- Safari 6.1+
- Edge 12+
- IE 11 (partial)

## Debugging

### Using DevTools
1. Inspect flex container
2. Look for "flex" badge
3. View flex item dimensions
4. Check flex properties

### Common Issues
- Items not shrinking - Set flex-wrap: wrap
- Unequal widths - Check flex values
- Overflow - Set overflow: hidden or flex-shrink
- Unwanted gaps - Check gap or margin

## Next Steps

1. **Combine with Grid** - Use Flexbox inside Grid
2. **Add Media Queries** - Mobile responsive
3. **Complex Layouts** - Nested flex containers
4. **Animation** - Animate flex changes
5. **Real Content** - Use with actual data

## References

- [CSS-Tricks Flexbox Guide](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)
- [MDN Flexbox](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Flexible_Box_Layout)
- [Can I Use Flexbox](https://caniuse.com/flexbox)

## Key Takeaways

✓ Flexbox is perfect for 1D layouts
✓ flex: 1 creates equal-width items
✓ justify-content aligns on main axis
✓ align-items aligns on cross axis
✓ gap creates spacing
✓ Responsive by default with shrinking/growing

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App7](../app7/README.md)** | **[Next: App9 →](../app9/README.md)**
