const express = require('express');
const router = express.Router();
const listingController = require('../controllers/listingController');

// Listing Routes
router.route('/api/v1/listings').get(listingController.getListings);
// router.post('/', listingController.createListing);
// router.put('/', listingController.updateListing);
// router.delete('/', listingController.deleteListing);
// router.get('/search', listingController.searchListing);
// router.get('/:listingId', listingController.getSingleListing);

module.exports = router;