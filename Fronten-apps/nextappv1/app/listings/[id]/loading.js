export default async function Loading({params}) {
    return (
        <div className="max-w-6xl mx-auto p-4 bg-base-100 min-h-screen">
            <header className="mb-6">
                <button className="btn btn-ghost btn-sm mb-4">
                    Back
                </button>
                <h1 className="text-3xl font-bold text-base-content"></h1>
            </header>

            <div className="grid grid-cols-1 lg:grid-cols-2 gap-8">

                <div className="card bg-base-100 border border-base-200 shadow-sm p-6">
                    <div className="mb-4">
                        <p className="text-gray-500"></p>
                    </div>

                    <section className="mb-8">
                        <h3 className="font-bold text-lg mb-4">Amenities</h3>
                        <div className="flex flex-wrap gap-2">
                            <div className="badge badge-secondary badge-outline py-3 px-4"></div>
                            <div className="badge badge-secondary badge-outline py-3 px-4"></div>
                        </div>
                    </section>
                </div>

                <div className="flex flex-col">
                    <div className="rounded-xl overflow-hidden shadow-lg border border-base-200">
                        <div className="bg-base-100 p-4 text-center border-t border-base-200">
                            <p className="text-xs text-gray-400 italic"></p>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    )
}
