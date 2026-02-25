const express = require('express');
const dotenv = require('dotenv');
const cors = require('cors');
const connectDB = require('./db/db');
const routes = require('./routes');
const ApiError = require('./utils/ApiError');
const errorHandler = require('./middlewares/error.middleware');
const app = express();
const PORT = 5000;

// Load environment variables from .env file
dotenv.config();

//connect to mongoDB
connectDB();

app.use(cors());
app.use(express.json());
// app.use('/api/v1/listings', listingRouter);
app.use('/api/v1',routes);

app.use((req,res,next)=>{
    const error = new ApiError(404, "Route Not Found");
    next(error);
});

app.use(errorHandler);


app.listen(PORT, ()=>{
    console.log(`Listening on ${PORT}....`);
    
})