# App3: Basic Express Server

## Overview
A minimal HTTP server built with Express.js that demonstrates the fundamentals of setting up a web server and handling basic GET requests. This is a beginner-friendly project for learning Express.js basics.

## Purpose
Learn and practice:
- Express.js fundamentals
- Setting up an HTTP server
- Basic routing
- Request-response cycle
- Server configuration

## Features
✓ Simple HTTP server setup
✓ Single GET endpoint
✓ Runs on port 3000
✓ Easy to understand and extend

## Technology Stack
| Component | Technology |
|-----------|-----------|
| **Framework** | Express.js v5.2.1 |
| **Runtime** | Node.js |
| **Module System** | CommonJS |
| **Server Port** | 3000 |

## Installation

```bash
cd app3
npm install
```

The installation will download Express.js and its dependencies.

## Usage

### Starting the Server
```bash
node app.js
# or using npm scripts
npm start
```

### Expected Output
```
Listening on 3000....
```

The server is now running and ready to accept requests.

### Accessing the Server

**Using curl:**
```bash
curl http://localhost:3000/
```

**Using browser:**
Navigate to: `http://localhost:3000/`

**Using a REST client (Postman, Insomnia):**
- Method: GET
- URL: http://localhost:3000/
- Expected Response: "Hello, World Express"

### Stopping the Server
Press `Ctrl + C` in the terminal

## Code Explanation

### Imports
```javascript
const express = require('express');
```
- Imports Express.js framework using CommonJS syntax

### Initialize Express App
```javascript
const app = express();
const PORT = 3000;
```
- Creates an Express application instance
- Defines the port number for the server

### Define Route
```javascript
app.get('/', (req, res) => {
    res.send('Hello, World Express');
});
```
- Registers a GET route at the root path `/`
- `req`: Request object containing request information
- `res`: Response object for sending responses
- `res.send()`: Sends a response to the client

### Start Server
```javascript
app.listen(PORT, () => {
    console.log(`Listening on ${PORT}....`);
});
```
- Starts the server on the specified PORT
- Callback function logs when server is ready

## API Reference

### Routes

| Method | Path | Description | Response |
|--------|------|-------------|----------|
| GET | `/` | Root endpoint | "Hello, World Express" |

## Request-Response Flow

```
Client Request (GET http://localhost:3000/)
    ↓
Express Router
    ↓
Route Handler (app.get('/'))
    ↓
Response (res.send())
    ↓
Client receives: "Hello, World Express"
```

## File Structure
```
app3/
├── app.js           # Express server setup
├── package.json     # Dependencies and configuration
└── README.md        # This file
```

## Package.json Details
```json
{
  "name": "app3",
  "version": "1.0.0",
  "main": "app.js",
  "type": "commonjs",
  "dependencies": {
    "express": "^5.2.1"
  },
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  }
}
```

## Key Concepts

### Middleware vs Route Handlers
- **Route Handler**: `app.get()` - handles specific routes
- **Middleware**: Functions that run on every request (not used here yet)

### HTTP Methods
- **GET**: Request data from server (used here)
- **POST**: Send data to server
- **PUT**: Update existing data
- **DELETE**: Remove data

### Express Methods
| Method | Purpose |
|--------|---------|
| `app.get()` | Handle GET requests |
| `app.post()` | Handle POST requests |
| `app.put()` | Handle PUT requests |
| `app.delete()` | Handle DELETE requests |
| `app.use()` | Register middleware |
| `app.listen()` | Start the server |

## Common Response Methods

| Method | Purpose | Example |
|--------|---------|---------|
| `res.send()` | Send text/HTML response | `res.send('Hello')` |
| `res.json()` | Send JSON response | `res.json({msg: 'Hello'})` |
| `res.html()` | Send HTML response | `res.sendFile('index.html')` |
| `res.status()` | Set HTTP status code | `res.status(404)` |
| `res.redirect()` | Redirect to another URL | `res.redirect('/other')` |

## Request Object Properties

