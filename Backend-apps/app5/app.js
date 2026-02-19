const express = require('express');
const app = express();
const PORT = 3000;

const listingRouter = require('./routes/listings');

app.use('/api/v1/listings', listingRouter);
app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})