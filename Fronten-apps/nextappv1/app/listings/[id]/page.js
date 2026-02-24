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
            <header className="mb-6">
                <button className="btn btn-ghost btn-sm mb-4">
                    Back
                </button>
                <h1 className="text-3xl font-bold text-base-content">{listing.name}</h1>
            </header>

            <div className="grid grid-cols-1 lg:grid-cols-2 gap-8">

                <div className="card bg-base-100 border border-base-200 shadow-sm p-6">
                    <div className="mb-4">
                        <p className="text-gray-500">{listing.city},{listing.state}</p>
                    </div>

                    <section className="mb-8">
                        <h3 className="font-bold text-lg mb-4">Amenities</h3>
                        <div className="flex flex-wrap gap-2">
                            <div className="badge badge-secondary badge-outline py-3 px-4"></div>
                            <div className="badge badge-secondary badge-outline py-3 px-4"></div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    )
}
