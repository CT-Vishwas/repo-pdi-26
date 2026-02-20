const ListingDTO = require('../dtos/listingDTO');
const ListingService = require('../services/listingService');
const ApiError = require('../utils/ApiError');
const ApiResponse  = require('../utils/ApiResponse');

const listingController = {
    async getListings(req, res) {
    
        const listings = await ListingService.getAllListings();
        const listingsDTOs = listings.map(listing => new ListingDTO(listing));
        return res
                .status(200)
                .json(new ApiResponse(200, listingsDTOs, "Listings Fetched Successfully"));
    
    },
    async createListing(req,res, next){
        const { name, price, location } = req.body;

        try{
            if (!name){
            throw new ApiError(400, "Required field name");
        }

        const listing = await ListingService.createNewListing({name,price,location});
        const listingDTO = new ListingDTO(listing);

        return res
                .status(201)
                .json(new ApiResponse(200, listingDTO, "Listings Created Successfully"))
        } catch(error){
            next(error);
        }
    },

    async getSingleListing(req,res,next){
        try{
            const { id } = req.params;        
            const listing = await ListingService.getListing(id);
            const listingDTO = new ListingDTO(listing);

            if(!listing){
                throw new ApiError(404, "Listing Not Found");
            }

            return new ApiResponse(200, listingDTO, "Listing fetched Successfully");

        } catch(error){
            next(error);
        }
    },
     async searchListings(req,res,next){
        try{
            const { name, price, location } = req.query;        
            const listings = await ListingService.searchListings({name, price, location});
            const listingDTO = new ListingDTO(listing);

            if(!listing){
                throw new ApiError(404, "Listing Not Found");
            }

            return new ApiResponse(200, listingDTO, "Listing fetched Successfully");

        } catch(error){
            next(error);
        }
    }
}

module.exports = listingController;