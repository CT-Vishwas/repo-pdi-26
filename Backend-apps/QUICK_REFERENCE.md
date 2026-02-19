# Backend Apps - Quick Reference Guide

## Summary Table

| App | Type | Purpose | Tech | Port | Key File |
|-----|------|---------|------|------|----------|
| **app1** | CLI Utility | Simple Interest Calculator | Node.js (ES6) | N/A | app.js |
| **app2** | CLI Utility | File Organization | Node.js (CommonJS) | N/A | app.js |
| **app3** | Web Server | Basic Express Server | Express 5.2 | 3000 | app.js |
| **app4** | Web Server | Static File Server | Express 5.2 | 3000 | app.js |
| **app5** | REST API | Listings Database API | Express + MongoDB | 3000 | app.js |

## Getting Started Quick Start

### App1: Simple Interest Calculator
```bash
cd app1
node app.js
# Follow prompts to calculate interest
```

### App2: File Organizer
```bash
cd app2
# Edit app.js to set target folder
node app.js
# Files sorted by extension
```

### App3: Basic Express Server
```bash
cd app3
npm install
node app.js
# Visit http://localhost:3000/
```

### App4: Static File Server
```bash
cd app4
npm install
node app.js
# Visit http://localhost:3000/static/index.html
```

### App5: Listings API
```bash
cd app5
npm install
# Create .env with MONGO_URI
node app.js
# GET http://localhost:3000/api/v1/listings
```

## Technology Stack Overview

### Frontend Technologies
- **HTML**: Page structure
- **CSS**: Styling (resume-css-stylesheet.css)
- **JavaScript**: Client-side logic

### Backend Technologies
- **Node.js**: Runtime environment
- **Express.js**: Web framework (v5.2.1)
- **MongoDB**: Database (app5 only)
- **Mongoose**: ODM for MongoDB (app5 only)

### Module Systems
- **ES6 Modules**: app1 (modern syntax)
- **CommonJS**: app2, app3, app4, app5 (traditional)

## Dependencies by App

### App1
- No npm dependencies (uses Node.js built-ins)

### App2
- No npm dependencies (uses Node.js built-ins)

### App3
```json
{
  "express": "^5.2.1"
}
```

### App4
```json
{
  "express": "^5.2.1"
}
```

### App5
```json
{
  "express": "^5.2.1",
  "mongoose": "^9.2.1",
  "dotenv": "^17.3.1"
}
```

## Port Usage
- **App1**: CLI only
- **App2**: CLI only
- **App3**: Port 3000
- **App4**: Port 3000
- **App5**: Port 3000

> Note: Run only one Express server at a time, or change PORT variable

## API Endpoints

### App3: Basic Server
```
GET  /                    → "Hello, World Express"
```

### App4: Static File Server
```
GET  /                              → "Hello, World Express"
GET  /static/*                      → Files from public/
GET  /static/index.html             → HTML page
GET  /static/resume-css-stylesheet.css → Stylesheet
GET  /download/resume               → Download PDF
```

### App5: Listings API
```
GET  /api/v1/listings                           → All listings
GET  /api/v1/listings/search?location=<city>  → Search by location
GET  /api/v1/listings/<id>                      → Single listing
```

## Testing Commands

### Using curl

**App3:**
```bash
curl http://localhost:3000/
```

**App4:**
```bash
curl http://localhost:3000/static/index.html
curl -O http://localhost:3000/download/resume
```

**App5:**
```bash
curl http://localhost:3000/api/v1/listings
curl http://localhost:3000/api/v1/listings/search?location=Bengaluru
```

### Using Browser
```
App3: http://localhost:3000/
App4: http://localhost:3000/static/index.html
App5: http://localhost:3000/api/v1/listings
```

## Database Setup (App5 Only)

### Create .env File
```bash
cd app5
echo 'MONGO_URI=mongodb://localhost:27017/listings' > .env
```

### MongoDB Local
```bash
mongod  # Start MongoDB server
```

### MongoDB Atlas (Cloud)
1. Create account at https://www.mongodb.com/cloud/atlas
2. Create database cluster
3. Get connection string
4. Add to .env as MONGO_URI

## File Structures at a Glance

### App1
```
app1/
├── app.js
└── package.json
```

