--		The SQL Schema for the SQL Tutorial

CONNECT SCOTT/TIGER;

DROP TABLE OrderLine ;
DROP TABLE OrderForm ;
DROP TABLE Customer ;
DROP TABLE Product ;

CREATE TABLE Customer (
    customerID      varchar(8) PRIMARY KEY NOT NULL , 
    name            varchar(20) NOT NULL, 
    address         varchar(60) NOT NULL, 
    zip             varchar(6) , 
    totalPayment    Float,
    totalPayTimes   Integer,
    lastPayDate     Date,
    lastOrderDate   Date
);

CREATE INDEX indName ON  Customer (NAME DESC) ;
CREATE INDEX indLastPayDate ON  Customer (lastPayDate) ;
CREATE INDEX indNameZip ON  Customer (Name, zip) ;


CREATE TABLE OrderForm (
    orderID          int NOT NULL Primary Key,
    custID           varchar(8),
    totalAmount      Float,
    paidAmount       Float,
    orderDate        Date,
    orderClosed      Char(1),
    orderCanceled    Char(1)
);


CREATE TABLE Product (
    productID int     NOT NULL Primary Key ,
    productName       varchar2(30) NOT NULL, 
    referencePrice    Float,
    qunatityInHand    Float
    ) ;

     
CREATE TABLE OrderLine (
    OrderLineID       int     NOT NULL,
    productIDOL       int     NOT NULL, 
    orderIDOL         int     NOT NULL,
    price             Float,
    amount            Float,
    dataCapturedDate  TimeStamp
    ) ;          