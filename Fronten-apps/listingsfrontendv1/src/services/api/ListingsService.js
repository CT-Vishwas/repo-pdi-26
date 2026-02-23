
const URL = "http://localhost:3000/api/v1/listings"
const listingService = {
    async getAllListings() {
        const res = await fetch(URL,{
            method: 'GET'
        })
        const responseJson = await res.json();
        const { data } = responseJson.data;

        return data? data: [];
    }
}

export default listingService;