import { useState } from "react";
import ListingModal from "./ListingModal";
function ListingCard({ listing }) {
    const [ showModal, setShowModal ] = useState(false);

  const handleShow = () => setShowModal(true);
  return (
    <>
      <div className="card bg-base-100 w-96 shadow-sm">
        <figure className="cursor-pointer">
          <img
            src={listing.image ? listing.image : "images/house.jpg"}
            alt="listing image"
            onClick={handleShow}
          />
        </figure>
        <div className="card-body">
          <h2 className="card-title">{listing.name}</h2>
          <p>
            A card component has a figure, a body part, and inside body there
            are title and actions parts
          </p>
          <div className="card-actions justify-end">
            <button className="btn btn-primary">Buy Now</button>
          </div>
        </div>
      </div>
      <ListingModal key={listing.id} listing={listing} showModal = {showModal}/>
    </>
  );
}

export default ListingCard;
