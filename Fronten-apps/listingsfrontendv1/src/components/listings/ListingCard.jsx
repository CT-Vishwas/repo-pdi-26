function ListingCard({ listing }) {
    return ( 
        <div className="card bg-base-100 w-96 shadow-sm">
  <figure>
    <img
      src={listing.image? listing.image : "images/house.jpg"}
      alt="listing image" />
  </figure>
  <div className="card-body">
    <h2 className="card-title">{listing.name}</h2>
    <p>A card component has a figure, a body part, and inside body there are title and actions parts</p>
    <div className="card-actions justify-end">
      <button className="btn btn-primary">Buy Now</button>
    </div>
  </div>
</div>
     );
}

export default ListingCard;