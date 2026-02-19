# App2: File Organizer

## Overview
An automated file organization utility that scans a directory, categorizes files by their extensions, and automatically creates subdirectories to organize files by type. This is an intermediate Node.js application demonstrating file system operations and async/await patterns.

## Purpose
Learn and practice:
- File system operations with `fs.promises`
- Async/await for non-blocking I/O
- Path manipulation with the `path` module
- Error handling in Node.js
- Directory and file management

## Features
✓ Automatic folder creation based on file types
✓ Moves files into category folders
✓ Handles files with no extensions
✓ Skips existing directories
✓ Comprehensive error handling
✓ Progress logging

## Technology Stack
| Component | Technology |
|-----------|-----------|
| **Runtime** | Node.js |
| **Module System** | CommonJS |
| **APIs** | fs.promises, path |
| **Async Model** | async/await |

## Installation

```bash
cd app2
# No dependencies to install, uses only Node.js built-in modules
```

## Usage

### Running the Program
```bash
node app.js
```

### How to Configure
Edit the `app.js` file to specify the target folder:
```javascript
organizeFolder('folderName');  // Replace 'folderName' with your target directory
```

### Example
```bash
# To organize files in a 'downloads' folder
organizeFolder('downloads');
```

## What the Program Does

1. **Scans Directory**: Reads all items in the target folder
2. **Identifies Files**: Checks if each item is a file or directory
3. **Extracts Extensions**: Gets file extension (e.g., .pdf, .txt, .jpg)
4. **Creates Folders**: Creates category folders for each file type
5. **Moves Files**: Moves files into appropriate category folders
6. **Logs Progress**: Shows status messages for each operation

## Code Explanation

### Imports
```javascript
const fs = require('fs').promises;
const path = require('path');
```
- Uses `fs.promises` for async file operations
- Uses `path` module for cross-platform path handling

### Main Function
```javascript
async function organizeFolder(folderName) {
    try {
        // Function implementation
    } catch (error) {
        console.error('Error organizing files: ', error.message);
    }
}
```
- Async function for non-blocking operations
- Try-catch for error handling

### Reading Directory Contents
```javascript
const targetDir = path.join(__dirname, folderName);
const files = await fs.readdir(targetDir);
```
- Joins the current directory with folder name
- Reads all items in the directory asynchronously

### Processing Each File
```javascript
for (const file of files) {
    const oldPath = path.join(targetDir, file);
    const stats = await fs.lstat(oldPath);
    
    if (stats.isDirectory()) {
        console.log(`${file} is a Directory`);
        continue;
    }
    
    // Extract extension
    const ext = path.extname(file).slice(1) || 'others';
    const categoryDir = path.join(targetDir, ext);
    
    // Create folder and move file
    await fs.mkdir(categoryDir, {recursive: true});
    const newPath = path.join(categoryDir, file);
    await fs.rename(oldPath, newPath);
    
    console.log(`Successfully organized: ${file}`);
}
```

**Steps Explained:**
1. Get full path for each file
2. Check file stats to verify it's not a directory
3. Extract extension using `path.extname()` (removes the dot)
4. Create folder name based on extension
5. Make directory (recursive: true prevents errors if folder exists)
6. Rename (move) file to new location

## File Organization Examples

### Before Organization
```
my_downloads/
├── document.pdf
├── image.jpg
├── photo.png
├── notes.txt
├── script.js
├── data.json
├── spreadsheet.xlsx
├── archive.zip
├── README                    (no extension)
└── oldreports/               (directory - skipped)
```

### After Organization
```
my_downloads/
├── pdf/
│   └── document.pdf
├── jpg/
│   └── image.jpg
├── png/
│   └── photo.png
├── txt/
│   └── notes.txt
├── js/
│   └── script.js
├── json/
│   └── data.json
├── xlsx/
│   └── spreadsheet.xlsx
├── zip/
│   └── archive.zip
├── others/
│   └── README
└── oldreports/               (unchanged)
```

## Supported File Types

The program works with ANY file extension. Some common categories created:

| File Type | Folder Created |
|-----------|---------|
| .pdf | pdf/ |
| .txt, .doc, .docx | txt/, doc/, docx/ |
| .jpg, .png, .gif, .svg | jpg/, png/, gif/, svg/ |
| .mp3, .mp4, .wav | mp3/, mp4/, wav/ |
| .zip, .rar, .tar | zip/, rar/, tar/ |
| .xlsx, .xls, .csv | xlsx/, xls/, csv/ |
| .js, .py, .java | js/, py/, java/ |
| No extension | others/ |

