# Kirana App Frontend (Next.js)

A Next.js-based frontend for the Kirana Store inventory system. This project demonstrates a simple inventory dashboard with search, pagination, and table rendering of product data from an API.

## Features

- Next.js App Router
- Client-side data fetching using Axios
- Search input and pagination controls
- `ProductTable` component for tabular display
- Auth token interceptor support

## Folder Structure

- `app/` - main Next.js app directory
  - `page.js` - landing page
  - `products/page.jsx` - Product inventory UI
  - `lib/api.js` - Axios instance and auth interceptor
- `components/ProductTable.jsx` - table rendering component
- `context/AuthContext.js` - auth token context provider
- `services/auth-service.js` - auth utilities

## Prerequisites

- Node.js 18+
- npm / yarn / pnpm

## Setup & Run

```bash
cd Fronten-apps/kiranaappfrontend
npm install
npm run dev
```

Visit `http://localhost:3000`

## Environment

- `API_URL`: base URL for backend API (set in `.env.local`)

## Notes

- This app expects backend endpoints like `/products?pageNumber=...&searchTerm=...`.
- Update `api.js` for any authorization or base URL adjustments.
