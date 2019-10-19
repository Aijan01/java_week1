CREATE DATABASE Shop
USE Shop

CREATE TABLE Product
(id_product INT PRIMARY KEY NOT NULL IDENTITY,
name NVARCHAR(70) NOT NULL,
price FLOAT,
category NVARCHAR(50) NOT NULL,
shelf_life NVARCHAR(30))

SELECT*FROM Product


INSERT INTO Product 
VALUES('apple',100, 'vegetablesFruits','12.11.2019')


CREATE TABLE Client
(id_client INT PRIMARY KEY NOT NULL IDENTITY(200,1),
 name_client NVARCHAR(20) NOT NULL,
 last_name_client NVARCHAR(30) NOT NULL,
 middle_name_client NVARCHAR(30),
 phone_number INT,
 address_ NVARCHAR(30) NOT NULL) 

SELECT*FROM Client

INSERT INTO Client 
VALUES('Shirin','Abdijalilova', 'Abdijalilovna',0778655448,'Bishkek')


CREATE TABLE Supplier
(id_supplier INT PRIMARY KEY NOT NULL IDENTITY,
name_company NVARCHAR(30) NOT NULL,
name_supplier NVARCHAR(20) NOT NULL,
last_name_supplier NVARCHAR(30) NOT NULL,
middle_name_supplier NVARCHAR(30),
phone_number INT,
address_ NVARCHAR(30) NOT NULL) 

SELECT*FROM Supplier


CREATE TABLE Supply
(id_supply INT PRIMARY KEY NOT NULL IDENTITY,
id_supplier INT,
id_product INT, 
quantity INT NOT NULL,
price_supply FLOAT NOT NULL,
date_supply  DATE NOT NULL,

constraint fk_id_supplier foreign key (id_supplier) references Supplier,
constraint fk_id_product foreign key (id_product ) references Product)


SELECT*FROM Supply



CREATE TABLE Purchase
(id_purchase INT PRIMARY KEY NOT NULL IDENTITY,
id_client INT,
id_product INT, 
quantity INT NOT NULL,
date_purchase DATE NOT NULL,

constraint fk_id_client foreign key (id_client) references Client,
constraint fk_id_products foreign key (id_product ) references Product)

SELECT*FROM Purchase