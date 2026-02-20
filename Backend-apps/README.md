# Backend Applications Documentation

This directory contains a collection of Node.js backend applications demonstrating various concepts and technologies, from basic CLI utilities to full-stack Express applications with database integration.

## Overview

| App | Name | Purpose | Tech Stack |
|-----|------|---------|-----------|
| [app1](#app1) | Simple Interest Calculator | CLI utility for financial calculations | Node.js (ES Modules) |
| [app2](#app2) | File Organizer | Folder and file organization utility | Node.js (CommonJS) |
| [app3](#app3) | Basic Express Server | Simple HTTP server | Express.js v5.2.1 |
| [app4](#app4) | Static File Server | Express server with static assets and file downloads | Express.js v5.2.1 |
| [app5](#app5) | Listings REST API | Full-stack API with MongoDB integration | Express.js, MongoDB, Mongoose |

---

## <a name="app1"></a>App1: Simple Interest Calculator

### Description
A command-line utility that calculates simple interest based on principal amount, rate of interest, and time period.

### Features
- Interactive CLI prompts for user input
- Calculates simple interest using the formula: SI = (P × R × T) / 100
- Formatted output with 2 decimal places

### Technology Stack
- **Runtime:** Node.js
- **Module System:** ES Modules (type: "module")

### How to Use
```bash
cd app1
node app.js
```

### Input Prompts
1. Principal amount (loan/investment amount)
2. Rate of interest (annual percentage)
3. Time in months

### Formula
```
Simple Interest = (Principal × Rate × Time) / 100
```

### Example
```
Enter the Principal amount: 300000
Enter the rate of interest: 7
Enter the Time in Months: 36
Output: Simple interest for 300000 at 7 for the duration 36 months is 63000.00
```

### Project Structure
```
app1/
├── app.js           # Main calculator application
├── package.json     # Project configuration
```

---

## <a name="app2"></a>App2: File Organizer

### Description
A utility that automatically organizes files in a folder by creating subdirectories based on file extensions and moving files accordingly.

### Features
- Async file system operations
- Automatic folder creation by file type
- Organized file structure by extension
- Error handling with detailed messages
- Skips directories (only processes files)

### Technology Stack
- **Runtime:** Node.js
- **Module System:** CommonJS
- **APIs:** fs.promises, path

### How to Use
```bash
cd app2
node app.js
```

### What It Does
1. Scans target folder for files
2. Extracts file extensions
3. Creates category folders (one per extension type)
4. Moves files into their respective category folders
5. Files with no extension go to 'others' folder

### About the Target Directory
The application organizes files within a folder specified as the function parameter. Update the `folderName` in the code to target different directories.

### Project Structure
```
app2/
├── app.js           # File organizer utility
├── package.json     # Project configuration
```

### Example Folder Structure
**Before:**
```
documents/
├── report.pdf
├── notes.txt
├── image.jpg
├── script.js
```

**After:**
```
documents/
├── pdf/
│   └── report.pdf
├── txt/
│   └── notes.txt
├── jpg/
│   └── image.jpg
├── js/
│   └── script.js
```

---

## <a name="app3"></a>App3: Basic Express Server

### Description
A minimal Express.js server that serves a GET endpoint returning a simple welcome message.

### Features
- Basic HTTP server setup
- Single GET endpoint
- Runs on port 3000
- Simple request-response flow

### Technology Stack
- **Framework:** Express.js v5.2.1
- **Runtime:** Node.js
- **Module System:** CommonJS

### How to Use
```bash
cd app3
npm install
npm start
# or
node app.js
```

### API Endpoints

| Method | Endpoint | Description | Response |
|--------|----------|-------------|----------|
| GET | `/` | Root endpoint | "Hello, World Express" |

### How to Test
```bash
curl http://localhost:3000/
# Output: Hello, World Express
```

### Project Structure
```
app3/
├── app.js           # Express server configuration
├── package.json     # Dependencies and scripts
```

---

## <a name="app4"></a>App4: Static File Server

### Description
An Express.js server that serves static assets from a public directory and provides file download capabilities, specifically for downloading resume PDFs.

### Features
- Static file serving from `/public` directory
- Resume download endpoint
- Path resolution for reliable file serving
- GET endpoints for content and downloads

### Technology Stack
- **Framework:** Express.js v5.2.1
- **Runtime:** Node.js
- **Module System:** CommonJS
- **File System:** Node.js path module

### How to Use
```bash
cd app4
npm install
npm start
# or
node app.js
```

### API Endpoints

| Method | Endpoint | Description | Returns |
|--------|----------|-------------|---------|
| GET | `/` | Root endpoint | "Hello, World Express" |
| GET | `/download/resume` | Download resume | resume_vks.pdf file |
| GET | `/static/*` | Static assets | Files from `/public` directory |

### How to Test
```bash
# Test root endpoint
curl http://localhost:3000/

# Test resume download
curl -O http://localhost:3000/download/resume

# Access static assets
curl http://localhost:3000/static/index.html
curl http://localhost:3000/static/resume-css-stylesheet.css
```

### Project Structure
```
app4/
├── app.js                                   # Express server with static routing
├── package.json                             # Dependencies and scripts
└── public/                                  # Static assets directory
    ├── index.html                           # Main HTML file
    ├── resume.html                          # Resume page
    ├── wallofskills.html                    # Skills showcase page
    ├── resume-css-stylesheet.css            # Styling for resume
    ├── docs/                                # Documentation folder
    ├── fonts/                               # Font files
    └── logos/
        └── list.txt                         # Logo list
```

---

## <a name="app5"></a>App5: Listings REST API

### Description
A full-featured REST API for managing property or item listings with MongoDB database integration. Demonstrates best practices for API development including environment configuration, database connection, models, and routing.

### Features
- Express.js REST API framework
- MongoDB database integration via Mongoose
- Environment variable configuration (.env)
- Modular architecture (routes, models, database)
- Document-based data storage

### Technology Stack
- **Framework:** Express.js v5.2.1
- **Database:** MongoDB
- **ODM:** Mongoose v9.2.1
- **Configuration:** dotenv v17.3.1
- **Runtime:** Node.js
- **Module System:** CommonJS

### How to Use

#### Prerequisites
- Node.js installed
- MongoDB running locally or remote connection string available
- .env file configured

#### Installation
```bash
cd app5
npm install
```

#### Configuration
Create a `.env` file in the app5 directory:
```
MONGO_URI=mongodb://localhost:27017/listings
# or for MongoDB Atlas:
MONGO_URI=mongodb+srv://username:password@cluster.mongodb.net/listings
```

#### Running the Server
```bash
npm start
# or
node app.js
```

The server will start on port 3000 and connect to MongoDB.

### API Endpoints

| Method | Endpoint | Description | Parameters |
|--------|----------|-------------|-----------|
| GET | `/api/v1/listings` | Get all listings | None |
| GET | `/api/v1/listings/search` | Search listings by location | `location` (query param) |
| GET | `/api/v1/listings/:listingId` | Get listing by ID | `listingId` (path param) |

### Request/Response Examples

#### Get All Listings
```bash
curl http://localhost:3000/api/v1/listings

# Response:
[
  {
    "_id": "...",
    "name": "Blore Apts",
    "location": "Bengaluru",
    "price": 500000
  },
  ...
]
```

#### Search by Location
```bash
curl http://localhost:3000/api/v1/listings/search?location=Bengaluru

# Response:
{
  "_id": "...",
  "name": "Blore Apts",
  "location": "Bengaluru",
  "price": 500000
}
```

#### Get Single Listing
```bash
curl http://localhost:3000/api/v1/listings/1

# Response:
{
  "_id": "...",
  "name": "Prestige Apt",
  "location": "Bengaluru",
  "price": 750000
}
```

### Database Schema

#### Listing Model
```javascript
{
  name: {
    type: String,
    required: true       // Must be provided
  },
  location: {
    type: String,
    required: false      // Optional
  },
  price: {
    type: Number,
    required: false      // Optional
  }
}
```

### Project Structure
```
app5/
├── app.js                      # Express server setup and routes registration
├── package.json                # Dependencies and scripts
├── .env                        # Environment variables (MongoDB URI)
├── db/
│   └── db.js                  # MongoDB connection function
├── models/
│   └── listings.js            # Listing schema and model
└── routes/
    └── listings.js            # API endpoints for listings
```

### Architecture

```
app.js (Entry Point)
  ├── Load .env configuration
  ├── Connect to MongoDB (db/db.js)
  ├── Register routes (routes/listings.js)
  │   └── Uses models (models/listings.js)
  └── Start Express server on port 3000
```

### Future Enhancements
- [ ] Add POST endpoint for creating listings
- [ ] Add PUT endpoint for updating listings
- [ ] Add DELETE endpoint for removing listings
- [ ] Add request validation and error handling
- [ ] Add authentication/authorization
- [ ] Add pagination for GET all listings
- [ ] Add filtering and sorting options

---

## Getting Started

### Prerequisites for All Apps
- Node.js (v14 or higher)
- npm or yarn package manager

### Installing Dependencies

For apps 3, 4, and 5 (which use Express.js):
```bash
cd <app-directory>
npm install
```

### Running the Applications

1. **App1 & App2:** CLI utilities - run directly with `node app.js`
2. **App3, App4, & App5:** Express servers - run with `node app.js` and access via HTTP

---

## Common Issues and Troubleshooting

### Port Already in Use
If port 3000 is already in use:
- Change the PORT variable in app.js
- Or kill the process using the port

### MongoDB Connection Error (App5)
- Ensure MongoDB is running
- Verify MONGO_URI in .env file is correct
- Check MongoDB credentials and network access

### Module Not Found
- Run `npm install` in the app directory
- Verify package.json exists and is valid

---

## Author
Vishwas (Created as part of learning Node.js and Express.js)

## License
ISC

