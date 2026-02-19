# App15: User API Fetch

## Overview
Fetches random user data from an external API (https://randomuser.me/api) and displays it with Bootstrap styling.

## Purpose
Learn and practice:
- fetch() API for HTTP requests
- async/await syntax
- JSON parsing and destructuring
- Handling API responses
- Error handling
- Bootstrap framework
- Dynamic HTML generation
- Real API integration

## API Details

### Endpoint
```
https://randomuser.me/api/
```

### Response Format
```json
{
    "results": [
        {
            "gender": "male",
            "name": {
                "title": "Mr",
                "first": "John",
                "last": "Doe"
            },
            "email": "john@example.com",
            "phone": "(555) 123-4567",
            "picture": {
                "large": "https://..."
            }
        }
    ]
}
```

## fetch() API

### Basic Syntax
```javascript
fetch(url)
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
```

### Response Methods
- response.json() - Parse as JSON
- response.text() - Parse as text
- response.status - HTTP status code
- response.ok - Boolean (status 200-299)

## async/await Approach

### Function Definition
```javascript
async function fetchUser() {
    try {
        const response = await fetch(url);
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}
```

### Benefits
- Cleaner syntax than .then()
- Sequential flow
- Easier error handling

## Complete Example

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>RandomUser API</title>
</head>
<body class="p-5">
    <div class="container">
        <h1 class="mb-4">Random User Finder</h1>
        <button id="btn" class="btn btn-primary mb-3">Get User</button>
        <div id="result"></div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        const btn = document.getElementById('btn');
        const result = document.getElementById('result');

        async function fetchUser() {
            try {
                const response = await fetch('https://randomuser.me/api/');
                const data = await response.json();
                const user = data.results[0];
                
                displayUser(user);
            } catch (error) {
                result.innerHTML = `<p class="text-danger">Error: ${error}</p>`;
            }
        }

        function displayUser(user) {
            const html = `
                <div class="card">
                    <img src="${user.picture.large}" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">${user.name.first} ${user.name.last}</h5>
                        <p><strong>Email:</strong> ${user.email}</p>
                        <p><strong>Phone:</strong> ${user.phone}</p>
                        <p><strong>Gender:</strong> ${user.gender}</p>
                    </div>
                </div>
            `;
            result.innerHTML = html;
        }

        btn.addEventListener('click', fetchUser);
    </script>
</body>
</html>
```

## Destructuring

Extract specific properties:

```javascript
// Without destructuring
const firstName = user.name.first;
const lastName = user.name.last;

// With destructuring
const { name: { first, last } } = user;
console.log(first, last);
```

## Bootstrap Card

```html
<div class="card">
    <img src="..." class="card-img-top">
    <div class="card-body">
        <h5 class="card-title">Title</h5>
        <p class="card-text">Content</p>
    </div>
</div>
```

## Error Handling

### Network Error
```javascript
if (!response.ok) {
    throw new Error(`HTTP error! status: ${response.status}`);
}
```

### Parse Error
```javascript
try {
    const data = await response.json();
} catch (error) {
    console.error('Invalid JSON');
}
```

### Complete Handler
```javascript
async function fetchUser() {
    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Status ${response.status}`);
        }
        const data = await response.json();
        displayUser(data.results[0]);
    } catch (error) {
        console.error('Error:', error.message);
        result.innerHTML = `<p>Error: ${error.message}</p>`;
    }
}
```

## API Response Structure

```
response {
    results: [
        {
            gender: "male",
            name: {
                title: "Mr",
                first: "John",
                last: "Doe"
            },
            email: "john@example.com",
            phone: "(555) 123-4567",
            location: { ... },
            picture: {
                large: "https://...",
                medium: "https://...",
                thumbnail: "https://..."
            }
        }
    ]
}
```

Access:
```javascript
const user = data.results[0];
user.name.first;        // "John"
user.picture.large;     // URL string
```

## Progressive Enhancement

### Loading State
```javascript
btn.disabled = true;
btn.textContent = 'Loading...';
// After response
btn.disabled = false;
btn.textContent = 'Get User';
```

### Empty Check
```javascript
if (!data.results || data.results.length === 0) {
    throw new Error('No users returned');
}
```

## File Structure
```
app15/
└── index.html      # User API fetch app
```

## Learning Outcomes

- fetch() API for HTTP requests
- async/await for cleaner code
- Promise handling
- JSON parsing
- Error handling with try/catch
- Destructuring objects
- Bootstrap integration
- Template literals
- Real API integration
- Display dynamic content

## How to Test

1. Open in browser
2. Click "Get User"
3. Random user data fetches from API
4. User card displays
5. Click again for new user
6. Try offline - see error handling

## API Features

- Free public API
- No authentication required
- CORS enabled
- Returns random user data
- Includes profile picture

## Practice Exercises

**Easy**: 
- Display more fields
- Show nationality
- Add loading indicator

**Medium**: 
- Fetch multiple users
- Add filters (gender, etc)
- Search functionality

**Hard**: 
- Cache previous results
- Pagination
- Compare user profiles
- Save favorites to localStorage

## Browser Support

✓ Modern browsers (ES6+):
- fetch()
- async/await
- Promise
- Template literals
- Destructuring

## Common Errors

❌ CORS errors - Use CORS-enabled API
❌ Network offline - Add offline handling
❌ Slow loading - Add loading indicator
❌ Missing error handling - Use try/catch

## Key Takeaways

✓ fetch() retrieves data from APIs
✓ async/await makes async code readable
✓ response.json() parses JSON
✓ Error handling improves reliability
✓ Bootstrap simplifies styling
✓ Real APIs unlock unlimited data
✓ Destructuring cleans up code

## Next Steps

1. Explore more APIs (Weather, GitHub, etc)
2. Build search functionality
3. Add pagination
4. Store data in database
5. Build full application

## Author
Vishwas K Singh

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App14](../app14/README.md)** | **[Complete! 🎉](../README.md)**
