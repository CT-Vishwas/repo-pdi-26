const mongoose = require('mongoose');

const listingSchema = new mongoose.Schema({
    name:{
        type: String,
        required: [true, "Listing Name is Required"]
    },
    city:{
        type: String
    },
    state:{
        type: String
    },
    photo:{
        type: String
    },
    availableUnits:{
        type: Number
    },
    wifi:{
        type: Boolean
    },
    laundry:{
        type: Boolean
    }
    // location:{
    //     type: String,
    //     required: [true,"Location missing for Listing"]
    // },
    // price:{
    //     type: Number,
    //     required: [true,"Price missing for Listing"]
    // }

});

module.exports = mongoose.model('Listing', listingSchema);