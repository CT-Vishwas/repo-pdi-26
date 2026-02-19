# App3: Resume/Portfolio

## Overview
A professional resume webpage showcasing contact information, work experience, education, and social media links. Demonstrates advanced HTML features including tables, various link types, and multi-section organization.

## Purpose
Learn and practice:
- Image insertion and sizing
- Creating hyperlinks (regular, email, phone)
- Building HTML tables
- Professional resume structure
- Contact information formatting
- Social media integration

## Key Features

### Profile Image
```html
<img src="profile.jpg" 
     alt="Profile Image of Vishwas K Singh" 
     width="200" 
     height="200">
```

### Contact Links
```html
<!-- Email link -->
<a href="mailto:vishwas@cloudthat.com">Email</a>

<!-- Phone link -->
<a href="tel:+911234567890">Phone</a>

<!-- External links -->
<a href="https://www.linkedin.com/" target="_blank">LinkedIn</a>
```

### Education Table
```html
<table>
    <thead>
        <tr>
            <th>Degree</th>
            <th>University</th>
            <th>Subject</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>M.Tech</td>
            <td>VTU</td>
            <td>DECS</td>
        </tr>
    </tbody>
</table>
```

## Resume Sections

### Header - Profile Section
- Profile image (200x200px)
- Name: Vishwas K Singh
- Contact information
- Location: Bengaluru, Karnataka

### Contact Information
```html
Email: <a href="mailto:vishwas@cloudthat.com">
Phone: <a href="tel:+911234567890">
Location: Bengaluru, Karnataka
```

### Social Links
- LinkedIn profile
- GitHub profile
- Additional LinkedIn link with `rel="noopener noreferrer"`

### Professional Experience
- **Position**: Subject Matter Expert
- **Company**: CloudThat, Bengaluru
- **Duration**: 2023 - Present
- **Responsibilities**:
  - Consulting for client projects
  - Upskilling for Corporates

### Education
Structured table showing:
- Degree (M.Tech, BE)
- University (VTU)
- Subject (DECS, ECE)

## HTML Elements Used

| Element | Purpose |
|---------|---------|
| `<header>` | Profile header section |
| `<section>` | Content sections |
| `<img>` | Profile picture |
| `<a>` | Links |
| `<href>` | Link attributes |
| `<article>` | Contact details |
| `<nav>` | Social links |
| `<table>` | Education data |
| `<thead>` | Table header |
| `<tbody>` | Table body |
| `<hr>` | Section divider |
| `<h1>`, `<h2>` | Headings |
| `<ul>`, `<li>` | Lists |

## Advanced Link Types

### Email Links
```html
<a href="mailto:email@example.com">Send Email</a>
```
- Opens user's default email client
- Subject line can be included: `?subject=Resume`
- Body can be included: `?body=message`

### Phone Links
```html
<a href="tel:+911234567890">Call Me</a>
```
- On mobile devices, opens phone dialer
- International format: `+countrycode`
- Format: `+91-1234567890`

### External Links
```html
<!-- Basic external link -->
<a href="https://www.linkedin.com">LinkedIn</a>

<!-- Secure external link -->
<a href="https://www.linkedin.com" 
   target="_blank" 
   rel="noopener noreferrer">
   LinkedIn
</a>
```

## Table Structure

### Basic Table
```html
<table>
    <thead>          <!-- Header row -->
        <tr>
            <th>Header 1</th>
            <th>Header 2</th>
        </tr>
    </thead>
    <tbody>          <!-- Data rows -->
        <tr>
            <td>Data 1</td>
            <td>Data 2</td>
        </tr>
    </tbody>
</table>
```

### Education Table
```
┌────────┬──────────┬────────┐
│ Degree │ University│ Subject│
├────────┼──────────┼────────┤
│ M.Tech │ VTU      │ DECS   │
├────────┼──────────┼────────┤
│ BE     │ VTU      │ ECE    │
└────────┴──────────┴────────┘
```

## Image Best Practices

### Sizing
```html
<!-- Fixed dimensions -->
<img src="image.jpg" width="200" height="200">

<!-- Responsive sizing -->
<img src="image.jpg" style="max-width: 100%;">
```

### Alt Text
```html
<img src="profile.jpg" 
     alt="Profile Image of Vishwas K Singh">
```
- Always include descriptive alt text
- Screen readers use alt text
- Shown if image fails to load

### Image Formats
- **JPEG** - Photographs (good compression)
- **PNG** - Images with transparency
- **WebP** - Modern format (better compression)
- **SVG** - Vector graphics (scalable)

## Resume Structure

