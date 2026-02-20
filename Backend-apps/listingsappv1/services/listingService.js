const Listing = require('../models/listings');
const mongoose = require('mongoose');


const listingService = {
    async getAllListings() {
        const listings = Listing.find();
        return listings;    
    },

    async createNewListing(listingData){
        const listing = await Listing.create(listingData);
        return listing;
    },

    async getListing(listingId){        
        const listing = await Listing.findById(listingId).lean().exec();
        // const listing = await Listing.findOne({ _id: listingId}).lean();
        return listing;
    }
}

module.exports = listingService;