
CREATE DATABASE breif6;
-------------------------
create table categories (
	categId INT PRIMARY KEY,
	categName VARCHAR(20)
);
insert into categories (categId,categName) values (11, 'Fruits');
insert into categories (categId,categName) values (12, 'Vegetables');

create table products (
	prodId INT PRIMARY KEY,
	prodName VARCHAR(20),
	prodPrice FLOAT,
	prodDate VARCHAR(20),
	categId INT 
);
ALTER TABLE products ADD FOREIGN KEY (categId) REFERENCES categories(categId);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (1, 'Apples', '5.26', '14/12/2022',11);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (2, 'Carrots', '1.36', '7/11/2022',12);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (3, 'Avocado', '5.69', '3/11/2022',11);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (4, 'Beans', '9.86', '3/10/2022',12);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (5, 'grapes', '4.71', '8/11/2022',12);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (6, 'Orange', '9.83', '3/3/2022',11);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (7, 'Cauliflower', '2.78', '7/02/2022',12);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (8, 'Banans', '3.03', '11/05/2022',11);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (9, 'Tomatos', '8.77', '3/01/2022',12);
insert into products (prodId, prodName, prodPrice, prodDate ,categId) values (10, 'Cherries', '2.04', '10/04/2022',11);
