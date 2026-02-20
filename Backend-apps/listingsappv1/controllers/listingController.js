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
    
    },
    async createListing(req,res){
        const { name, price, location } = req.body;

        const listing = await ListingService.createNewListing({name,price,location});
        const listingDTO = new ListingDTO(listing);

        return res
                .status(201)
                .json(new ApiResponse(200, listingDTO, "Listings Created Successfully"))

    }
}

module.exports = listingController;