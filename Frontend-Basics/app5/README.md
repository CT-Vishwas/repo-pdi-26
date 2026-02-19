# App5: Contact Form

## Overview
A comprehensive HTML contact form with various input types and CSS styling. Demonstrates form creation, input validation, and professional form design.

## Purpose
Learn and practice:
- Form creation and submission
- Various HTML input types
- Form validation attributes
- Fieldset and legend organization
- Form styling with CSS
- Accessibility in forms

## Form Structure

```html
<form action="">
    <fieldset>
        <legend><h2>Contact Information</h2></legend>
        <!-- Form fields -->
    </fieldset>
</form>
```

## Form Fields

### 1. Full Name
```html
<label class="input-labels" for="fullname">Full Name:</label>
<input type="text" 
       id="fullname" 
       name="fullname" 
       placeholder="John Doe" />
```
- **Type**: text
- **Placeholder**: John Doe
- **Purpose**: Collect user's name

### 2. Email
```html
<label class="input-labels" for="emailId">Email:</label>
<input type="email" 
       id="emailId" 
       name="emailId" 
       placeholder="john.doe@example.com"/>
```
- **Type**: email (built-in validation)
- **Placeholder**: john.doe@example.com
- **Validation**: Must be valid email format

### 3. Phone Number
```html
<label class="input-labels" for="phonenumber">Phone Number:</label>
<input type="tel" 
       pattern="[0-9]{10}" 
       id="phonenumber" 
       name="phonenumber" 
       placeholder="1234567890"/>
<small>Format: 1234567890 (10 Digits)</small>
```
- **Type**: tel (telephone)
- **Pattern**: Exactly 10 digits
- **Helper text**: Format instruction

### 4. Age
```html
<label class="input-labels" for="age">Age:</label>
<input type="number" 
       placeholder="age" 
       min="0" 
       max="100"/>
```
- **Type**: number
- **Min**: 0 years
- **Max**: 100 years

### 5. City Selection
```html
<label class="input-labels" for="city">City:</label>
<select name="city" id="city">
    <option value="">--Please Choose a City--</option>
    <option value="bengaluru">Bengaluru</option>
    <option value="mysuru">Mysuru</option>
    <option value="hyderabad">Hyderabad</option>
    <option value="pune">Pune</option>
</select>
```
- **Type**: Dropdown select
- **Placeholder option**: Default selection instruction
- **Options**: 4 Indian cities

### 6. State (Datalist)
```html
<label class="input-labels" for="states">State:</label>
<input list="state" name="state">
<datalist id="state">
    <option value="karnataka">Karnataka</option>
    <option value="andhra">Andhra</option>
    <option value="telangana">Telangana</option>
    <option value="tamilnadu">Tamil Nadu</option>
</datalist>
```
- **Type**: Input with autocomplete
- **Features**: Dropdown suggestions as you type

### 7. Gender (Radio Buttons)
```html
<div role="radiogroup" aria-labelledby="group-label">
    <label class="input-labels" id="group-label">Gender:</label><br>
    
    <label id="male" for="male">Male</label>
    <input role="radio" 
           type="radio" 
           name="gender" 
           id="male" 
           value="male" 
           checked>
    
    <label id="female" for="female">Female</label>
    <input role="radio" 
           type="radio" 
           name="gender" 
           id="female" 
           value="female">
</div>
```
- **Type**: Radio buttons
- **Default**: Male selected
- **Accessibility**: role attributes for screen readers

### 8. Profile Picture
```html
<label class="input-labels" for="profile-pic">Profile Picture:</label>
<input type="file" 
       name="profile-pic" 
       id="profile-pic" 
       accept="image/*" 
       capture="environment" />
```
- **Type**: File upload
- **Accept**: Only image files
- **Capture**: Mobile camera option

### 9. Buttons
```html
<button type="submit">Send</button>
<button type="reset">Reset</button>
```
- **Submit**: Sends form data
- **Reset**: Clears all fields

## Input Types Reference

| Type | Purpose | Validation |
|------|---------|-----------|
| text | Short text | None |
| email | Email address | Email format |
| tel | Phone number | None (use pattern) |
| number | Numbers only | Min/max range |
| file | File upload | File type accept |
| radio | Single choice | None |
| checkbox | Multiple choices | None |
| date | Date picker | Date format |
| password | Hidden text | None |
| url | Web address | URL format |
| search | Search input | None |

## Form Attributes

### Label
```html
<label for="fieldId">Label Text:</label>
<input id="fieldId">
```
- **for attribute**: Links label to input
- **Improves accessibility**: Clickable label
- **SEO friendly**: Semantic structure

### Input Attributes

| Attribute | Purpose | Example |
|-----------|---------|---------|
| id | Unique identifier | id="email" |
| name | Form field name | name="email" |
| placeholder | Hint text | placeholder="name@example.com" |
| required | Must be filled | required |
| pattern | Validation regex | pattern="[0-9]{10}" |
| min/max | Range limits | min="0" max="100" |
| accept | File types | accept="image/*" |
| disabled | Cannot interact | disabled |
| readonly | Cannot edit | readonly |

## Fieldset and Legend

Groups related form fields:

```html
<fieldset>
    <legend>Contact Information</legend>
    <!-- Form fields inside -->
</fieldset>
```

**Benefits**:
- Visual grouping
- Screen reader context
- Styling control
- Semantic meaning

## CSS Styling

