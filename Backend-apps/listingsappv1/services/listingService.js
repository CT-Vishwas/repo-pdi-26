const Listing = require('../models/listings');


const listingService = {
    async getAllListings() {
        const listings = Listing.find();
        return listings;    
    }
}

module.exports = listingService;