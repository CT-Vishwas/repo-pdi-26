const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res)=>{
    res.send('Hello, World Express');
});
app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})