```
┌─────────────────────────┐
│    PROFILE HEADER       │
│  - Image                │
│  - Name & Contact       │
└─────────────────────────┘

┌─────────────────────────┐
│  SOCIAL LINKS           │
│  LinkedIn, GitHub, etc. │
└─────────────────────────┘

┌─────────────────────────┐
│  EXPERIENCE             │
│  - Position             │
│  - Company              │
│  - Duration             │
│  - Responsibilities     │
└─────────────────────────┘

┌─────────────────────────┐
│  EDUCATION              │
│  [Table format]         │
└─────────────────────────┘
```

## Link Attributes

### href
- **Value**: URL, email, phone, or internal link
- **Example**: `href="mailto:email@example.com"`

### target
- **`_blank`**: Opens in new tab
- **`_self`**: Opens in same tab (default)
- **`_parent`**: Opens in parent frame
- **`_top`**: Opens in full window

### rel
- **`noopener`**: Prevents security vulnerability
- **`noreferrer`**: Doesn't send referrer info
- **`external`**: Indicates external link
- **`nofollow`**: Don't follow link (SEO)

## Accessibility Features

✓ Descriptive alt text for images
✓ Semantic table structure (thead, tbody)
✓ Meaningful link text
✓ Proper heading hierarchy
✓ Contact links with correct formats
✓ Language attribute

## Best Practices Applied

1. **Semantic HTML** - Proper element usage
2. **Table Structure** - thead/tbody organization
3. **Link Security** - target="_blank" with rel
4. **Image Optimization** - Appropriate sizing
5. **Contact Methods** - Email and phone links
6. **Content Organization** - Clear sections
7. **Alternative Text** - For accessibility

## Learning Outcomes

After reviewing this app, you'll understand:
- Image insertion and sizing
- Email and phone links
- External link attributes
- Table structure and elements
- Resume organization
- Professional page layout
- Contact information formatting
- Social media integration

## How to View

1. Open `index.html` in browser
2. View resume layout
3. Click links to test functionality
4. Inspect table structure (F12)
5. Check image display properties

## Practice Exercises

### Easy Modifications

1. **Update Information**
   - Change name and details
   - Update contact information
   - Modify email address

2. **Add More Experience**
   ```html
   <h3>Previous Title</h3>
   <strong>Company, Location - Year - Year</strong>
   <ul>
       <li>Responsibility 1</li>
       <li>Responsibility 2</li>
   </ul>
   ```

3. **Expand Education**
   - Add more degrees
   - Add certifications
   - Include GPA or honors

### Medium Challenges

4. **Add Sections**
   - Skills section
   - Certifications
   - Languages
   - Publications

5. **Create Lists**
   - Technical skills
   - Professional skills
   - Languages spoken

6. **Add Styling**
   - CSS styling
   - Professional colors
   - Print-friendly layout

### Hard Challenges

7. **Make It Responsive**
   - Mobile-friendly layout
   - Responsive tables
   - Flexible images

8. **Add Features**
   - Download PDF button
   - Print functionality
   - Dark mode toggle

## File Structure
```
app3/
├── index.html              # Resume page
├── profile.jpg             # Profile image (if exists)
└── .vscode/settings.json
```

## Technologies Used

- **HTML5**: Semantic elements
- **Tables**: Data organization
- **Links**: Navigation and contact
- **Images**: Visual content

## Browser Support

All modern browsers fully support:
- Images and sizing
- Links (email, phone, external)
- HTML5 tables
- Semantic elements

## Table Features

### Styling Tables
```css
table {
    border-collapse: collapse;
    width: 100%;
}
th, td {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: left;
}
th {
    background-color: #f2f2f2;
}
```

## Next Steps

1. **Add Styling** - Use CSS to beautify the resume
2. **Make Responsive** - Add media queries
3. **Add More Content** - Skills, projects, etc.
4. **Create PDF Export** - Save as PDF
5. **Host Online** - Deploy to web server

## Common Questions

**Q: Why use `<table>` instead of divs?**
A: Tables are semantically correct for tabular data and more accessible.

**Q: Should I include email on public resume?**
A: Yes, but consider using a contact form instead.

**Q: How do I make images responsive?**
A: Use CSS: `img { max-width: 100%; height: auto; }`

**Q: What's the best image format for profile pics?**
A: JPEG for photos, PNG for graphics with transparency.

## Troubleshooting

| Issue | Solution |
|-------|----------|
| Image not showing | Check file path and filename |
| Table not aligned | Add CSS styling and borders |
| Email link not working | Use `mailto:email@domain.com` |
| Phone link on desktop | Works on mobile, needs tel: protocol |

## SEO Considerations

- Use semantic HTML
- Include relevant keywords
- Add descriptive alt text
- Create meaningful link text
- Structure content properly

## Key Takeaways

✓ Images enhance visual appeal
✓ Proper link types improve UX
✓ Tables organize data semantically
✓ Resume structure matters for readability
✓ Contact methods should be prominent
✓ Accessibility improves for all users

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App2](../app2/README.md)** | **[Next: App4 →](../app4/README.md)**
