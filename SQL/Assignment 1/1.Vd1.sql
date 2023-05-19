CREATE DATABASE	Salemanagement;
USE	Salemanagement;

CREATE TABLE	Customers (
	customer_id				INT,
	first_name				VARCHAR(50),
	last_name				VARCHAR(50),
	email_address 			VARCHAR(100),
	number_of_complaints	VARCHAR(50)
);

CREATE TABLE SALES (
	purchase_number			INT,
	data_of_purchase		DATE,
	customer_id				INT,
	item_code				VARCHAR(50)
);

CREATE TABLE Items (
	item_code				VARCHAR(50),
	item					VARCHAR(50),
	unit_price_usd 			INT,
	company_id				INT,
	company					VARCHAR(50),
	phone_number			VARCHAR(50)
);