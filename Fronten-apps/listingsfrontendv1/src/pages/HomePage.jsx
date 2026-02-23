import ListingCard from "../components/listings/ListingCard";

let listings = [
  { id: 1, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/ouse.jpg"},
  { id: 2, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/ouse.jpg"},
  { id: 3, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/ouse.jpg"},
  { id: 4, name: "vks apt", price: 25000, location:"Bengaluru", image:"public/images/ouse.jpg"}
];

export default function HomePage(){
    return(
        <div  className="grid grid-cols-3 grid-rows-none gap-4">
          <h2>Listings</h2>
          {listings.map((listing)=>
            <ListingCard 
              listing={listing}
            />
          )}
        </div>
    )
}