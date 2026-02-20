const express = require('express');
const router = express.Router();
const listingRoutes = require('./listings');


// Listing Routes
router.route('/listings', listingRoutes);