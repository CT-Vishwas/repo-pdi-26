import ListingCard from "../components/listings/ListingCard";

let listings = [
  { id: 1, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/house1.jpg"},
  { id: 2, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/house1.jpg"},
  { id: 3, name: "vks apt", price: 25000, location:"Bengaluru"},
  { id: 4, name: "vks apt", price: 25000, location:"Bengaluru"}
];

export default function HomePage(){
    return(
        <div  className="grid grid-cols-3 grid-rows-none gap-4">
          {listings.map((listing)=>
            (
            <ListingCard  key={listing.id}
              listing={listing}
            />
           )
          )}
        </div>
    )
}