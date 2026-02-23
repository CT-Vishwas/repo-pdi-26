const listings = require('../models/listings');

class ListingDTO{
    constructor(listings){
        this.id = listings._id;
        this.name = listings.name;
        this.city = listings.city;
        this.state = listings.state;
        this.image = listings.photo;
        this.availableUnits = listings.availableUnits;
        this.wifi = listings.wifi;
        this.laundry = listings.laundry;
        // this.price = listings.price;
        // this.location = listings.location;
    }
}

module.exports = ListingDTO;