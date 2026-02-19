# App14: Array Operations

## Overview
Demonstrates JavaScript array methods through practical examples. Shows push, pop, shift, unshift operations using a shopping cart concept.

## Purpose
Learn and practice:
- Array data structure
- push() to add elements
- pop() to remove last
- shift() to remove first
- unshift() to add first
- array.length property
- forEach() iteration
- Real-world shopping cart

## Shopping Cart Example

### Initial Array
```javascript
const cart = ['item1', 'item2', 'item3'];
```

## Array Methods

### push() - Add to End
```javascript
cart.push('item4');
// Result: ['item1', 'item2', 'item3', 'item4']
```

Adds element to end and returns new length.

### pop() - Remove Last
```javascript
let removed = cart.pop();
// Removed: 'item4'
// Cart: ['item1', 'item2', 'item3']
```

Removes last and returns it.

### unshift() - Add to Start
```javascript
cart.unshift('item0');
// Result: ['item0', 'item1', 'item2', 'item3']
```

Adds to beginning and returns new length.

### shift() - Remove First
```javascript
let first = cart.shift();
// Removed: 'item0'
// Cart: ['item1', 'item2', 'item3']
```

Removes first and returns it.

### length Property
```javascript
console.log(cart.length);  // 3
```

Returns number of items.

### Iteration - forEach()
```javascript
cart.forEach(function(item){
    console.log(item);
});

// Modern arrow function
cart.forEach(item => {
    console.log(item);
});
```

Runs function for each element.

## Complete Shopping Cart Code

```html
<input type="text" id="itemInput">
<button id="addBtn">Add Item</button>
<button id="removeBtn">Remove Item</button>
<ul id="cartList"></ul>

<script>
const cart = [];
const itemInput = document.getElementById('itemInput');
const addBtn = document.getElementById('addBtn');
const removeBtn = document.getElementById('removeBtn');
const cartList = document.getElementById('cartList');

// Add item
addBtn.addEventListener('click', function(){
    const item = itemInput.value;
    if(item){
        cart.push(item);
        updateDisplay();
        itemInput.value = '';
    }
});

// Remove item
removeBtn.addEventListener('click', function(){
    if(cart.length > 0){
        cart.pop();
        updateDisplay();
    }
});

// Update display
function updateDisplay(){
    cartList.innerHTML = '';
    cart.forEach(function(item){
        const li = document.createElement('li');
        li.textContent = item;
        cartList.appendChild(li);
    });
}
</script>
```

## Array Operations Comparison

| Method | Action | Returns | Affects |
|--------|--------|---------|---------|
| push() | Add end | length | Original |
| pop() | Remove end | element | Original |
| unshift() | Add start | length | Original |
| shift() | Remove start | element | Original |

## Visual Example

```javascript
let arr = [1, 2, 3];

arr.push(4);           // [1, 2, 3, 4]
arr.pop();             // [1, 2, 3]
arr.unshift(0);        // [0, 1, 2, 3]
arr.shift();           // [1, 2, 3]
```

## Other Array Methods to Know

### slice() - Copy
```javascript
let copy = arr.slice();  // Copies array
let portion = arr.slice(1, 3);  // Gets elements 1-2
```

### splice() - Modify
```javascript
arr.splice(1, 2, 'a', 'b');  // Remove 2 at index 1, add 'a', 'b'
```

### indexOf() - Find
```javascript
let pos = arr.indexOf('item2');  // Position or -1
```

### includes() - Check
```javascript
if(arr.includes('item2')) { }  // true/false
```

## Practical Uses

### Shopping Cart
```javascript
function addToCart(product) {
    cart.push(product);
}

function removeFromCart() {
    cart.pop();
}

function clearCart() {
    cart = [];
}

function itemCount() {
    return cart.length;
}
```

### Task List
```javascript
const tasks = [];

tasks.push('Buy milk');      // Add task
tasks.forEach(task => {
    console.log('TODO: ' + task);
});
```

## Common Patterns

### Add with Validation
```javascript
if(item && item.length > 0) {
    cart.push(item);
}
```

### Remove with Check
```javascript
if(cart.length > 0) {
    cart.pop();
}
```

### Counter
```javascript
console.log(`Cart has ${cart.length} items`);
```

## File Structure
```
app14/
└── index.html      # Shopping cart demo
```

## Learning Outcomes

- Array structure and purpose
- push() to add elements
- pop() to remove last
- shift() to remove first
- unshift() to add first
- length property
- forEach() iteration
- Real-world shopping cart app
- Array method chaining

## How to Test

1. Open in browser
2. Type item in input
3. Click "Add Item"
4. See item in cart
5. Click "Remove Item"
6. See item disappear
7. Try multiple items

## Practice Exercises

**Easy**: 
- Display cart count
- Clear all items
- Add multiple items

**Medium**: 
- Prevent duplicates
- Add price tracking
- Calculate total

**Hard**: 
- Persistent storage (localStorage)
- Edit existing items
- Quantity tracker per item

## Browser Support

✓ All browsers support:
- Arrays
- push(), pop(), shift(), unshift()
- forEach()
- Array.length

## Key Takeaways

✓ Arrays store collections of data
✓ push/pop work at end
✓ shift/unshift work at start
✓ forEach iterates through items
✓ length tells you how many items
✓ Real-world use in shopping carts, todos

## Author
Vishwas K Singh

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App13](../app13/README.md)** | **[Next: App15 →](../app15/README.md)**
