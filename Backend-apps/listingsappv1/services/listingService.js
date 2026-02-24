const Listing = require('../models/listings');
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
        console.log(typeof listingId, listingId.length);  
        // const listing = await Listing.findById(listingId).lean().exec();
        // const listing = await Listing.findById("67dd2fe421036760a26e0818").lean().exec();
        const listing = await Listing.findById(listingId);
        
        
        // const listing = await Listing.findOne({ _id: listingId}).lean();
        return listing;
    }
}

module.exports = listingService;