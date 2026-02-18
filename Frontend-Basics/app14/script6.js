const products = [
    {id: 1, name: "T-Shirt", category:"Clothing"},
    {id: 2, name: "Laptop", category:"electronics"},
    {id: 3, name: "CoFFee Mug", category:"Kitchen"},
    {id: 4, name: "Headphones", category:"electronics"}
];

function printProductDetails(product){
    console.log("Product Details: ", product);
}


async function fetchProduct(productId){
    return await new Promise((resolve, reject) =>{
        setTimeout(()=>{
            const product = products.find(p => p.id === productId);
            resolve(product);
            // reject('Network Error')
        }, 4000)
    })
}

// calling part
fetchProduct(2)
   .then((product)=> printProductDetails(product))
   .catch((error)=> console.log("Error Fetching product due to: ", error));