import { useEffect, useRef } from "react";

function ListingModal({ listing, showModal }) {
  const modalRef = useRef(listing);

  useEffect(()=>{
    if(showModal){
      modalRef.current?.showModal();
    } else {
      modalRef.current?.close();
    }
  },[showModal]);
  return (
    <>
      <dialog ref={modalRef} className="modal">
        <div className="modal-box">
          <figure className="w-full">
            <img 
            src={listing.image? listing.image: "images/house.jpg"}
            alt={listing?.name}
            className="w-full h-auto object-cover max-h-[70vh]"
            ></img>
          </figure>
        </div>
        <form method="dialog" className="modal-backdrop">
          <button>close</button>
        </form>
      </dialog>
    </>
  );
}

export default ListingModal;
