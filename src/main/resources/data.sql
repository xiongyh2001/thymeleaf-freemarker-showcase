--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Bruce', 'bruce@a.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Paul', 'paul@b.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Rick', 'rick@c.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Jason', 'jason@c.com');

--insert into PURCHASES (PRODUCT, PURCHASE_DATE, CUSTOMER_ID) values('Mountain Bike','2010-05-12 00:00:00.0',1);
--insert into PURCHASES (PRODUCT, PURCHASE_DATE, CUSTOMER_ID) values('Football','2010-04-30 00:00:00.0',2);
--insert into PURCHASES (PRODUCT, PURCHASE_DATE, CUSTOMER_ID) values('Kayak','2010-06-05 00:00:00.0',3);
--insert into PURCHASES (PRODUCT, PURCHASE_DATE, CUSTOMER_ID) values('Baseball','2010-08-05 00:00:00.0',3);

insert into CUSTOMERS (CUSTOMER_NAME) VALUES ('Bruce');
insert into CUSTOMERS (CUSTOMER_NAME) VALUES ('Paul');
insert into CUSTOMERS (CUSTOMER_NAME) VALUES ('Rick');
insert into CUSTOMERS (CUSTOMER_NAME) VALUES ('Jason');

insert into CUSTOMERS_PROFILE (CUSTOMER_ID, CUSTOMER_ADDRESS, CUSTOMER_EMAIL) VALUES (1, 'Boston', 'bruce@a.com');
insert into CUSTOMERS_PROFILE (CUSTOMER_ID, CUSTOMER_ADDRESS, CUSTOMER_EMAIL) VALUES (2, 'Boston', 'paul@a.com');
insert into CUSTOMERS_PROFILE (CUSTOMER_ID, CUSTOMER_ADDRESS, CUSTOMER_EMAIL) VALUES (3, 'Boston', 'rick@a.com');
insert into CUSTOMERS_PROFILE (CUSTOMER_ID, CUSTOMER_ADDRESS, CUSTOMER_EMAIL) VALUES (4, 'Boston', 'jason@a.com');

insert into PRODUCT ( NAME, CATEGORY, DESCRIPTION, IMAGEURI, PRICE)
values('LG TV','Televisions','4K Ultra HD 2160p HDR Smart IPS LED HDTV','tv.jpg', 799.99);
insert into PRODUCT ( NAME, CATEGORY, DESCRIPTION, IMAGEURI, PRICE)
values('Dell Laptop','Laptop','15.6 Full HD, Intel Core i5', 'laptop.jpg', 899.99);
insert into PRODUCT ( NAME, CATEGORY, DESCRIPTION, IMAGEURI, PRICE)
values('Apple ipad','Tablets','Wi-Fi 128GB Gold', 'ipad.jpg', 999.99);