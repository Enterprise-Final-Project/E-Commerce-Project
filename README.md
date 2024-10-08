# E-Commerce Application

## Introduction

Our e-commerce application simulates a platform for users to explore fictional products. Built with **Spring Boot** for the backend and **Thymeleaf** for dynamic web pages, it offers a structured and responsive user experience.

The application includes key e-commerce features like user registration, product listings, a shopping cart, and a mock order management system. Users can create accounts, browse product categories, and add items to their cart in a safe environment.

Data is stored in a relational **SQL** database to demonstrate database interactions and manage our fictional inventory. The project focuses on a user-friendly interface with a responsive design for accessibility on various devices. Our goal is to create an engaging and educational e-commerce simulation that showcases our web application development skills.

## Storyboard

![Storyboard](src/main/resources/static/images/storyboard.png)

## Functional Requirements

### Requirement 1: User Registration and Login

- As a new user, I want to register for an account so that I can shop, purchase products, and use other features of the application.

#### Examples:

1. Given I am on the registration screen when I provide a valid email and strong password, then my account should be created successfully, and I should be logged into the main page.
2. Given I am on the registration page when I provide an already registered email, then I should see an error message and the account should not be created.
3. Given I already have an account, when I attempt to log in with a registered correct email and password, then I should be logged in and redirected to the main page.

### Requirement 2: Product Search

- As a user, I want to search for products so that I can find items of interest quickly.

#### Examples:

1. Given I am on a page when I enter a valid product name in the search bar and hit search or press enter, then the application should display a list of products matching the search term.
2. Given I am browsing a category, when I apply filters like price range or rating, then only products that meet the criteria should be displayed.
3. Given I search with an empty string or invalid input, when I hit search or press enter, then an error message should be shown, or no results should be displayed.

### Requirement 3: Shopping Cart

- As a user, I want to add, update, and remove products from my shopping cart so that I can manage my purchases before checkout.

#### Examples:

1. Given I have found a product I want to buy, when I hit add to cart, then the product should appear in my cart with a default quantity of 1.
2. Given I have multiple items in my cart when I update the quantity of a product or remove an item, then the cart should reflect these changes in real-time.
3. Given I have items in my cart and proceed to checkout without logging in, then I should be prompted to log in or sign up before continuing.

### Requirement 4: Checkout and Payment Processing

- As a user, I want to securely complete my purchase through a checkout process so that I can pay for and receive my items.

#### Examples:

1. Given I have items in my cart when I go to checkout and enter valid payment details, then my order should be processed, and I should receive a confirmation email and message on the page.
2. Given I have invalid or expired payment details when I attempt to checkout, then I should see an error message, and the order should not be processed.
3. Given I am eligible for a discount when I enter a valid discount code, then the total amount should be updated to reflect the discount.

### Requirement 5: Order Tracking

- As a user, I want to track my order status after making a purchase so that I can know when my items will arrive.

#### Examples:

1. Given I have successfully placed an order when I go to the My Orders page, then I should see a list of my orders along with their statuses.
2. Given I try to access an order status page without being logged in, when I attempt to view order details, then I should be prompted to log in.
3. Given my order has been shipped, when I click on order details, then I should see shipping carrier details, tracking number, and expected delivery date.

### Requirement 6: Product Reviews

- As a user, I want to leave reviews and ratings for purchased products so that I can share my experience and help other users.

#### Examples:

1. Given I have purchased a product when I navigate to the product page and submit a valid review and rating, then the review should appear under the product's review section, and the overall rating should be updated.
2. Given I try to submit a review without purchasing a product, when I attempt to submit a review, then the system should not allow the review.

### Requirement 7: Admin Product Management

- As an Admin, I want to add, update, or remove products in the catalog so I can keep the inventory up to date.

#### Examples:

1. Given I am logged in as a store Admin when I navigate to the product management page and enter new product details, then the product should be added to the catalog and visible to the customers.
2. Given a product has incorrect information, when I update the product's details, then the catalog should reflect the changes in real-time.

### Requirement 8: Wishlist Management

- As a user, I want to add items to a wishlist so that I can save products I am interested in purchasing later.

#### Examples:

1. Given I am browsing products, when I click Add to Wishlist on a product page, then the product should be saved to my wishlist, accessible from my profile.
2. Given I have multiple items in my wishlist when I remove an item or move it to the cart, then the wishlist should reflect these changes, and the product should no longer appear if removed.
3. Given I have an empty wishlist, when I try to view it, then the system should display a message indicating my wishlist is empty.

## Class Diagram

![Class Diagram](src/main/resources/static/images/ClassDiagram.png)

### Class Diagram Overview

This class diagram represents a simple e-commerce system, outlining users, products, orders, payments, shipping, and reviews.

### User Class

At the core is the `User` class, which contains the following key attributes:

- `userID`: Unique identifier for the user.
- `email`: The user’s email address.
- `password`: The user’s password.
- `mailingAddress`: The user’s mailing address.
- `shippingAddress`: The user’s shipping address.
- `accountType`: Defines the role of the user (Buyer, Seller, Admin).
- `paymentMethod`: User's payment method (type unspecified).

The `User` class is extended by three roles:

- **Buyer**: Has a `Cart`, `orderHistory`, and `wishlist`.
- **Seller**: Manages a `productList` and `orderFulfillment`.
- **Admin**: Identified by an `accountType` of 1.

### Product Class

The `Product` class defines a product with attributes like:

