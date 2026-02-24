'use client';
import Image from "next/image";
import { useEffect, useState } from "react";
import { useParams, useRouter } from "next/navigation";
import Link from "next/link";

// async function getSingleListing(listingId) {
//     const res = await fetch(`http://localhost:3000/api/v1/listings/${listingId}`, {
//         method: 'GET'
//     });
//     const responseJson = await res.json();

//     const { data } = responseJson;

//     return data ? data : null;
// }

export default function Page({ params }) {
    const { id } = useParams();
    const router = useRouter();

    const [listing, setListing] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(false);

    useEffect(() => {
        // Client-side fetch
        const fetchDetails = async () => {
            try {
                const res = await fetch(`http://localhost:3000/api/v1/listings/${id}`);
                if (!res.ok) throw new Error('Not found');
                const data = await res.json();
                setListing(data.data);
            } catch (err) {
                setError(true);
            } finally {
                setLoading(false);
            }
        };

        if (id) fetchDetails();
    }, [id]);

    if (loading) return (
        <div className="flex justify-center items-center min-h-screen">
            <span className="loading loading-spinner loading-lg text-primary"></span>
        </div>
    );

    if (error) return (
        <div className="alert alert-error max-w-md mx-auto mt-10">
            <span>Error loading listing details.</span>
            <button onClick={() => router.push('/dashboard')} className="btn btn-sm">Back</button>
        </div>
    );

    return (
        <div className="max-w-6xl mx-auto p-4 bg-base-100 min-h-screen">


            <div className="grid grid-cols-2 lg:grid-cols-2 gap-8">
                <div className="card bg-base-100 border border-base-200 shadow-sm p-6">
                    <header className="mb-6">
                        <button onClick={() => router.push('/dashboard')} className="btn btn-ghost btn-sm mb-4">
                            Back
                        </button>
                        <h1 className="text-3xl font-bold text-base-content">{listing.name}</h1>
                    </header>
                    <div className="mb-4">
                        <p className="text-gray-500"><strong>Location</strong>: &nbsp;{listing.city},&nbsp;{listing.state}</p>
                    </div>
                    <div className="mb-4">
                        {listing.availableUnits && listing.availableUnits > 0?
                        <p className="badge badge-success py-3 px-4"><strong>Available units</strong> : {listing.availableUnits}</p>
                        :
                        <p className="badge badge-neutral py-3 px-4"><strong>Not Avaliable</strong></p>
                        }
                    </div>
                    <section className="mb-8">
                        <h3 className="font-bold text-lg mb-4">Amenities</h3>
                        <div className="grid grid-cols-10 gap-4">
                            {listing.wifi ?
                                <div className="badge badge-secondary badge-outline py-3 px-4">Wifi</div>
                                : ""
                            }

                            {listing.laundry ?
                                <div className="badge badge-secondary badge-outline py-3 px-4">Laundry</div>
                                : ""
                            }
                        </div>
                    </section>
                </div>
                <div className="flex flex-col">
                    <div className="rounded-xl overflow-hidden shadow-lg border border-base-200">
                        <div className="bg-base-100 p-4 text-center border-t border-base-200">
                            <p className="text-xs text-gray-400 italic">
                                <Image src={listing.image} alt={listing.name}
                                    width={400}
                                    height={400}
                                />
                            </p>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    )
}
