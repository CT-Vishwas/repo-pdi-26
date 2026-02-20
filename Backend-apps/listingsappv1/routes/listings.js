const express = require('express');
const router = express.Router();
// const Listing = require('../models/listings');
const listingController = require('../controllers/listingController');


router.get('/', listingController.getListings);
router.post('/', listingController.createListing);
router.put('/', listingController.updateListing);
router.delete('/', listingController.deleteListing);
router.get('/search', listingController.searchListing);
router.get('/:listingId', listingController.getSingleListing);




// In memory database
// let listings = [
//     {id:1, name:"Blore Apts", location:"Bengaluru"},
//     {id:2, name:"Sattva", location:"Hyderabad"},
//     {id:3, name:"Prestige Apt", location:"Bengaluru"},
//     {id:4, name:"skylines", location:"Mumbai"}
// ];



// router.get('/', async (req, res)=>{
//     // let listings = await Listing.find();
//     res.send(listings);
// });

router.get('/', async (req, res)=>{
    let listings = await Listing.find();
    res.send(listings);
});

router.post('/', async (req, res)=>{
    console.log(req.body);
    const { name, price, location } = req.body;
    if(!name){
        return res.send({ error: 'name is required'})
    }

    const listing = await Listing.create({name,price,location});
    res.send(listing);
});

router.get('/search', (req,res)=>{
    const { location } = req.query;
    console.log('Location in Request: ', location);
    
    let listing = listings.find(l => l.location.toLowerCase() == location.toLowerCase());
    res.send(listing);
});

router.get('/:listingId', (req,res)=>{
    const {listingId} = req.params;
    let listing = listings.find(l => l.id === parseInt(listingId));
    res.send(listing);
});





// app.get('/', (req, res)=>{
//     res.send('Hello, World Express');
// });

// app.get('/', (req, res)=>{
//     res.send('Hello, World Express');
// });

module.exports = router;