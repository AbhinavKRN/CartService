# CartServices

This project is a Spring Boot application that interacts with the Fake Store API. It provides a set of endpoints to manage products and categories.

## Technologies Used
- Java
- Spring Boot
- Maven

## API Endpoints

### Product API

- `GET /products`: Fetches all products from the Fake Store API and returns them in a list.
- `GET /products/{id}`: Fetches a single product by its ID from the Fake Store API.
- `POST /products`: Creates a new product in the Fake Store API. The request body should contain the product details.
- `GET /products/category/{category}`: Fetches all products from a specific category from the Fake Store API.
- `DELETE /products/{id}`: Deletes a product by its ID from the Fake Store API.
- `PUT /products/{id}`: Updates a product by its ID in the Fake Store API. The request body should contain the updated product details.

### Category API

- `GET /categories`: Fetches all categories from the Fake Store API and returns them in a list.

## Setup and Installation

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to build the project.
4. Run `mvn spring-boot:run` to start the application.


