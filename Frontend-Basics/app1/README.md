# App1: Web Page Structure

## Overview
A foundational HTML document demonstrating proper web page structure and semantic HTML elements. Perfect for beginners learning HTML basics.

## Purpose
Learn and understand:
- HTML5 document structure
- Proper use of semantic HTML tags
- Heading hierarchy
- Text formatting elements
- List creation and organization

## Key Concepts

### Document Structure
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Content here -->
</body>
</html>
```

### HTML Elements Used

| Element | Purpose | Example |
|---------|---------|---------|
| `<h1>` | Main page heading | Only one per page |
| `<h2>` | Section heading | Multiple allowed |
| `<h3>` | Subsection heading | For sub-items |
| `<p>` | Paragraph text | Block of text |
| `<ul>` | Unordered list | Bullet points |
| `<li>` | List item | Individual item |
| `<strong>` | Bold text | Important text |
| `<em>` | Italic text | Emphasized text |
| `<mark>` | Highlighted text | Yellow background |
| `<del>` | Strikethrough text | Deleted content |

## Page Structure

```
Heading: "Developing a Web Page"
├── Description paragraph
├── Objectives section
│   └── List of learning outcomes
├── Tasks section
│   ├── Task 1
│   ├── Task 2
│   └── ... (more tasks)
├── Useful Resources section
└── About the author
```

## Text Formatting Examples

### Emphasis
```html
<strong>HTML Pages</strong>    <!-- Bold -->
<em>confidently</em>          <!-- Italic -->
```

### Highlighting
```html
<mark>HTML elements</mark>    <!-- Yellow background -->
<del>usage</del>              <!-- Strikethrough -->
```

## Lists

### Unordered List (Bullet Points)
```html
<ul>
    <li>Build Frontend HTML Pages confidently</li>
    <li>Understand the usage of HTML elements</li>
    <li>Understand various Tags and their usage</li>
</ul>
```

## Content Sections

### Objectives
Lists learning outcomes with text formatting:
- Main heading: HTML Pages (bold)
- Modifier: confidently (italic)
- Topic: HTML elements (marked/highlighted)
- Strikethrough: usage (deleted/old approach)

### Tasks
Five task items organized with consistent heading structure

### About the Author
Simple text introduction: "I am Vishwas K Singh, I am learning HTML"

## Accessibility Features

✓ Proper heading hierarchy (h1 → h2 → h3)
✓ Semantic HTML structure
✓ Meaningful text content
✓ Language attribute (lang="en")
✓ Character encoding specified
✓ Viewport meta tag

## Best Practices Demonstrated

1. **Proper DOCTYPE** - HTML5 declaration
2. **Semantic Structure** - Meaningful tags
3. **Heading Hierarchy** - h1 at top, h2 for sections
4. **Language Attribute** - Accessibility feature
5. **Meta Tags** - Character set and viewport
6. **Clean Code** - Readable and organized
7. **Descriptive Content** - Clear purpose

## Common Mistakes to Avoid

❌ Multiple `<h1>` tags
❌ Skipping heading levels (h1 → h3)
❌ Using `<strong>` only for styling
❌ Improper nesting of elements
❌ Missing title tag
❌ No viewport meta tag

## Learning Outcomes

After reviewing this app, you'll understand:
- Document structure requirements
- Semantic HTML importance
- Heading hierarchy rules
- Text emphasis options
- List creation
- Meta tag usage
- Page organization
- Document readability

## How to View

1. Open `index.html` in a web browser
2. View page structure and styling
3. Inspect elements (F12 → Inspector tab)
4. Check console for any errors
5. View source code (Ctrl+U) to see HTML

## Inspecting Elements

Using Browser DevTools:
1. Right-click → Inspect (or F12)
2. Navigate the HTML tree
3. See element properties
4. Verify semantic structure
5. Check applied styles

## Practice Exercises

### Difficulty: Easy

1. **Add more sections**
   - Add objectives section with list
   - Add resources section

2. **Format text**
   - Make key terms bold
   - Emphasize important phrases
   - Highlight definitions

3. **Expand content**
   - Add more detailed descriptions
   - Create nested lists
   - Add subsections with h3 tags

### Difficulty: Medium

4. **Semantic improvement**
   - Replace generic divs with semantic tags
   - Add proper heading structure
   - Improve document outline

5. **Content organization**
   - Group related content
   - Create better section organization
   - Add navigation structure

## File Structure
```
app1/
├── index.html                # Main HTML document
└── .vscode/settings.json    # VS Code settings
```

## Technologies Used

- **HTML5**: Latest HTML standard
- **Semantic Elements**: Proper structure
- **Meta Tags**: Viewport and charset

## Browser Support

All modern browsers support:
- Complete HTML5 compatibility
- Viewport meta tag
- Character encoding
- Semantic elements

## Next Steps

After mastering this app:
1. Move to [app2](../app2/README.md) - Learn more semantic structure
2. Try [app3](../app3/README.md) - Build complex pages with tables
3. Explore [app4](../app4/README.md) - Add media elements

## Reference

### Semantic HTML Elements
- `<header>` - Page header
- `<nav>` - Navigation
- `<main>` - Main content
- `<article>` - Self-contained article
- `<section>` - Thematic grouping
- `<aside>` - Sidebar content
- `<footer>` - Page footer

### Text-Level Semantics
- `<strong>` - Strong importance
- `<em>` - Emphasis
- `<mark>` - Highlight
- `<code>` - Code snippet
- `<pre>` - Preformatted text
- `<blockquote>` - Long quotation

## Frequently Asked Questions

**Q: Can I have multiple `<h1>` tags?**
A: Semantically, one `<h1>` per page is best practice, but HTML5 allows multiple.

**Q: Should I use `<strong>` or `<b>`?**
A: Use `<strong>` for semantic importance, `<b>` only for styling.

**Q: What's the difference between `<em>` and `<i>`?**
A: `<em>` is semantic (emphasis), `<i>` is visual (italic text).

**Q: Why is heading hierarchy important?**
A: Screen readers use headings for navigation. Proper hierarchy helps accessibility.

## Troubleshooting

| Issue | Cause | Solution |
|-------|-------|----------|
| Page doesn't load | File not found | Check file path |
| Text appears unstyled | Missing styles | Add CSS or use defaults |
| Elements misaligned | Nesting error | Check closing tags |

## Key Takeaways

✓ HTML provides document structure
✓ Semantic elements improve accessibility
✓ Proper heading hierarchy is important
✓ Text formatting options communicate meaning
✓ Lists organize related information
✓ Meta tags enhance functionality

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Next: App2 →](../app2/README.md)**
