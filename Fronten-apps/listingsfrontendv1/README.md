# Listings Frontend v1 (React + Vite)

A React + Vite application for displaying real estate / product listings. Uses REST fetch to a local API and renders cards.

## Features

- Vite + React, client-side only
- Fetch listings from `http://localhost:3000/api/v1/listings`
- Listings card UI (grid display)
- Route-based page navigation (Home, About)
- Simple layout wrapper

## Folder Structure

- `src/App.jsx` - main app container
- `src/routes/AppRoutes.jsx` - React Router config
- `src/pages/HomePage.jsx` - fetch & display listings
- `src/pages/AboutPage.jsx` - about page
- `src/components/layout/Layout.jsx` - app chrome
- `src/components/listings/ListingCard.jsx` - card UI component
- `src/services/api/ListingsService.js` - API data service

## Prerequisites

- Node.js 18+
- npm / yarn / pnpm

## Setup & Run

```bash
cd Fronten-apps/listingsfrontendv1
npm install
npm run dev
```

Open app at the port shown in terminal (usually `http://localhost:5173`).

## Notes

- Requires backend endpoint `GET /api/v1/listings` returning JSON `{ data: [...] }`.
- You can substitute any listings API by editing `src/services/api/ListingsService.js`.
