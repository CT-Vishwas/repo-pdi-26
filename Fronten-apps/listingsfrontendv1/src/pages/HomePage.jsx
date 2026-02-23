import ListingCard from "../components/listings/ListingCard";
import listings from "../services/api/data";

export default function HomePage(){
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