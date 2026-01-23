# Hardware Order Management System

A full-stack application for managing hardware products and orders. Built with Spring Boot backend and React frontend with H2 file-based persistent database.

## Features

✅ **Product Management** - Full CRUD operations (create, read, update, delete)
✅ **Order Management** - Create and manage orders with 4 status types
✅ **Responsive UI** - Clean dashboard with tabbed interface
✅ **Persistent Data** - H2 file-based database with data that survives restarts
✅ **RESTful API** - 12 endpoints for products and orders
✅ **No Authentication** - Open access to all endpoints

## Technology Stack

### Backend
- **Framework**: Spring Boot 4.1.0-M1
- **Language**: Java 17
- **Database**: H2 2.4.240 (file-based)
- **ORM**: JPA/Hibernate
- **Build Tool**: Maven

### Frontend
- **Library**: React 18.2
- **Routing**: React Router v6
- **Styling**: Tailwind CSS
- **HTTP Client**: Axios

## Project Structure

## Project Structure

```
hardware-management/
├── src/main/
│   ├── java/com/example/hardware_management/
│   │   ├── entity/              # JPA entities
│   │   │   ├── Product.java
│   │   │   └── Order.java
│   │   ├── repository/          # Database access
│   │   │   ├── ProductRepository.java
│   │   │   └── OrderRepository.java
│   │   ├── service/             # Business logic
│   │   │   ├── ProductService.java
│   │   │   └── OrderService.java
│   │   ├── controller/          # REST endpoints
│   │   │   ├── RootController.java
│   │   │   ├── ProductController.java
│   │   │   └── OrderController.java
│   │   ├── config/
│   │   │   └── SecurityConfig.java
│   │   └── HardwareManagementApplication.java
│   └── resources/
│       ├── application.properties
│       ├── data.sql            # Seed data
│       └── static/index.html
├── frontend/src/
│   ├── pages/
│   │   └── Dashboard.js
│   ├── components/
│   │   ├── Sidebar.js
│   │   ├── ProductList.js
│   │   ├── ProductForm.js
│   │   ├── OrderList.js
│   │   └── OrderForm.js
│   ├── services/
│   │   └── api.js
│   ├── App.js
│   └── index.js
├── pom.xml
└── README.md
```

## Quick Start

### Prerequisites
- Java 17+
- Maven 3.8+
- Node.js 16+


### Step 1: Build the Backend

```bash
cd hardware-management
mvn clean install
```

### Step 2: Run the Backend Server

```bash
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

## Frontend Setup

### Step 1: Install Dependencies
### Backend

```bash
cd hardware-management
mvn clean spring-boot:run -DskipTests
```

Server starts on `http://localhost:8080`

### Frontend

```bash
cd frontend
npm install
npm start
```

Frontend opens at `http://localhost:3000`

## API Endpoints

### Products
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `POST /api/products` - Create new product
- `PUT /api/products/{id}` - Update product
- `DELETE /api/products/{id}` - Delete product
- `GET /api/products/category/{category}` - Get products by category

### Orders
- `GET /api/orders` - Get all orders
- `GET /api/orders/{id}` - Get order by ID
- `POST /api/orders` - Create new order
- `PUT /api/orders/{id}` - Update order
- `DELETE /api/orders/{id}` - Delete order
- `GET /api/orders/status/{status}` - Get orders by status

### System
- `GET /` - Welcome page
- `GET /health` - Health check

## Order Statuses

- `ORDERED` - Initial order
- `SHIPPED` - In transit
- `DELIVERED` - Received
- `CANCELLED` - Cancelled

## Database

H2 file-based database at `./data/hardwaredb`. Data persists across application restarts.

H2 Console: `http://localhost:8080/h2-console` (user: `sa`, password: empty)

## License

MIT License

**Last Updated**: January 2026
