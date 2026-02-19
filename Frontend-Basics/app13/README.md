# App13: DOM Manipulation

## Overview
Demonstrates dynamic HTML element creation and removal. Shows how to add and hide elements using JavaScript.

## Purpose
Learn and practice:
- createElement() for creating elements
- appendChild() to add elements
- remove() to delete elements
- classList.toggle() for styling
- Event listeners for interaction
- Dynamic content creation

## Key Features

### Hide Element
```html
<button type="button" id="hideBtn">Hide</button>
```

Removes element from DOM.

### Add Element
```html
<button type="button" id="addBtn">Add Element</button>
```

Creates and appends new div.

## JavaScript Code

### Element Selection
```javascript
let elementHide = document.getElementById('elementHide');
let hideBtn = document.getElementById('hideBtn');
let addEle = document.getElementById('addingEle');
let addBtn = document.getElementById('addBtn');
```

### Hide Function
```javascript
function hideEle(){
    elementHide.remove();
}
```

Completely removes from DOM.

### Add Function
```javascript
function addNewEle(){
    let newEle = document.createElement('div');
    newEle.textContent = "Hello";
    addEle.appendChild(newEle);
}
```

Creates div, sets text, appends.

### Event Listeners
```javascript
hideBtn.addEventListener('click', hideEle);
addBtn.addEventListener('click', addNewEle);
```

Attach functions to buttons.

## DOM Methods

### createElement()
```javascript
let div = document.createElement('div');
let p = document.createElement('p');
let span = document.createElement('span');
```

Creates element in memory (not on page yet).

### appendChild()
```javascript
parent.appendChild(child);
```

Adds child to end of parent.

### insertBefore()
```javascript
parent.insertBefore(newChild, referenceChild);
```

Insert at specific position.

### remove()
```javascript
element.remove();
```

Removes element from DOM.

### textContent
```javascript
element.textContent = "New text";
```

Sets text content.

### innerHTML
```javascript
element.innerHTML = "<p>HTML content</p>";
```

Sets HTML content (be careful with security).

## Class Manipulation

### With classList
```javascript
element.classList.add('className');
element.classList.remove('className');
element.classList.toggle('className');
element.classList.contains('className');
```

### Styling Classes
```css
.is-hidden {
    display: none;
}
```

### Toggle Method (Alternative to remove)
```javascript
function hideEle(){
    elementHide.classList.toggle('is-hidden');
}
```

Toggles class on/off.

## DOM Tree Structure

```
html
├── head
└── body
    ├── h1
    ├── p#elementHide
    ├── button#hideBtn
    ├── button#addBtn
    └── p#addingEle
        └── div (added dynamically)
            └── text: "Hello"
```

## Complete Example

```html
<div id="container"></div>
<button id="addBtn">Add Item</button>

<script>
    const container = document.getElementById('container');
    const addBtn = document.getElementById('addBtn');
    
    function addItem() {
        const newDiv = document.createElement('div');
        newDiv.textContent = `Item ${container.children.length + 1}`;
        newDiv.style.padding = '10px';
        newDiv.style.margin = '5px';
        newDiv.style.backgroundColor = '#eee';
        
        container.appendChild(newDiv);
    }
    
    addBtn.addEventListener('click', addItem);
</script>
```

## Performance Notes

### Batch Insertions
```javascript
// Bad: Reflow each time
for(let i = 0; i < 100; i++) {
    container.appendChild(createItem());
}

// Better: Use DocumentFragment
const fragment = document.createDocumentFragment();
for(let i = 0; i < 100; i++) {
    fragment.appendChild(createItem());
}
container.appendChild(fragment);
```

## File Structure
```
app13/
└── index.html      # DOM manipulation demo
```

## Learning Outcomes

- createElement() for new elements
- appendChild() to add elements
- remove() to delete elements
- classList for styling control
- Event listeners for interactivity
- Dynamic content creation
- DOM tree manipulation
- Performance optimization

## How to Test

1. Open in browser
2. Click "Hide" button
3. Paragraph disappears
4. Click "Add Element" multiple times
5. New divs appear with "Hello"
6. Inspect element to see structure

## Practice Exercises

**Easy**: 
- Change text appearing
- Add multiple elements
- Use different tags

**Medium**: 
- Add styles to created elements
- Create numbered items
- Add remove button per item

**Hard**: 
- Create todo list
- Add input validation
- Implement drag/drop

## Common Mistakes

❌ Using innerHTML when not needed
❌ Not storing element references
❌ Adding listeners in loop without closure
❌ Forgetting appendChild

## Browser Support

✓ All browsers support:
- createElement()
- appendChild()
- remove()
- classList
- addEventListener()

## Next Steps

1. Create dynamic lists
2. Build interactive UI
3. Create todo app
4. Add animations
5. Implement drag-and-drop

## Key Takeaways

✓ JavaScript can dynamically modify DOM
✓ createElement creates elements in memory
✓ appendChild/insertBefore add to page
✓ remove() completely deletes elements
✓ classList is safer than direct styling
✓ Events trigger dynamic behavior

## Author
Vishwas K Singh

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App12](../app12/README.md)** | **[Next: App14 →](../app14/README.md)**
