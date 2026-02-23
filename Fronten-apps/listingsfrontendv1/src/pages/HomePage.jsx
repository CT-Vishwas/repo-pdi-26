import { useEffect, useState } from "react";
import ListingCard from "../components/listings/ListingCard";
// import listings from "../services/api/data";
import listingService from "../services/api/ListingsService";

export default function HomePage(){
  const [listings, setListings] = useState([]);

  useEffect(() =>{
    listingService.getAllListings()
      .then((data) =>{
        setListings(data);
      })
      .catch((error)=>{
        console.error("Error Fetching Listings", error);
      })
  })

    return(
        <div  className="grid grid-cols-3 grid-rows-none gap-4 p-5">
          {listings.map((listing)=>
            <ListingCard  key={listing.id}
              listing={listing}
            />
          )}
        </div>
    )
}