# App7: CSS Grid Layout

## Overview
Demonstrates CSS Grid for creating responsive multi-column layouts. Shows how to divide a page into equal-width columns using modern CSS Grid.

## Purpose
Learn and practice:
- CSS Grid fundamentals
- Column creation and sizing
- Responsive layouts without media queries
- Grid gap management
- Viewport height usage
- Flexible layouts

## Key Concepts

### CSS Grid Basics

```css
.container {
    display: grid;
    grid-template-rows: 100vh;
    grid-template-columns: repeat(3, 1fr);
    gap: 5px;
}
```

### What This Does
- **display: grid** - Enable CSS Grid
- **grid-template-rows: 100vh** - Full viewport height
- **grid-template-columns: repeat(3, 1fr)** - 3 equal columns
- **gap: 5px** - 5px spacing between cells

## The Layout

```
┌───────────┬───────────┬───────────┐
│           │           │           │
│    A      │     B     │     C     │
│           │           │           │
│ (33.33%)  │ (33.33%)  │ (33.33%)  │
│           │           │           │
├───────────┼───────────┼───────────┤
│  5px gap  │  5px gap  │  5px gap  │
└───────────┴───────────┴───────────┘

Height: 100vh (Full viewport height)
```

## Code Structure

### HTML
```html
<div style="display: grid; 
            grid-template-rows: 100vh; 
            grid-template-columns: repeat(3,1fr);
            gap: 5px;">
    <div style="background-color: blue;">A</div>
    <div style="background-color: blueviolet;">B</div>
    <div style="background-color: brown;">C</div>
</div>
```

### CSS
```css
.grid-container {
    display: grid;
    grid-template-rows: 100vh;          /* Full height */
    grid-template-columns: repeat(3, 1fr); /* 3 equal columns */
    gap: 5px;                           /* Spacing */
}

.grid-item {
    /* Items fill automatically */
}
```

## Grid Properties Explained

### display: grid
Enables CSS Grid on container:
```css
display: grid;
```

### grid-template-columns: repeat(3, 1fr)
Creates 3 equal-width columns:
```css
/* Method 1: repeat() function */
grid-template-columns: repeat(3, 1fr);

/* Method 2: explicit */
grid-template-columns: 1fr 1fr 1fr;

/* Method 3: fixed widths */
grid-template-columns: 300px 300px 300px;

/* Method 4: mixed */
grid-template-columns: 1fr 200px 1fr;
```

### 1fr (Fractional Unit)
- Represents one fraction of available space
- `repeat(3, 1fr)` divides space equally
- Similar to flex: 1

### grid-template-rows: 100vh
Sets row height to viewport height:
```css
grid-template-rows: 100vh;        /* Full viewport */
grid-template-rows: 500px;        /* Fixed height */
grid-template-rows: auto;         /* Content height */
grid-template-rows: 100vh auto;   /* Mixed */
```

### gap
Spacing between grid items:
```css
gap: 5px;                    /* All sides */
gap: 10px 20px;             /* Vertical Horizontal */
column-gap: 5px;            /* Column spacing */
row-gap: 10px;              /* Row spacing */
```

## Colors in Example

```
A: blue
B: blueviolet  
C: brown
```

## Responsive Grid

Without media queries:
```css
/* Automatically responsive */
grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
```

This creates columns that:
- Fit multiple columns if space available
- Each minimum 250px wide
- Grow to fill space (1fr)

## Common Grid Patterns

### 2 Column Layout
```css
grid-template-columns: repeat(2, 1fr);
```

### 4 Column Layout
```css
grid-template-columns: repeat(4, 1fr);
```

### Auto-Fit Columns
```css
grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
```

### Header-Content-Footer
```css
grid-template-rows: 100px 1fr 100px;
grid-template-columns: 1fr;
```

### Sidebar Layout
```css
grid-template-columns: 250px 1fr;
/* Left sidebar (250px), Main content (flexible) */
```

## Comparison: Grid vs Flexbox vs Float

| Feature | Grid | Flexbox | Float |
|---------|------|---------|-------|
| 2D Layout | ✓ | ✗ | ✗ |
| 1D Layout | ✓ | ✓ | ✗ |
| Alignment | ✓ | ✓ | Limited |
| Responsive | ✓ | ✓ | Limited |
| Browser Support | Modern | Modern | All |

## Grid vs Flexbox

### Use Grid For:
- Multi-row, multi-column layouts
- 2D page layouts
- Complex components
- Card grids

