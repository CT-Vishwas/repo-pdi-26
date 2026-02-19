const express = require('express');
const app = express();
const path = require('path');
const PORT = 3000;

app.use('/static',express.static(path.join(__dirname,'public')));

app.get('/download/resume',(req,res)=>{
    const manualPath = path.join(__dirname,'public', 'docs', 'resume_vks.pdf');
    res.sendFile(manualPath);
});

app.get('/', (req, res)=>{
    res.send('Hello, World Express');
});
app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})