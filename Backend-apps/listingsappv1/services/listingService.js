const Listing = require('../models/listings');


const listingService = {
    async getAllListings() {
        const listings = Listing.find();
        return listings;    
    },

    async createNewListing(listingData){
        const listing = await Listing.create(listingData);
        return listing;
    }
}

module.exports = listingService;