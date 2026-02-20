const mongoose = require('mongoose');

const listingSchema = new mongoose.Schema({
    name:{
        type: String,
        required: [true, "Listing Name is Required"]
    },
    location:{
        type: String,
        required: [true,"Location missing for Listing"]
    },
    price:{
        type: Number,
        required: [true,"Price missing for Listing"]
    }
});

module.exports = mongoose.model('Listing', listingSchema);