- `productID`: Unique identifier for the product.
- `name`: Product name.
- `description`: Description of the product.
- `price`: Price of the product.
- `stock`: Number of items in stock.
- `category`: Product's category.
- `subcategory`: Product's subcategory.
- `images`: Array of images associated with the product.

Each product belongs to a **Category**, which includes:

- `categoryID`: Unique identifier for the category.
- `categoryName`: Name of the category.

### Review Class

Users can leave feedback on products through the `Review` class, which includes:

- `reviewID`: Unique identifier for the review.
- `rating`: Rating provided by the user.
- `comment`: Written review.
- `userID`: The ID of the user who left the review.

### Order Class

The `Order` class handles transactions, containing:

- `orderID`: Unique identifier for the order.
- `orderDate`: Date and time the order was placed.
- `userID`: ID of the user who placed the order.
- `totalAmount`: Total cost of the order.

The `Order` class is linked to the following:

- **Payment**: Tracks payment details with `paymentID`, `paymentMethod`, and `paymentStatus`.
- **ShippingDetails**: Includes `shippingAddress`, `shippingType`, and `deliveryDate`.
- **CartItem**: Tracks products in the order, including `productID`, `quantity`, and `price`.

## JSON Schema

Our e-commerce application provides a REST endpoint that emits JSON data, which can be consumed by external systems. Below is a draft JSON schema that outlines the structure of the data the endpoint returns.

We used `QuickType.io` to generate the schema based on our DTO (Data Transfer Object) classes. The schema is designed to be flexible and extendable, ensuring future adjustments can be made as the project evolves.

### Example JSON Schema for Product

```json
{
  "type": "object",
  "properties": {
    "productID": {
      "type": "string",
      "description": "Unique identifier for the product."
    },
    "name": {
      "type": "string",
      "description": "The name of the product."
    },
    "description": {
      "type": "string",
      "description": "A brief description of the product."
    },
    "price": {
      "type": "number",
      "description": "The price of the product."
    },
    "stock": {
      "type": "integer",
      "description": "The quantity available in stock."
    },
    "category": {
      "type": "string",
      "description": "The product's category."
    },
    "subcategory": {
      "type": "string",
      "description": "The product's subcategory."
    },
    "images": {
      "type": "array",
      "items": {
        "type": "string"
      },
      "description": "An array of image URLs associated with the product."
    }
  },
  "required": ["productID", "name", "price", "stock"]
}
```

### Example JSON Schema for Order

```json
{
  "type": "object",
  "properties": {
    "orderID": {
      "type": "string",
      "description": "Unique identifier for the order."
    },
    "orderDate": {
      "type": "string",
      "format": "date-time",
      "description": "The date and time when the order was placed."
    },
    "userID": {
      "type": "string",
      "description": "The ID of the user who placed the order."
    },
    "totalAmount": {
      "type": "number",
      "description": "The total cost of the order."
    },
    "items": {
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "productID": {
            "type": "string",
            "description": "Unique identifier for the product."
          },
          "quantity": {
            "type": "integer",
            "description": "Quantity of the product ordered."
          },
          "price": {
            "type": "number",
            "description": "Price of the product."
          }
        },
        "required": ["productID", "quantity", "price"]
      },
      "description": "Array of items included in the order."
    }
  },
  "required": ["orderID", "orderDate", "userID", "totalAmount", "items"]
}
```

### Example JSON Schema for User

```json
{
  "type": "object",
  "properties": {
    "userID": {
      "type": "string",
      "description": "Unique identifier for the user."
    },
    "email": {
      "type": "string",
      "format": "email",
      "description": "The user's email address."
    },
    "password": {
      "type": "string",
      "description": "The user's password (hashed)."
    },
    "mailingAddress": {
      "type": "string",
      "description": "The user's mailing address."
    },
    "shippingAddress": {
      "type": "string",
      "description": "The user's shipping address."
    },
    "accountType": {
      "type": "string",
      "enum": ["Buyer", "Seller", "Admin"],
      "description": "Defines the role of the user."
    },
    "paymentMethod": {
      "type": "string",
      "description": "The user's preferred payment method."
    },
    "orderHistory": {
      "type": "array",
      "items": {
        "type": "string"
      },
      "description": "Array of order IDs representing the user's order history."
    },
    "wishlist": {
      "type": "array",
      "items": {
        "type": "string"
      },
      "description": "Array of product IDs that the user has added to their wishlist."
    },
    "cart": {
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "productID": {
            "type": "string",
            "description": "Unique identifier for the product."
          },
          "quantity": {
            "type": "integer",
            "description": "Quantity of the product in the cart."
          }
        },
        "required": ["productID", "quantity"]
      },
      "description": "Array of items currently in the user's shopping cart."
    }
  },
  "required": ["userID", "email", "password", "accountType"]
}
```

## SCRUM Roles

- Scrum Master: Andrew Grosko
- Product Owner: Nathan Burns
- Developer: Noah Jackson-Huddleston
- Developer: Alexander Grisby
- Developer: Darian Fulton

## GitHub Link

[GitHub Repository](https://github.com/NathanBurns3/E-Commerce-Project)

## SCRUM Board

[SCRUM Board](https://github.com/orgs/Enterprise-Final-Project/projects/2)

## Teams Standup Link

[Teams Meeting](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NGFjYzUzM2QtYTdjNS00ZTZkLWJlNmEtMTlmNzAzOTExZmQz%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%2236a902b9-c125-4af8-b2fb-8b8a2fee2fca%22%7d)