| Property | Description |
|----------|-------------|
| `req.method` | HTTP method (GET, POST, etc.) |
| `req.url` | Request URL path |
| `req.query` | Query string parameters |
| `req.params` | Route parameters |
| `req.body` | Request body (requires middleware) |
| `req.headers` | Request headers |

## Example Extensions

### Adding a New Route
```javascript
app.get('/about', (req, res) => {
    res.send('This is the about page');
});
```

### Returning JSON
```javascript
app.get('/api/user', (req, res) => {
    res.json({ name: 'John', age: 30 });
});
```

### Dynamic Route Parameters
```javascript
app.get('/user/:id', (req, res) => {
    res.json({ userId: req.params.id });
});
```

### Query Parameters
```javascript
// Request: /search?q=express
app.get('/search', (req, res) => {
    const query = req.query.q;
    res.send(`Searching for: ${query}`);
});
```

## Testing

### Using curl
```bash
# Test the endpoint
curl http://localhost:3000/

# See response headers
curl -i http://localhost:3000/

# Verbose output
curl -v http://localhost:3000/
```

### Using wget
```bash
wget http://localhost:3000/
cat index.html
```

### Programmatic Testing
```javascript
const http = require('http');

const options = {
    hostname: 'localhost',
    port: 3000,
    path: '/',
    method: 'GET'
};

const req = http.request(options, (res) => {
    let data = '';
    res.on('data', chunk => data += chunk);
    res.on('end', () => console.log(data));
});

req.end();
```

## Debugging Tips

### Enable Logging
```javascript
// Add before defining routes
app.use((req, res, next) => {
    console.log(`${req.method} ${req.path}`);
    next();
});
```

### Check Port Usage
```bash
# On Linux/Mac
lsof -i :3000

# On Windows
netstat -ano | findstr :3000
```

### Set Different Port
```javascript
const PORT = process.env.PORT || 3000;
```

## Common Issues

| Issue | Cause | Solution |
|-------|-------|----------|
| "Port already in use" | Another process using port 3000 | Change PORT variable or stop other process |
| "Cannot GET /" | Route not defined | Ensure `app.get('/', ...)` is defined |
| "Cannot find module 'express'" | Dependencies not installed | Run `npm install` |
| Server not starting | Syntax error in code | Check console for error messages |

## Performance Considerations

- **Lightweight**: Minimal code, fast startup
- **Single Route**: Very efficient
- **No Middleware Overhead**: Only direct routing
- **Good for Learning**: Not production-ready yet

## Security Notes

- No input validation
- No authentication
- No rate limiting
- No CORS handling

Add these in production applications.

## Hosting Options

Once developed, you can deploy this to:
- Heroku
- AWS EC2
- DigitalOcean
- Railway.app
- Render
- Replit

## Next Steps

After mastering this basic app, explore:

1. **Multiple Routes**: Handle different endpoints
2. **Query Parameters**: Process URL parameters
3. **Request Body**: Handle POST requests
4. **Middleware**: Add functionality to all routes
5. **Template Engines**: Serve dynamic HTML
6. **Static Files**: Serve CSS, JavaScript, images
7. **Error Handling**: Gracefully handle errors
8. **Environment Variables**: Configuration management

## Project Dependencies

```json
{
  "express": "^5.2.1"
}
```

- **express**: Web application framework for Node.js

## Advantages of Express.js

✓ Simplifies server creation
✓ Routing support
✓ Middleware system
✓ Easy to extend
✓ Large community
✓ Well-documented

## Real-World Applications

This basic pattern is used for:
- REST APIs
- Web applications
- Microservices
- Webhooks
- Real-time applications (with WebSockets)

## Author
Vishwas

## License
ISC

## References
- [Express.js Official Documentation](https://expressjs.com/)
- [Node.js HTTP Module](https://nodejs.org/api/http.html)
- [Routing in Express](https://expressjs.com/en/guide/routing.html)
- [Request Object](https://expressjs.com/en/api/request.html)
- [Response Object](https://expressjs.com/en/api/response.html)
