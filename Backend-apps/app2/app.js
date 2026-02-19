// Exploring os module
// const os = require('os');

// console.log('Operating System: ', os.platform());
// console.log('Hostname: ', os.hostname());
// console.log('Home Directory: ', os.homedir());
// console.log('Number of CPUs: ', os.cpus().length);
// console.log('Free Memory: ', os.freemem() / (1024*1024) + ' MB');

// File Organizer
const fs = require('fs').promises;
const path = require('path');

async function organizeFolder(folderName) {
    try {
        const targetDir = path.join(__dirname, folderName);

        const files = await fs.readdir(targetDir);
        for (const file of files){
            const oldPath = path.join(targetDir, file);
            const stats = await fs.lstat(oldPath);

            console.log('old path status', file,stats);
            if (stats.isDirectory()){
                console.log(`${file} is a Directory`);
                continue;
            }

            const ext = path.extname(file).slice(1) || 'others';
            const categoryDir = path.join(targetDir, ext);

            await fs.mkdir(categoryDir, {recursive: true});

            const newPath = path.join(categoryDir, file);
            await fs.rename(oldPath, newPath);

            console.log(`Successfully organized: ${file}`);
        }

        console.log('Done, organizing the files');
    } catch (error) {
        console.error('Error organizing files: ', error.message);
    }
    
}


organizeFolder('my_downloads');