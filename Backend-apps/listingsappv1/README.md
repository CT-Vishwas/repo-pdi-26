# ListingsApp v1

Node.js + Express backend for real estate listings.

## Overview

This app provides REST API endpoints for listings and users, backed by MongoDB.
It now supports reading sensitive configuration from AWS Secrets Manager and is fully dockerized using `Dockerfile` and `docker-compose.yml`.

## Key features

- Express.js API (`app.js`)
- MongoDB connection using `process.env.MONGO_URI`
- API routes in `routes/` (listings, user)
- Middleware for error handling
- DB models in `models/` and DTOs
- Dockerized (Dockerfile + docker-compose)

## Environment configuration

### Local development (dotenv)

Copy `.env.example` (if exists) to `.env` and set:

```bash
MONGO_URI=mongodb://localhost:27017/homelistingsdb
PORT=3000
```

Then run:

```bash
npm install
node app.js
```

### AWS Secrets Manager (recommended for production)

This project is designed to consume `MONGO_URI` from an environment variable that can be populated by AWS Secrets Manager.

1. Store secret in AWS:

```bash
aws secretsmanager create-secret --name listingsappv1/mongo --secret-string '{"MONGO_URI":"mongodb://<user>:<pass>@<host>:27017/homelistingsdb"}'
```

2. Fetch secret and export environment variables before running:

```bash
export SECRETS=$(aws secretsmanager get-secret-value --secret-id listingsappv1/mongo --query SecretString --output text)
export MONGO_URI=$(echo "$SECRETS" | jq -r .MONGO_URI)
```

3. Run application:

```bash
node app.js
```

Alternatively, use a start wrapper script in a container entrypoint that resolves secrets dynamically (e.g., with `aws cli` or SDK) and sets `MONGO_URI`.

## Docker (desktop / local)

### Build & run (single container)

```bash
cd Backend-apps/listingsappv1
docker build -t listingsappv1 .
docker run -d --name listingsapp --env MONGO_URI="mongodb://host.docker.internal:27017/homelistingsdb" -p 5000:3000 listingsappv1
```

### Docker Compose (includes MongoDB)

```bash
cd Backend-apps/listingsappv1
docker compose up --build
```

The API will be available at [http://localhost:5000/api/v1](http://localhost:5000/api/v1).

## Notes:

- `Dockerfile` sets `ENV MONGO_URI` placeholder; ensure a value is injected at runtime.
- `docker-compose.yml` defines:
  - `mongo_db` (mongo:latest, port 27017)
  - `web-app` with `MONGO_URI=mongodb://mongo_db:27017/homelistingsdb`

## API Endpoints

- GET `/api/v1/listings` - list all listings
- GET `/api/v1/listings/:id` - get listing by ID
- POST `/api/v1/listings` - create new listing
- PUT `/api/v1/listings/:id` - update listing
- DELETE `/api/v1/listings/:id` - delete listing

(plus user routes under `/api/v1/user`)

## Docker cleanup

```bash
docker compose down -v
docker rm -f listingsapp mongo_db
```

## Testing & validation

- Ensure `mongo` service is running and accessible from app container
- Verify secret retrieval to `MONGO_URI` before connection attempt

## Additional improvement

- Add secret polling and refresh logic for long-lived processes
- Add Healthcheck endpoint and readiness probe