### Use Flexbox For:
- Navigation bars
- Single-row/column layouts
- Item distribution
- Simple alignments

## Practice Code

### 12 Column Grid
```css
.grid {
    display: grid;
    grid-template-columns: repeat(12, 1fr);
    gap: 10px;
}

.item {
    grid-column: span 6;  /* 6 of 12 columns */
}
```

### Responsive Grid
```css
.grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
    gap: 20px;
}
```

## File Structure
```
app7/
├── index.html      # Grid layout demo
└── style.css       # Grid styling
```

## Learning Outcomes

After reviewing this app, you'll understand:
- CSS Grid fundamentals
- grid-template-columns property
- repeat() function
- 1fr (fractional units)
- Gap property
- Viewport height (100vh)
- Basic responsive layout
- Grid vs Flexbox differences

## How to View

1. Open `index.html` in browser
2. See 3-column layout
3. Full viewport height
4. Resize window (grid is fixed, not responsive)
5. Inspect with F12 → Inspector
6. View computed grid properties

## Practice Exercises

### Easy Modifications

1. **Change number of columns**
   ```css
   grid-template-columns: repeat(4, 1fr);  /* 4 columns */
   grid-template-columns: repeat(2, 1fr);  /* 2 columns */
   ```

2. **Adjust gap**
   ```css
   gap: 10px;   /* Larger gap */
   gap: 0;      /* No gap */
   gap: 20px;   /* Medium gap */
   ```

3. **Change colors**
   ```html
   <div style="background-color: red;">A</div>
   ```

### Medium Challenges

4. **Add different heights**
   ```css
   grid-template-rows: auto auto 100vh;
   ```

5. **Create unequal columns**
   ```css
   grid-template-columns: 1fr 2fr 1fr;
   /* First: 25%, Second: 50%, Third: 25% */
   ```

6. **Add text content**
   ```html
   <div style="...;">Column A</div>
   ```

### Hard Challenges

7. **Make responsive**
   ```css
   @media (max-width: 768px) {
       grid-template-columns: repeat(2, 1fr);
   }
   @media (max-width: 480px) {
       grid-template-columns: 1fr;
   }
   ```

8. **Create complex grid**
   ```css
   grid-template-columns: repeat(12, 1fr);
   grid-template-rows: 100px 1fr 100px;
   ```

## Common Questions

**Q: What's the difference between `1fr` and `auto`?**
A: `1fr` divides available space equally. `auto` uses content size.

**Q: Can I mix `fr` and `px`?**
A: Yes! `1fr 200px 1fr` creates columns where middle is 200px, others split remaining space.

**Q: How do I center grid items?**
A: Use `place-items: center;` on grid container.

**Q: Is Grid responsive automatically?**
A: Not by default, but use `auto-fit` or media queries.

## Sizing Units

| Unit | Meaning | Example |
|------|---------|---------|
| px | Pixels | 300px |
| % | Percentage | 50% |
| fr | Fractions | 1fr, 2fr |
| auto | Content size | auto |
| vw | Viewport width | 100vw |
| vh | Viewport height | 100vh |

## Browser Support

All modern browsers support CSS Grid:
- Chrome 57+
- Firefox 52+
- Safari 10.1+
- Edge 16+

## Debugging Grid

### In DevTools
1. F12 → Inspector
2. Inspect grid container
3. Check "Grid" badge
4. View grid overlay
5. See column/row numbers

### Common Issues
- Items not appearing - Check grid area
- Wrong sizing - Verify template units
- Gap not showing - Check gap syntax
- Overflow - Set overflow: hidden

## Next Steps

1. **Make it responsive** - Add media queries
2. **Add content** - Put real content in cells
3. **Combinations** - Use Grid + Flexbox
4. **Complex layouts** - Multi-row grids
5. **Auto-fit/auto-fill** - Responsive without media queries

## References

- [CSS-Tricks Grid Guide](https://css-tricks.com/snippets/css/complete-guide-grid/)
- [MDN: CSS Grid](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Grid_Layout)
- [Can I Use: Grid](https://caniuse.com/css-grid)

## Key Takeaways

✓ Grid is perfect for 2D layouts
✓ 1fr divides space equally
✓ repeat() creates multiple columns
✓ gap creates spacing
✓ No media queries needed for basic responsive
✓ Combine with other layouts

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App6](../app6/README.md)** | **[Next: App8 →](../app8/README.md)**
