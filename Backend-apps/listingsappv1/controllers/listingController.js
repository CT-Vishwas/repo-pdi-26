const ListingDTO = require('../dtos/listingDTO');
const ListingService = require('../services/listingService');
const ApiResponse  = require('../utils/ApiResponse');

const listingController = {
    async getListings(req, res) {
    
        const listings = await ListingService.getAllListings();
        const listingsDTOs = listings.map(listing => new ListingDTO(listing));
        return res
                .status(200)
                .json(new ApiResponse(200, listingsDTOs, "Listings Fetched Successfully"));
    
    }
}

module.exports = listingController;