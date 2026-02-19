const express = require('express');
const router = express.Router();

// In memory database
let listings = [
    {id:1, name:"Blore Apts", location:"Bengaluru"},
    {id:2, name:"Sattva", location:"Hyderabad"},
    {id:3, name:"Prestige Apt", location:"Bengaluru"},
    {id:4, name:"skylines", location:"Mumbai"}
];



router.get('/', (req, res)=>{
    res.json(listings);
});

// app.post('/api/v1/listings', (req, res)=>{
//     res.send('Hello, World Express');
// });

// app.get('/', (req, res)=>{
//     res.send('Hello, World Express');
// });

// app.get('/', (req, res)=>{
//     res.send('Hello, World Express');
// });

module.exports = router;