-- Create table for Product
CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2),
    delivery_time VARCHAR(255),
    stock INT,
    category VARCHAR(255),
    subcategory VARCHAR(255)
);

-- Insert test data into Product table
INSERT INTO product (name, description, price, delivery_time, stock, category, subcategory)
SELECT 'T-Shirt', 'Comfortable cotton t-shirt', 19.99, '2-3 days', 100, 'CLOTHING', 'SHIRT'
WHERE NOT EXISTS (SELECT 1 FROM product WHERE name = 'T-Shirt');
INSERT INTO product (name, description, price, delivery_time, stock, category, subcategory)
SELECT 'Jeans', 'Stylish denim jeans', 29.99, '3-5 days', 50, 'CLOTHING', 'PANTS'
WHERE NOT EXISTS (SELECT 1 FROM product WHERE name = 'Jeans');
INSERT INTO product (name, description, price, delivery_time, stock, category, subcategory)
SELECT 'Jacket', 'Warm winter jacket', 39.99, '1-2 days', 30, 'CLOTHING', 'JACKET'
WHERE NOT EXISTS (SELECT 1 FROM product WHERE name = 'Jacket');

-- Create table for User
CREATE TABLE IF NOT EXISTS user (
    userID BIGINT AUTO_INCREMENT PRIMARY KEY,
    active BOOLEAN,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    phone_number VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    mailing_address VARCHAR(255),
    shipping_address VARCHAR(255),
    payment_method INT,
    account_type VARCHAR(255)
);

-- Insert test data into User table

/* 
paymentid
payment_status
payment_type */


INSERT INTO user (active, first_name, last_name, phone_number, email, password, mailing_address, shipping_address, payment_method, account_type)
SELECT TRUE, 'John', 'Doe', '123-456-7890', 'john.doe@example.com', 'password123', '123 Main St', '123 Main St', '1', 'ADMIN'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE email = 'john.doe@example.com');
INSERT INTO user (active, first_name, last_name, phone_number, email, password, mailing_address, shipping_address, payment_method, account_type)
SELECT TRUE, 'Jane', 'Smith', '098-765-4321', 'jane.smith@example.com', 'password456', '456 Elm St', '456 Elm St', '2', 'USER'
WHERE NOT EXISTS (SELECT 1 FROM user WHERE email = 'jane.smith@example.com');

-- Create table for Payment
CREATE TABLE IF NOT EXISTS payment (
    paymentID INT PRIMARY KEY,
    paymentType VARCHAR(255),
    paymentStatus VARCHAR(255),
    UNIQUE (paymentType)
);

-- Insert test data into Payment table
INSERT INTO payment (paymentID, paymentType, paymentStatus)
SELECT 1, 'CREDIT', 'APPROVED'
WHERE NOT EXISTS (SELECT 1 FROM payment WHERE paymentType = 'CREDIT');
INSERT INTO payment (paymentID, paymentType, paymentStatus)
SELECT 2, 'DEBIT', 'NOTPAYED'
WHERE NOT EXISTS (SELECT 1 FROM payment WHERE paymentType = 'DEBIT');

-- Create table for Order
CREATE TABLE IF NOT EXISTS `order` (
    orderID INT PRIMARY KEY,
    orderDate TIMESTAMP,
    userID BIGINT,
    totalAmount FLOAT,
    FOREIGN KEY (userID) REFERENCES user(userID)
);

-- Insert test data into Order table
INSERT INTO `order` (orderID, orderDate, userID, totalAmount)
SELECT 1, '2023-01-01 10:00:00', '1', 100.0
WHERE NOT EXISTS (SELECT 1 FROM `order` WHERE orderID = 1);
INSERT INTO `order` (orderID, orderDate, userID, totalAmount)
SELECT 2, '2023-01-02 11:00:00', '2', 200.0
WHERE NOT EXISTS (SELECT 1 FROM `order` WHERE orderID = 2);

-- Create table for Review
CREATE TABLE IF NOT EXISTS review (
    reviewID INT PRIMARY KEY,
    rating INT,
    comment TEXT,
    userID INT
);

-- Insert test data into Review table
INSERT INTO review (reviewID, rating, comment, userID)
SELECT 1, 5, 'Great product!', 1
WHERE NOT EXISTS (SELECT 1 FROM review WHERE reviewID = 1);
INSERT INTO review (reviewID, rating, comment, userID)
SELECT 2, 4, 'Good value for money.', 2
WHERE NOT EXISTS (SELECT 1 FROM review WHERE reviewID = 2);

-- Create table for ShippingDetails
CREATE TABLE IF NOT EXISTS shipping_details (
    shippingAddress VARCHAR(255),
    deliveryDate TIMESTAMP,
    shippingType VARCHAR(255)
);

-- Insert test data into ShippingDetails table
INSERT INTO shipping_details (shippingAddress, deliveryDate, shippingType)
SELECT '123 Main St', '2023-01-05 10:00:00', 'STANDARD'
WHERE NOT EXISTS (SELECT 1 FROM shipping_details WHERE shippingAddress = '123 Main St' AND deliveryDate = '2023-01-05 10:00:00');
INSERT INTO shipping_details (shippingAddress, deliveryDate, shippingType)
SELECT '456 Elm St', '2023-01-06 11:00:00', 'EXPRESS'
WHERE NOT EXISTS (SELECT 1 FROM shipping_details WHERE shippingAddress = '456 Elm St' AND deliveryDate = '2023-01-06 11:00:00');

-- Create table for CartItem
CREATE TABLE IF NOT EXISTS cart_item (
    ItemID Int Auto_Increment Primary Key,
    productID  BIGINT ,
    quantity INT,
    price DOUBLE,
    foreign key (productID) References product(id)
);

-- Insert test data into CartItem table
INSERT INTO cart_item (productID, quantity, price)
SELECT 1, 2, 19.99
WHERE NOT EXISTS (SELECT 1 FROM cart_item WHERE productID = 1 AND quantity = 2 AND price = 19.99);
INSERT INTO cart_item (productID, quantity, price)
SELECT 2, 1, 29.99
WHERE NOT EXISTS (SELECT 1 FROM cart_item WHERE productID = 2 AND quantity = 1 AND price = 29.99);



-- Create table for WishlistItem
CREATE TABLE IF NOT EXISTS wishlist_Item (
ItemID Int Auto_Increment Primary Key,
productID  BIGINT ,
quantity INT,
price DOUBLE,
foreign key (productID) References product(id)
);

-- Insert test data into CartItem table
INSERT INTO wishlist_Item (productID, quantity, price)
SELECT 1, 2, 19.99
WHERE NOT EXISTS (SELECT 1 FROM wishlist_Item WHERE productID = 1 AND quantity = 2 AND price = 19.99);
INSERT INTO wishlist_Item (productID, quantity, price)
SELECT 2, 1, 29.99
WHERE NOT EXISTS (SELECT 1 FROM wishlist_Item WHERE productID = 2 AND quantity = 1 AND price = 29.99);