### App2
```
app2/
├── app.js
└── package.json
```

### App3
```
app3/
├── app.js
└── package.json
```

### App4
```
app4/
├── app.js
├── package.json
└── public/
    ├── index.html
    ├── resume.html
    ├── wallofskills.html
    ├── resume-css-stylesheet.css
    ├── docs/
    ├── fonts/
    └── logos/
```

### App5
```
app5/
├── app.js
├── package.json
├── .env
├── db/
│   └── db.js
├── models/
│   └── listings.js
└── routes/
    └── listings.js
```

## Common Issues

| Issue | Solution |
|-------|----------|
| Port 3000 already in use | Change PORT in app.js or kill process on port |
| Module not found | Run `npm install` in app directory |
| .env not found (App5) | Create .env file with MONGO_URI |
| Cannot connect to MongoDB | Ensure MongoDB is running |
| ES6 syntax error | Check package.json has `"type": "module"` |

## Development Workflow

### For CLI Apps (App1, App2)
```bash
cd appX
node app.js
# No server running, executes and exits
```

### For Web Servers (App3, App4, App5)
```bash
cd appX
npm install        # First time only
node app.js        # Starts server
# Keep terminal open
# In another terminal, make requests
curl http://localhost:3000/...
```

## Concepts Covered

| App | Concepts |
|-----|----------|
| app1 | ES6 modules, readline, CLI input |
| app2 | fs.promises, async/await, path resolution |
| app3 | Express basics, routing, server setup |
| app4 | Static middleware, file downloads, MIME types |
| app5 | REST APIs, MongoDB, Mongoose, MVC pattern |

## Learning Path Recommendation

1. **Start with App1**: Understand Node.js basics
2. **Move to App2**: Learn file system operations
3. **Try App3**: Get familiar with Express
4. **Build upon App4**: Understand static serving
5. **Master App5**: Learn full-stack development

## Environment Setup Checklist

- [ ] Node.js installed (v14+)
- [ ] npm available
- [ ] MongoDB installed or Atlas account
- [ ] Git configured
- [ ] Code editor ready (VS Code recommended)

## Performance Tips

- **App1 & App2**: Instant execution
- **App3 & App4**: <100ms response time
- **App5**: 50-200ms depending on database queries

## Production Deployment

### Prerequisites
- Hosting platform (Heroku, Railway, AWS, etc.)
- Environment variables configured
- Database backup strategy
- Error logging setup
- Status monitoring

### Steps
1. Test locally
2. Create production .env
3. Push to hosting platform
4. Configure database for production
5. Set up monitoring
6. Enable backups

## Documentation Files

Each app has its own detailed README.md:
- [app1/README.md](app1/README.md) - 450+ lines
- [app2/README.md](app2/README.md) - 500+ lines
- [app3/README.md](app3/README.md) - 450+ lines
- [app4/README.md](app4/README.md) - 550+ lines
- [app5/README.md](app5/README.md) - 700+ lines

## Quick Resources

### Official Documentation
- [Express.js Docs](https://expressjs.com/)
- [Node.js Docs](https://nodejs.org/docs/)
- [MongoDB Docs](https://docs.mongodb.com/)
- [Mongoose Docs](https://mongoosejs.com/)

### Tutorials
- [Express Getting Started](https://expressjs.com/en/starter/installing.html)
- [MongoDB University](https://university.mongodb.com/)
- [Node.js Best Practices](https://github.com/goldbergyoni/nodebestpractices)

## Support & Help

1. Check individual app README.md files
2. Review code comments
3. Check error messages carefully
4. Verify environment variables
5. Check database connection
6. Review dependencies versions

## Version Requirements

- **Node.js**: v14 or higher (v18+ recommended)
- **npm**: v6 or higher (v8+ recommended)
- **Express.js**: v5.2.1
- **Mongoose**: v9.2.1
- **MongoDB**: v4.4+ (or use MongoDB Atlas)

## Key Takeaways

✓ **App1**: Financial calculations with CLI
✓ **App2**: File system operations and organization
✓ **App3**: Web server fundamentals
✓ **App4**: Static file serving and downloads
✓ **App5**: Full REST API with database

## Author
Vishwas

## License
ISC

---

**Last Updated:** February 2026
**Documentation Version:** 1.0