```css
* {
    font-size: medium;
    font-family: monospace;
}

body {
    background-color: aquamarine;
    color: darkblue;
}

.input-labels {
    font-family: 'Segoe UI', sans-serif;
    font-size: 700;
    color: black;
}

#contact-info {
    width: max-content;
    margin: 0 auto;  /* Center form */
}
```

## Form Organization

```
┌──────────────────────┐
│   Contact Form       │
├──────────────────────┤
│ Fieldset             │
│ ┌──────────────────┐ │
│ │ Legend: Contact  │ │
│ │ Information      │ │
│ └──────────────────┘ │
│                      │
│ Full Name: [____]    │
│ Email: [____]        │
│ Phone: [____]        │
│ Age: [____]          │
│ City: [Select]       │
│ State: [__Autocomplete] │
│ Gender: ◯ M ◯ F      │
│ Photo: [Upload]      │
│                      │
│ [Send]  [Reset]      │
└──────────────────────┘
```

## Form Validation

### HTML5 Validation
- **required** - Field must be filled
- **type="email"** - Validates email format
- **pattern** - RegEx validation
- **min/max** - Range validation
- **maxlength** - Character limit

### Browser Validation
```html
<input type="email" required>
<!-- Browser shows error if:
     - Field is empty
     - Not in email format
-->
```

## Accessibility Features

✓ Label associations (for attribute)
✓ ARIA roles (radiogroup)
✓ Semantic grouping (fieldset)
✓ Form instruction text
✓ Disabled field attributes
✓ Alt text could be added
✓ Logical tab order

## Best Practices Applied

1. **Semantic HTML** - Proper field labels
2. **Accessibility** - ARIA attributes
3. **Validation** - Built-in type validation
4. **Grouping** - Fieldset organization
5. **Instructions** - Helper text provided
6. **Styling** - CSS for visual hierarchy
7. **User Experience** - Clear inputs and buttons

## File Structure
```
app5/
├── index.html       # Contact form
├── style.css        # Form styling
└── .vscode/settings.json
```

## Learning Outcomes

After reviewing this app, you'll understand:
- Form creation and structure
- Various input types (text, email, tel, number, file)
- Select dropdowns
- Datalist autocomplete
- Radio buttons
- Form validation attributes
- Fieldset organization
- Label associations
- CSS form styling
- Form accessibility

## How to View

1. Open `index.html` in browser
2. Try different input fields
3. Test form validation
   - Leave required fields empty
   - Enter invalid email
   - Type wrong phone format
4. Click buttons:
   - Send: Would submit (action is empty)
   - Reset: Clears all fields
5. Inspect elements (F12)

## Practice Exercises

### Easy Modifications

1. **Change colors**
   ```css
   body {
       background-color: lightblue;
       color: navy;
   }
   ```

2. **Add more cities**
   ```html
   <option value="delhi">Delhi</option>
   <option value="mumbai">Mumbai</option>
   ```

3. **Add more form fields**
   - Address
   - Zip code
   - Comments

### Medium Challenges

4. **Create multiple fieldsets**
   - Personal Information
   - Contact Details
   - Preferences

5. **Add form validation**
   - JavaScript validation
   - Custom error messages
   - Success feedback

6. **Style improvements**
   - Better spacing
   - Input styling
   - Button effects

### Hard Challenges

7. **Make responsive**
   - Mobile-friendly layout
   - Flex or grid layout
   - Media queries

8. **Add functionality**
   - Form submission
   - Data validation
   - LocalStorage saving

## Form Best Practices

### Do's ✓
- Label every input
- Provide clear instructions
- Use appropriate input types
- Validate on both client and server
- Show success/error messages
- Make responsive

### Don'ts ✗
- Disable form fields without reason
- Use placeholder instead of label
- Spam validation errors
- Require unnecessary information
- Change expected input format
- Make form too long

## Testing the Form

### Validation Tests
1. Submit empty form - Should show errors
2. Enter invalid email - Should highlight
3. Enter 9-digit phone - Should reject (pattern: 10 digits)
4. Select gender option - Should work
5. Upload image - Should process

### Accessibility Tests
1. Tab through fields - Should follow logical order
2. Use screen reader - Should read labels
3. Skip to content - Should work
4. Use keyboard only - Should be functional

## Common Questions

**Q: Why use label instead of placeholder?**
A: Labels are always visible, placeholders disappear when typing.

**Q: How do I validate forms?**
A: Use HTML5 validation + JavaScript for complex logic.

**Q: Can I submit the form?**
A: Yes, add action attribute: `<form action="submit.php">`

**Q: How do I style input fields?**
A: Use CSS selectors: `input[type="text"]`, `input[type="email"]`

## Next Steps

1. **Add JavaScript validation** - Custom validation logic
2. **Style the form** - Professional design
3. **Make responsive** - Mobile friendly
4. **Add success message** - Form confirmation
5. **Implement backend** - Process submissions

## References

- MDN: [HTML Form Elements](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form)
- MDN: [Input Types](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input)
- CSS-Tricks: [Form Styling](https://css-tricks.com/styling-web-forms-basics/)

## Key Takeaways

✓ Forms collect user data
✓ Proper labels improve usability
✓ Input types provide built-in validation
✓ Fieldsets organize related fields
✓ Accessibility should be prioritized
✓ Styling enhances user experience

## Author
Vishwas K Singh

## License
MIT

---

**[← Back to Frontend Basics](../README.md)** | **[Previous: App4](../app4/README.md)** | **[Next: App6 →](../app6/README.md)**
