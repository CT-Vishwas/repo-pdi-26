const express = require('express');
const dotenv = require('dotenv');
const connectDB = require('./db/db');
const routes = require('./routes');
const app = express();
const PORT = 3000;

// Load environment variables from .env file
dotenv.config();

//connect to mongoDB
connectDB();


app.use(express.json());
// app.use('/api/v1/listings', listingRouter);
app.use(routes);


app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})