# App2: Tourist Attractions

## Overview
An informational website about tourist attractions in Mysuru, India. Demonstrates semantic HTML structure with proper use of headers, sections, main content, and footers.

## Purpose
Learn and practice:
- Semantic HTML structure using `<header>`, `<section>`, `<main>`, `<footer>`
- Content organization and hierarchy
- List creation and formatting
- Text emphasis (strong, em)
- Professional page layout

## Key Concepts

### Semantic HTML Structure

Proper page structure using semantic elements:

```html
<header>       <!-- Page header/introduction -->
    <h1>Page Title</h1>
</header>

<section>      <!-- Thematic grouping -->
    <h2>Section Title</h2>
    <main>     <!-- Main content -->
        <p>Content</p>
    </main>
</section>

<footer>       <!-- Page footer -->
    Copyright information
</footer>
```

## Page Content

### Title
```
Tourist Attractions
```

### Main Section
**Location**: Mysuru (also called Heritage City) in Karnataka

### Featured Attractions

1. **Chamundi Hill** - Historic hilltop location
2. **Mysuru Palace** - Famous royal palace
3. **Rangantittu Bird Sanctuary** - Wildlife and birds
4. **Jagan Mohan Palace** - Architectural landmark

## HTML Elements Used

| Element | Purpose | Usage |
|---------|---------|-------|
| `<header>` | Page header | Contains main title |
| `<section>` | Content section | Groups related content |
| `<main>` | Main content | Primary page content |
| `<h1>`, `<h2>` | Headings | Page and section titles |
| `<p>` | Paragraph | Text content |
| `<ul>`, `<li>` | List | Attraction list |
| `<strong>` | Bold text | "Heritage city" |
| `<em>` | Italic text | "Karnataka" |
| `<br>` | Line break | Text formatting |
| `<footer>` | Page footer | Copyright info |

## Information Hierarchy

```
Header
├── Page Title: "Tourist Attractions"
│
Main Section
├── Section Title: "Tourist Attractions of Mysuru"
├── Description
│   ├── Location info (strong: Heritage city)
│   ├── State (em: Karnataka)
│   └── Introduction
│
└── Attractions List
    ├── Chamundi Hill
    ├── Mysuru Palace
    ├── Rangantittu Bird Sanctuary
    └── Jagan Mohan Palace

Footer
└── Copyright Vishwas
```

## Content Elements

### Header
```html
<header>
    <h1>Tourist Attractions</h1>
</header>
```
- Simple, clear page title
- Enclosed in header tag
- h1 for main heading

### Section
```html
<section>
    <h2>Tourist Attractions of Mysuru</h2>
    <main>
        <p>Description text</p>
    </main>
</section>
```
- Thematic grouping of content
- h2 for section title
- Main element for primary content

### Text Formatting
```html
<!-- Strong emphasis -->
<strong>Heritage city</strong>

<!-- Italic emphasis -->
<em>Karnataka</em>

<!-- Line break -->
<br>
```

### Attractions List
```html
<ul>
    <li>Chamundi Hill</li>
    <li>Mysuru Palace</li>
    <li>Rangantittu Bird Sanctuary</li>
    <li>Jagan Mohan palace</li>
</ul>
```

### Footer
```html
<footer>
    Copyright Vishwas
</footer>
```

## Semantic Elements Explained

### `<header>`
- Introductory content
- Contains page title
- Navigation (if needed)
- Author/date information

### `<section>`
- Thematic grouping of content
- Can contain multiple subsections
- Each section has a heading
- Improves document outline

### `<main>`
- Contains primary content
- Only one per page
- Unique content
- Excludes headers, footers, sidebars

### `<footer>`
- End of page/section
- Contact information
- Copyright notice
- Links to policies

## Accessibility Features

✓ Proper heading hierarchy
✓ Semantic HTML structure
✓ Clear content organization
✓ Descriptive link text (if added)
✓ Meaningful element usage
✓ Language attribute
✓ Character encoding

## Best Practices Applied

1. **Semantic Structure** - Meaningful HTML tags
2. **Heading Hierarchy** - h1 → h2 progression
3. **Logical Organization** - Content flows naturally
4. **Text Emphasis** - Strong and em for meaning
5. **Lists** - Organized attractions
6. **Footer Information** - Copyright notice
7. **Header/Footer** - Clear page boundaries