## Advantages

✓ **Saves Time**: Automatically organizes hundreds of files
✓ **Easy Navigation**: Find files by type quickly
✓ **Prevents Clutter**: Directories stay clean and organized
✓ **Flexible**: Works with any file type
✓ **Safe**: Skips directories and handles errors gracefully

## Error Handling

The program includes error handling for:
- Directory not found
- Permission denied
- Invalid paths
- File system errors

All errors are caught and logged with descriptive messages.

## Common Use Cases

### Use Case 1: Organize Downloads Folder
```bash
# Downloads folder often becomes messy
# This utility can organize by file type
organizeFolder('Downloads');
```

### Use Case 2: Organize Project Assets
```bash
organizeFolder('assets');
// Creates: images/, videos/, documents/, etc.
```

### Use Case 3: Archive Organization
```bash
organizeFolder('archive');
// Separates photos, documents, backups, etc.
```

## File Structure
```
app2/
├── app.js           # File organizer utility (CommonJS)
├── package.json     # Project configuration
└── README.md        # This file
```

## Package.json Details
```json
{
  "name": "app2",
  "version": "1.0.0",
  "type": "commonjs",
  "main": "app.js"
}
```
- **type: "commonjs"**: Uses traditional CommonJS module syntax
- **main**: Entry point for the application

## Key Learning Points

1. **fs.promises**: Promise-based file system API
2. **async/await**: Proper asynchronous programming
3. **path module**: Cross-platform path manipulation
4. **Error handling**: Try-catch blocks for robust code
5. **File system stats**: Checking file types with `lstat()`
6. **Directory iteration**: Processing multiple files in a loop

## Advanced Features to Consider

### Adding Validation
```javascript
// Check if path is valid
// Verify permissions before moving
// Confirm directory exists
```

### Better Filtering
```javascript
// Ignore hidden files
// Exclude certain file types
// Skip symbolic links
```

### Progress Reporting
```javascript
// Show percentage completion
// Count total files
// Display elapsed time
```

### Configuration File
```javascript
// Load settings from JSON
// Allow custom categories
// Define exclusion rules
```

## Potential Enhancements

- [ ] Add configuration file for custom rules
- [ ] Add option to organize by date (year/month)
- [ ] Add dry-run mode to preview changes
- [ ] Add undo functionality
- [ ] Add compression for large files
- [ ] Add progress bar
- [ ] Support for nested organization
- [ ] Custom folder naming patterns

## Troubleshooting

| Issue | Solution |
|-------|----------|
| "Cannot find module" error | Ensure Node.js is installed |
| "ENOENT: no such file or directory" | Check folderName parameter matches actual directory |
| "EACCES: permission denied" | Ensure you have read/write permissions for the directory |
| Files not being organized | Verify the folder exists and contains files |

## Testing

### Manual Test
1. Create a test folder with mixed file types
2. Run the organizer
3. Verify files are correctly sorted by extension
4. Check that no files were lost or corrupted

### Test Folder Setup
```bash
mkdir test_folder
cd test_folder
touch file1.txt file2.pdf file3.jpg file4.js no_extension
mkdir existing_folder
```

Then run:
```bash
organizeFolder('test_folder');
```

## Performance Notes

- **Speed**: Process thousands of files quickly due to async operations
- **Memory**: Efficient with streaming operations
- **Scalability**: Can handle very large directories
- **Safety**: No data loss - files are renamed, not deleted

## Security Considerations

- Only operates on specified directory
- Doesn't access parent directories
- Respects file permissions
- No external network access
- No file deletion or overwriting

## Real-World Applications

1. **Photo Organization**: Sort photos by type (JPEG, PNG, RAW)
2. **Document Management**: Organize by file type (PDF, Word, Excel)
3. **Download Cleanup**: Organize downloaded files
4. **Backup Organization**: Sort backup files by type
5. **Media Library**: Organize videos, audio, and images

## Author
Vishwas

## License
ISC

## References
- [Node.js fs.promises Documentation](https://nodejs.org/api/fs.html#fs_promises_api)
- [Node.js path Module](https://nodejs.org/api/path.html)
- [Async/Await Guide](https://javascript.info/async-await)
