const express = require('express');
const dotenv = require('dotenv');
const connectDB = require('./db/db');
const routes = require('./routes');
const ApiError = require('./utils/ApiError');
const errorHandler = require('./middlewares/error.middleware');
const app = express();
const PORT = 3000;

// Load environment variables from .env file
dotenv.config();

//connect to mongoDB
connectDB();


app.use(express.json());
// app.use('/api/v1/listings', listingRouter);
app.use(routes);

app.use((req,res,next)=>{
    const error = new ApiError(404, "Route Not Found");
    next(error);
});

app.use(errorHandler);


app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})