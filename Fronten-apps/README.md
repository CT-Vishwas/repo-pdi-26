# Fronten-apps (JavaScript/TypeScript UI Projects)

This folder contains multiple JavaScript frontend projects demonstrating Next.js and React with Vite.

## Projects

- `kiranaappfrontend/` - Next.js app for product inventory with search/pagination and API integration
- `listingsfrontendv1/` - React + Vite app for displaying listings from a REST API
- `nextappv1/` - Next.js App Router starter with dynamic route demonstrations

## Quick Start

Choose the project folder and run:

```bash
npm install
npm run dev
```

## Common requirements

- Node.js 18+
- npm / yarn / pnpm

## Backend expectations

- `kiranaappfrontend` expects an API returning paged product data (`/products`).
- `listingsfrontendv1` expects `/api/v1/listings` returning `{ data: [...] }`.

## Maintainability notes

- Each project has its own `README.md` with commands and feature sets.
- Use `.env.local` or environment-specific config for API URLs and auth tokens.
