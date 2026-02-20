# App4: Static File Server

## Overview
An Express.js server that serves static assets from a public directory and provides endpoints for downloading files. This project demonstrates static file serving, file downloads, and path resolution in Express.js.

## Purpose
Learn and practice:
- Serving static assets with Express.js
- File downloads
- Path resolution and security
- Express.static middleware
- Routing for file operations

## Features
✓ Serve static HTML, CSS, and media files
✓ Resume PDF download endpoint
✓ Static asset organization
✓ Response headers for file downloads
✓ Cross-platform path handling

## Technology Stack
| Component | Technology |
|-----------|-----------|
| **Framework** | Express.js v5.2.1 |
| **Runtime** | Node.js |
| **Module System** | CommonJS |
| **Server Port** | 3000 |
| **Assets** | HTML, CSS, images, fonts, PDFs |

## Installation

```bash
cd app4
npm install
```

This will install Express.js and dependencies.

## Usage

### Starting the Server
```bash
node app.js
# or
npm start
```

### Expected Output
```
Listening on 3000....
```

### Accessing the Server

**Root Endpoint:**
```bash
curl http://localhost:3000/
# Response: "Hello, World Express"
```

**Access Static Files:**
```bash
# Main page
curl http://localhost:3000/static/index.html

# Stylesheet
curl http://localhost:3000/static/resume-css-stylesheet.css

# Resume page
curl http://localhost:3000/static/resume.html

# Skills page
curl http://localhost:3000/static/wallofskills.html
```

**Download Resume:**
```bash
curl -O http://localhost:3000/download/resume
# Downloads resume_vks.pdf to current directory
```

**In Browser:**
```
http://localhost:3000/
http://localhost:3000/static/index.html
http://localhost:3000/static/resume.html
http://localhost:3000/download/resume
```

### Stopping the Server
Press `Ctrl + C` in the terminal

## Code Explanation

### Imports
```javascript
const express = require('express');
const app = express();
const path = require('path');
const PORT = 3000;
```
- Express framework for server
- Path module for cross-platform path handling

### Static File Middleware
```javascript
app.use('/static', express.static(path.join(__dirname, 'public')));
```
- Mounts `/static` route at the `public` directory
- `express.static()` serves files without additional processing
- All files in `public/` are accessible via `/static/*`

### Download Route
```javascript
app.get('/download/resume', (req, res) => {
    const manualPath = path.join(__dirname, 'public', 'docs', 'resume_vks.pdf');
    res.sendFile(manualPath);
});
```
- Handles GET request to `/download/resume`
- Constructs full path to resume PDF
- `res.sendFile()` sends file with proper headers
- Browser downloads file instead of displaying

### Root Route
```javascript
app.get('/', (req, res) => {
    res.send('Hello, World Express');
});
```
- Simple text response at root

### Start Server
```javascript
app.listen(PORT, () => {
    console.log(`Listening on ${PORT}....`);
});
```
- Starts server on port 3000

## API Endpoints

| Method | Endpoint | Description | Returns |
|--------|----------|-------------|---------|
| GET | `/` | Root endpoint | Text: "Hello, World Express" |
| GET | `/static/*` | Static assets | Files from `/public` directory |
| GET | `/static/index.html` | Main HTML page | index.html |
| GET | `/static/resume.html` | Resume page | resume.html |
| GET | `/static/wallofskills.html` | Skills showcase | wallofskills.html |
| GET | `/static/resume-css-stylesheet.css` | Stylesheet | CSS file |
| GET | `/download/resume` | Download resume | resume_vks.pdf (file download) |

## Directory Structure

```
app4/
├── app.js                                   # Express server
├── package.json                             # Dependencies
├── README.md                                # Documentation
└── public/                                  # Static assets root
    ├── index.html                           # Main page
    ├── resume.html                          # Resume page
    ├── wallofskills.html                    # Skills page
    ├── resume-css-stylesheet.css            # Styling
    ├── docs/                                # Documents folder
    │   └── resume_vks.pdf                   # Resume PDF
    ├── fonts/                               # Font files
    │   └── (various font files)
    └── logos/                               # Logo assets
        └── list.txt                         # Logo inventory
```

## Static File Serving

### How It Works

When a request comes to `/static/file.css`:
```
Request: GET /static/file.css
           ↓
Express routes to express.static()
           ↓
Looks for: ./public/file.css
           ↓
Sends file with correct MIME type
           ↓
Client receives CSS file
```

### MIME Types Automatically Set

Express automatically sets correct content types:
```
.html  → text/html
.css   → text/css
.js    → application/javascript
.json  → application/json
.pdf   → application/pdf
.jpg   → image/jpeg
.png   → image/png
.gif   → image/gif
.svg   → image/svg+xml
.woff  → font/woff
```

## File Download Handling

### Using res.sendFile()
```javascript
res.sendFile(fullPath);
```

**Automatically sets:**
- `Content-Type`: Based on file extension
- `Content-Length`: File size in bytes
- `Content-Disposition`: Triggers download in browsers

### Response Headers Example
```
Content-Type: application/pdf
Content-Length: 245678
Content-Disposition: attachment; filename="resume_vks.pdf"
```

## Package.json Details
```json
{
  "name": "app4",
  "version": "1.0.0",
  "main": "app.js",
  "type": "commonjs",
  "dependencies": {
    "express": "^5.2.1"
  }
}
```

## Practical Examples

### Example 1: Access Home Page
```bash
curl http://localhost:3000/static/index.html
```

