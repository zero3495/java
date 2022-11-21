--		The SQL Schema for the SQL Tutorial
use  jdbcdb;
DROP TABLE IF EXISTS OrderLine  ;   
DROP TABLE IF EXISTS OrderForm ;
DROP TABLE IF EXISTS Customer ;
DROP TABLE IF EXISTS Product ;

CREATE TABLE Customer (
    customerID      varchar(5)  NOT NULL,   -- 客戶編號
    name            Varchar(20) NOT NULL,   -- 客戶姓名
    address         Varchar(60) NOT NULL,   -- 地址
    zip             Varchar(6) ,            -- 郵區
    totalPayment    Float,                  -- 付款總金額
    totalPayTimes   Integer,                -- 付款總次數
    lastPayDate     Date,                   -- 最後付款日期
    lastOrderDate   Date,                   -- 最後訂購日期
    CONSTRAINT Primary Key(customerID), 
    INDEX indName  (name DESC)  ,
    INDEX indLastPayDate  (lastPayDate) ,
    INDEX indNameZip  (Name, zip)
    )  
    ENGINE=INNODB ;

CREATE TABLE OrderForm (
    orderID          int NOT NULL AUTO_INCREMENT,  -- 訂單編號
    custID           varchar(5),                   -- 客戶編號
    totalAmount      Float,                        -- 訂單總金額
    paidAmount       Float,                        -- 訂單付款金額
    orderDate        Date,                         -- 訂單日期
    orderClosed      Char(1),
    orderCanceled    Char(1),
    Primary Key(orderID), 
    CONSTRAINT Foreign Key(custID) references Customer(customerID)) 
    ENGINE=INNODB ;    

CREATE TABLE Product (
    productID         VARCHAR(4)  NOT NULL,    -- 產品編號
    productName       Varchar(30) NOT NULL,    -- 產品名稱
    referencePrice    Float,   -- 建議售價
    qunatityInHand    Float,   -- 庫存量
    Primary Key(productID)
    ) 
    ENGINE=INNODB ;       
     
CREATE TABLE OrderLine (
    OrderLineID       int     NOT NULL  Auto_Increment,
    productIDOL       VARCHAR(6)     NOT NULL,  -- 產品編號 
    orderIDOL         int     NOT NULL,         -- 客戶編號
    price             Float,                    -- 單價
    amount            Float,                    -- 訂購數量
    dataCapturedDate  TimeStamp,
    CONSTRAINT Primary Key(OrderLineID),
    CONSTRAINT Foreign Key(orderIDOL) references OrderForm(orderID) ON DELETE CASCADE,
    CONSTRAINT Foreign Key(productIDOL) references Product(productID) ON UPDATE CASCADE
    ) 
    ENGINE=INNODB ;       
          

commit;
          

INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES
  ('A0001', '張愛家', '台東市中華西路二段100之2號', '950', 2500.0, 4, '2003-10-2', '2003-9-5');
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0002', '孫德華', '台中市民族路102號', '401', 750.0, 1, '2005-10-12', '2005-9-30');
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0005', '劉霞珠', '台中市西屯路三段17號', '407', 0, 0, null, null);  
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0009', '古月芳', '台北市民族西路六段17號', '104', 4756.0, 4, '2003-5-12', '2003-5-12');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0011', '勇玲玲', '台北市忠孝東路六段217號16樓', '106', 2240.0, 2, '2004-10-6', '2004-10-22');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0014', '張慧玲', '基隆市大忠路217號16樓', '203', 1808.0, 7, '2004-8-1', '2004-8-11');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0018', '李大為', '台中縣鰲新路25巷127號2樓', '436', 17700.0, 6, '2004-9-7', '2004-10-16');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0021', '何惠民', '台中市西屯區至善路226號10F之1', '407', 2880.0, 1, '2004-5-1', '2004-9-1');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0022', '蔡佳發', '高雄縣茄萣鄉和定路3段78巷12號', '852', 2509.0, 1, '2004-3-20', '2004-4-12');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0025', '顧信言', '桃園縣中壢市忠孝路二段213號3樓', '320', 480.0, 2, '2004-3-12', '2004-3-17');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0031', '王林玲雅', '雲林縣土庫鎮中山路三段154號', '633', 200.0, 1, '2004-4-29', '2004-4-30');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0032', '李玲', '台中市中清路一段257號', '406', 0, 0, null, null);    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0033', '徐俊傑', '台北市民生東路六段107號', '110', 1207.0, 3, '2004-6-15', '2004-6-19');    
INSERT INTO Customer (customerID, name, address, zip, totalPayment, totalPayTimes, lastPayDate, lastOrderDate) VALUES  
  ('A0036', '王書萍', '台北市和平西路17號6樓', '108', 5200.0, 7, '2004-8-13', '2004-8-20');    



INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  7,'A0001',  250 ,  250 ,'2003-01-16','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  9,'A0001', 1250 , 1250 ,'2003-02-16','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 12,'A0001',  320 ,  320 ,'2003-04-07','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 16,'A0001',  360 ,  360 ,'2003-07-09','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 18,'A0001',  320 ,  320 ,'2003-10-02','Y','N');              

INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 4,'A0009',  920 ,  920 ,'2002-11-14','Y','N');          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 5,'A0009', 1170 , 1170 ,'2002-12-23','Y','N');          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 8,'A0009', 1700 , 1700 ,'2003-01-18','Y','N');          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (15,'A0009',  966 ,  966 ,'2003-05-12','Y','N');                

INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (14,'A0011',  652 ,  652 ,'2003-05-11','Y','N');
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 26,'A0011', 1588 , 0 ,'2004-10-06','N','N');  
  
  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 10,'A0014',  208 ,  208 ,'2003-02-25','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 11,'A0014',  200 ,  200 ,'2003-03-12','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 13,'A0014',  300 ,  300 ,'2003-04-28','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 21,'A0014',  400 ,  400 ,'2004-02-20','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 22,'A0014',  100 ,  100 ,'2004-02-22','Y','N');        
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 27,'A0014',  400 ,  200 ,'2004-12-12','N','N');        

INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  6,'A0018', 1200 , 1200 ,'2003-01-02','Y','N');                 
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 17,'A0018', 2500 , 2500 ,'2003-07-22','Y','N');                
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 20,'A0018', 2600 , 2600 ,'2004-02-12','Y','N');                
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 30,'A0018', 4200 , 4200 ,'2005-02-14','Y','N');                      
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 31,'A0018', 3000 , 0 ,'2005-02-15','N','N');                      
  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 32,'A0031',' 200',' 200','2005-02-18','Y','N');                          
  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 23,'A0033',  207 ,  207 ,'2004-02-27','Y','N');                          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 28,'A0033',  400 ,  400 ,'2004-12-18','Y','N');                          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 29,'A0033',  600 ,  600 ,'2005-02-03','Y','N');                              
  
  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  1,'A0036', 1400 , 1400 ,'2002-02-17','Y','N');                          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  2,'A0036', 2500 , 2500 ,'2002-05-25','Y','N');                          
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  (  3,'A0036',  300 ,  300 ,'2002-06-16','Y','N');                              
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 19,'A0036', 2200 , 2100 ,'2003-10-29','Y','N');                                  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 24,'A0036', 6000 , 6000 ,'2004-06-05','Y','N');                                  
INSERT INTO OrderForm (orderID, custID, totalAmount, paidAmount, orderDate, orderClosed, orderCanceled) VALUES  
  ( 25,'A0036', 1600 , 1600 ,'2004-07-01','Y','N'); 
  
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('P001', 'A4 紙 80磅', 90, 80);
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('P002', 'B4 紙 80磅', 110, 55);
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('Q001', '點陣印表機色帶 100尺 1170C', 75, 280);
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('Q002', '噴墨印表機墨水(黑色) 50cc COLOR 760', 280, 117);
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('Q003', '噴墨印表機墨水(彩色) 80cc COLOR 760', 535, 220);    
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('Q004', '點陣印表機色帶 50尺 570C', 50, 180);
INSERT INTO Product (productID, productName,  referencePrice, qunatityInHand) VALUES  
  ('Q005', '雷射印表機 碳粉 258XP', 2500, 80);
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (1, 'P001', 1, 85 , 10, '2002-02-17' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (2, 'P002', 1, 110 , 5, '2002-02-17' );    
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (3, 'P001', 2,  80,  3, '2002-05-25' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (4, 'P002', 2, 110 , 5, '2002-05-25' );    
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (5, 'Q001', 2,  75,  8, '2002-05-25' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (6, 'Q002', 2, 240 , 2, '2002-05-25' );    
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (7, 'Q003', 2, 490, 1, '2002-05-25' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (8, 'Q004', 2,  35 , 4, '2002-05-25' );        
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (9, 'P002', 3,  100,  3, '2002-05-25' );  

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (10, 'P001', 4,  80,  1, '2002-11-14' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (11, 'Q002', 4, 280,  1, '2002-11-14' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (12, 'Q003', 4, 520,  1, '2002-11-14' );      
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (13, 'Q004', 4, 40,  1, '2002-11-14' );        
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (14, 'P001', 5,  80,  2, '2002-12-23' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (15, 'Q002', 5, 280,  1, '2002-12-23' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (16, 'Q003', 5, 520,  1, '2002-12-23' );      
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (17, 'Q004', 5,  42,  5, '2002-12-23' );        
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (18, 'Q004', 6,  50,  10, '2003-01-02' );          
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (19, 'P002', 6,  100,  7, '2003-01-02' );            

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (20, 'Q004', 7,  50,  3, '2003-01-16' );              
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (21, 'P002', 7,  100,  1, '2003-01-16' );                

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (22, 'P001', 8,   90,  5, '2003-01-18' );                      
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (23, 'P002', 8,  110,  2, '2003-01-18' );                  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (24, 'Q001', 8,   75,  3, '2003-01-18' );                  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (25, 'Q002', 8,  280,  1, '2003-01-18' );                  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (26, 'Q003', 8,  525,  1, '2003-01-18' );                        

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (27, 'P001', 9,   90,  5, '2003-02-16' );              
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (28, 'P002', 9,  110,  5, '2003-02-16' );                
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (29, 'Q004', 9,   50,  5, '2003-02-16' );                  
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (30, 'P002', 10,   104,  2, '2003-02-25' );                    
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (31, 'P001', 11,    90,  1, '2003-03-12' );                      
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (32, 'P002', 11,   110,  1, '2003-03-12' );                        
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (33, 'Q002', 12,   275,  1, '2003-04-07' );                        
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (34, 'Q004', 12,    45,  1, '2003-04-07' );               
           
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (35, 'P002', 13,    100,  3, '2003-04-28' );                            
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (36, 'P001', 14,    88,  3, '2003-05-11' );                            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (37, 'P002', 14,    94,  2, '2003-05-11' );                            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (38, 'Q004', 14,    50,  4, '2003-05-11' );                                
  
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (39, 'P001', 15,    88,  7, '2003-05-12' );                            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (40, 'Q004', 15,    50,  7, '2003-05-12' );                                
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (41, 'P001', 16,    90,  4, '2003-07-09' );                            

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (42, 'Q005', 17,   2500,  1, '2003-07-22' );                              
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (43, 'Q002', 18,    270,  1, '2003-10-02' );                              
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (44, 'Q004', 18,    50,  1, '2003-10-02' );                              
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (45, 'P001', 19,    90,  5, '2003-10-29' );                              
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (46, 'P002', 19,    95,  6, '2003-10-29' );                                
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (47, 'Q001', 19,     80,  1, '2003-10-29' );                                
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (48, 'Q002', 19,    250,  4, '2003-10-29' );                                
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (49, 'Q004', 19,    50,  2, '2003-10-29' );                                      
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (50, 'Q004', 20,    50,  2, '2004-02-12' ); 
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (51, 'Q005', 20,  2500,  1, '2004-02-12' );   
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (52, 'P001', 21,    90,  1, '2004-02-20' ); 
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (53, 'P002', 21,   110,  1, '2004-02-20' );     
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (54, 'Q004', 21,    50,  4, '2004-02-20' ); 
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (55, 'Q004', 22,  50,  2, '2004-02-22' );     

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (56, 'P002', 23, 107,  1, '2004-02-27' );       
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (57, 'Q004',  23, 50,  2, '2004-02-27' );
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (58, 'Q003',  24,  500,  2, '2004-06-05' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (59, 'Q005',  24, 2500,  2, '2004-06-05' );    

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (60, 'P001',  25,  90,  2, '2004-06-05' );  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (61, 'P002',  25, 110,  2, '2004-06-05' );    
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (62, 'Q001',  25, 75,  16, '2004-06-05' );      
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (63, 'Q001',  26,  72,  4, '2004-10-06' );        
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (64, 'Q004',  26,  50, 6, '2004-10-06' );          
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (65, 'P001',  26,  90, 5, '2004-10-06' );          
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (66, 'P002',  26, 110, 5, '2004-10-06' );              
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (67, 'Q004',  27, 50,  8, '2004-12-12' );        
  
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (68, 'Q004',  28, 50,  8, '2004-12-18' );          

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (69, 'P002',  29, 100,  6, '2004-12-18' );            

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (70, 'Q005',  30, 2500,  1, '2005-02-14' );            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (71, 'P002',  30, 100,  10, '2005-02-14' );            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (72, 'Q004',  30,  50,  14, '2005-02-14' );                  
  

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (73, 'Q005',  31, 2500,  1, '2005-02-15' );            
INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (74, 'P002',  31, 100,   5, '2005-02-15' );              

INSERT INTO OrderLine (OrderLineID,  productIDOL,  orderIDOL,  price,  amount,  dataCapturedDate) VALUES  
  (75, 'P002',  32, 100,   2, '2005-02-18' );                
  
commit;  