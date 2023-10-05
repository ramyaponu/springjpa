drop if schema  exists product_ms; 

create schema product_ms;

use product_ms;

create table product(
 productid int primary key,
 productname varchar(50),
 productquantity int,
 productcost decimal(5,2),
 productdisc decimal(3,2),
 productdescri varchar(50),
 brand varchar(10)
);

