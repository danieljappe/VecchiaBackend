-- Drop Database
DROP DATABASE IF EXISTS VecchiaDB;

-- Create Database
CREATE DATABASE VecchiaDB;
USE VecchiaDB;

-- Employees Table
CREATE TABLE employees (
                           id INT PRIMARY KEY,
                           password VARCHAR(50),
                           first_name VARCHAR(50),
                           last_name VARCHAR(50),
                           email VARCHAR(100),
                           phone VARCHAR(20),
                           is_admin BOOLEAN,
                           employee_image BLOB
);

-- MenuItems Table
CREATE TABLE menu_items (
                            itemid INT PRIMARY KEY,
                            name VARCHAR(100),
                            description varchar(255),
                            price double,
                            category VARCHAR(50)
);

CREATE TABLE orders (
                        orderid INT PRIMARY KEY,
                        price DOUBLE,
                        name VARCHAR(100),
                        description VARCHAR(1000),
                        email VARCHAR(255),
                        phone VARCHAR(255)
)


