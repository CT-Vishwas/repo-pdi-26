const listings = require('../models/listings');

class ListingDTO{
    constructor(listings){
        this.id = listings._id;
        this.name = listings.name;
        this.city = listings.city;
        this.state = listings.state;
        // this.price = listings.price;
        // this.location = listings.location;
    }
}

module.exports = ListingDTO;