## Page Outline

```
H1: Tourist Attractions
    H2: Tourist Attractions of Mysuru
        - Location and description
        - Attractions list
        - Copyright footer
```

## Common Patterns

### Content Section Pattern
```html
<header>
    <h1>Main Title</h1>
</header>

<section>
    <h2>Section Title</h2>
    <main>
        <p>Content</p>
        <ul>
            <li>Item</li>
        </ul>
    </main>
</section>

<footer>
    Footer content
</footer>
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Semantic HTML structure importance
- Uses of header, section, main, footer
- Proper heading hierarchy
- Content organization
- Text emphasis options
- List formatting
- Page layout principles

## How to View

1. Open `index.html` in browser
2. View the page structure
3. Inspect elements (F12)
4. Check semantic elements in Inspector
5. View page outline (Accessibility tree)

## Practice Exercises

### Add Features

1. **Add Navigation**
   ```html
   <nav>
       <a href="#">Home</a>
       <a href="#">About</a>
   </nav>
   ```

2. **Add Article Details**
   ```html
   <article>
       <h3>Chamundi Hill</h3>
       <p>Description</p>
   </article>
   ```

3. **Add More Content**
   - Add "When to Visit" section
   - Add "Getting There" section
   - Add "Contact Information"

4. **Enhance with Links**
   ```html
   <a href="https://mysuru.com">Visit Mysuru</a>
   ```

### Difficulty Levels

**Easy**: Add more attractions to the list

**Medium**: Create multiple article sections for each location

**Hard**: Add nested navigation and structured data

## File Structure
```
app2/
├── index.html           # Tourist attractions page
└── .vscode/settings.json
```

## Technologies Used

- **HTML5**: Semantic structure
- **Semantic Elements**: For meaning
- **Lists**: Content organization

## Browser Support

All modern browsers fully support:
- Semantic elements
- HTML5 structure
- Text formatting elements

## Document Outline

The page outline (using semantic elements):
```
1. Tourist Attractions
   1.1 Tourist Attractions of Mysuru
       - Chamundi Hill
       - Mysuru Palace
       - Rangantittu Bird Sanctuary
       - Jagan Mohan palace
```

## Next Steps

1. **Style this page**: Add CSS styling (see app5/6)
2. **Make it responsive**: Add media queries
3. **Add images**: Include photos of attractions
4. **Create links**: Link to detailed pages
5. **Add more locations**: Expand to other cities

## Reference Guide

### Semantic Elements

| Element | Purpose |
|---------|---------|
| `<header>` | Page/section header |
| `<nav>` | Navigation links |
| `<main>` | Main content |
| `<article>` | Self-contained article |
| `<section>` | Thematic section |
| `<aside>` | Sidebar/supplementary |
| `<footer>` | Page/section footer |

### Text-Level Elements

| Element | Meaning |
|---------|---------|
| `<strong>` | Strong importance |
| `<em>` | Emphasis |
| `<mark>` | Highlight |
| `<small>` | Small print |
| `<cite>` | Citation |
| `<code>` | Code snippet |

## Common Questions

**Q: When should I use `<section>`?**
A: When you have a thematic grouping of content with its own heading.

**Q: Can `<header>` and `<footer>` be inside `<section>`?**
A: Yes, each section can have its own header/footer.

**Q: Should I use `<article>` for each attraction?**
A: Yes, if each is independently significant content.

**Q: What's the difference between `<section>` and `<article>`?**
A: `<article>` is self-contained, `<section>` is thematic grouping.

## Troubleshooting

| Issue | Solution |
|-------|----------|
| Heading hierarchy warning | Start with h1, use h2, h3 sequentially |
| Semantic element not rendering | All modern browsers support it |
| Footer not at bottom | Add CSS styling with flexbox |

## Key Takeaways

✓ Semantic HTML improves accessibility
✓ Page structure is important for screen readers
✓ Proper heading hierarchy helps navigation
✓ `<section>`, `<article>`, `<main>` organize content
✓ Headers and footers frame content
✓ Clean structure improves maintainability

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App1](../app1/README.md)** | **[Next: App3 →](../app3/README.md)**
