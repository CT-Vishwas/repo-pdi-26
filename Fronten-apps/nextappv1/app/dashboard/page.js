import Link from 'next/link';
import React from 'react';

async function getAllListings() {
    const res = await fetch("http://localhost:5000/api/v1/listings", {
        method: 'GET'
    });
    console.log("ResponseData", res);
    const responseJson = await res.json();

    const { data } = responseJson;

    return data ? data : [];
}


export default async function Page() {
    const listings = await getAllListings();

    return (
        <div className="overflow-x-auto">
            <table className="table table-zebra">
                {/* head */}
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Title</th>
                        <th>City</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {listings.map((listing) => (
                        <tr key={listing.id}>
                            <td>{listing.id}</td>
                            <td>{listing.name}</td>
                            <td>{listing.city}</td>
                            <td><Link href={`/listings/${listing.id}`} className='btn btn-sm btn-primary'>Details</Link></td>
                        </tr>
                    ))

                    }
                </tbody>
            </table>
        </div>
    );
}