**What happens:**
1. Server receives request for `index.html`
2. Express.static finds file in `public/index.html`
3. Returns HTML with `Content-Type: text/html`
4. Browser renders the page

### Example 2: Get Stylesheet
```bash
curl http://localhost:3000/static/resume-css-stylesheet.css
```

**What happens:**
1. Requests CSS file from `/static` mount point
2. Express.static maps to `public/resume-css-stylesheet.css`
3. Returns CSS with `Content-Type: text/css`
4. Browser applies styles

### Example 3: Download PDF
```bash
curl -O http://localhost:3000/download/resume
```

**What happens:**
1. Route handler identified: `/download/resume`
2. Full path constructed: `./public/docs/resume_vks.pdf`
3. `res.sendFile()` sends with download headers
4. Browser saves file locally

## HTML Linking Examples

### Link to Static CSS
```html
<link rel="stylesheet" href="/static/resume-css-stylesheet.css">
```

### Link to Static Images
```html
<img src="/static/logos/company-logo.png" alt="Logo">
```

### Link to Download Resume
```html
<a href="/download/resume" download>Download Resume</a>
```

### Link to Embedded Fonts
```html
<link rel="stylesheet" href="/static/fonts/custom-font.woff">
```

## Security Considerations

### Path Traversal Protection
```javascript
// SECURE: Uses path.join() which prevents ../
const safePath = path.join(__dirname, 'public', userInput);

// NOT SECURE: Concatenation allows ../
const unsafePath = __dirname + '/public/' + userInput;
```

This server is safe because:
- Uses `path.join()` for path construction
- `__dirname` anchors paths to app directory
- `express.static()` restricts to mounted directory

### Best Practices Implemented
✓ Don't serve from root directory
✓ Use path.join() for path construction
✓ Mount static middleware at specific route
✓ Validate paths before serving

## Advanced Features to Add

### Compression
```javascript
const compression = require('compression');
app.use(compression());
```

### Cache Control
```javascript
app.use(express.static('public', {
  maxAge: '1d',
  etag: false
}));
```

### Custom Download Name
```javascript
app.get('/download/resume', (req, res) => {
    res.download(filePath, 'my_resume.pdf');
});
```

### Directory Listing
```javascript
app.use('/static', express.static('public', {
  index: false  // Disable directory listing
}));
```

## Common Issues

| Issue | Cause | Solution |
|-------|-------|----------|
| 404 on `/static/*` | File doesn't exist | Check file path matches exactly |
| MIME type wrong | File extension not recognized | Rename file with correct extension |
| Can't download file | sendFile path incorrect | Verify file exists in docs folder |
| CSS not loading | Wrong path in HTML | Use `/static/` prefix in links |

## Testing

### Verify Files Exist
```bash
ls -la public/
ls -la public/docs/
ls -la public/fonts/
ls -la public/logos/
```

### Test Endpoints
```bash
# Test root
curl http://localhost:3000/

# Test static file
curl http://localhost:3000/static/index.html

# Test download with headers
curl -i http://localhost:3000/download/resume

# Test 404
curl http://localhost:3000/static/nonexistent.html
```

### Browser Testing
1. Open `http://localhost:3000/static/index.html`
2. Check CSS loads correctly
3. Verify styles apply
4. Click download link if available

## Performance Optimization

### Enable Compression
Files served are smaller with compression:
- Before: 245,678 bytes
- After: ~50,000 bytes (with gzip)

### Caching Headers
Browsers cache static files to reduce requests:
```javascript
app.use(express.static('public', {
  maxAge: 86400000  // 1 day in milliseconds
}));
```

### CDN Integration
For production, serve static files from CDN:
```
Cloud CDN → public/
App Server → API routes
```

## Deployment Considerations

### Environment Variables
```javascript
const PORT = process.env.PORT || 3000;
```

### File Paths
```javascript
const publicPath = process.env.PUBLIC_PATH || 'public';
app.use('/static', express.static(publicPath));
```

### Production Settings
```javascript
app.set('env', 'production');
app.disable('x-powered-by');
```

## Real-World Use Cases

1. **Portfolio Website**: Serve HTML portfolio with CSS and images
2. **Documentation Site**: Host API docs, guides, tutorials
3. **Resume Download**: Let employers download your resume
4. **Asset Delivery**: Serve images, fonts for web app
5. **File Sharing**: Provide download links for users
6. **Blog Platform**: Serve blog posts and multimedia

## Related Concepts

- **express.static()**: Serves files without processing
- **express.json()**: Parses JSON request bodies
- **express.urlencoded()**: Parses form data
- **Middleware**: Functions that process requests
- **MIME Types**: Content type indicators

## Package.json Dependencies

```json
{
  "express": "^5.2.1"
}
```

## Future Enhancements

- [ ] Add multiple download formats (PDF, DOCX, etc.)
- [ ] Implement file upload functionality
- [ ] Add authentication for downloads
- [ ] Track download statistics
- [ ] Add image optimization
- [ ] Implement content negotiation
- [ ] Add data compression

## Author
Vishwas

## License
ISC

## References
- [Express.js Static Files](https://expressjs.com/en/starter/static-files.html)
- [res.sendFile() Documentation](https://expressjs.com/en/api/response.html#res.sendfile)
- [res.download() Documentation](https://expressjs.com/en/api/response.html#res.download)
- [Node.js path Module](https://nodejs.org/api/path.html)
- [MIME Types Reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)
