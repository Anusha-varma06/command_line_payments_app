create database commandlinepaymentapp;
use commandlinepaymentapp;
create table User_details (user_id int primary key , user_name varchar(25), password varchar(15),first_name varchar(20) ,last_name varchar(20),phone_number varchar(15),email varchar(200) unique,address varchar(50));
create table User_account_details(user_account_id int , foreign key (user_account_id) references User_details(user_id),account_open_date date, current_wallet_balance bigint,linked_bank_accounts_count int,wallet_pin int);
create table Bank_accounts(bank_account_id int primary key, user_id int , foreign key (user_id) references User_details(user_id),account_number bigint unique,ifsc_code varchar(8),is_active varchar(5),bank_name varchar(15),bank_account_branch_location varchar(20));
create table Source_types(source_id int primary key,source_type_code varchar(4),source_type_desc varchar(20));
create table Txn_details(txn_id int primary key, txn_date_time datetime  , source_id int,foreign key(source_id) references User_details(user_id), target_id int ,foreign key(target_id) references User_details(user_id),source_type_id int , dest_type_id int ,foreign key (source_type_id) references Source_types(source_id),foreign key (dest_type_id) references Source_types(source_id),txn_amount bigint);
create table User_reward_details(reward_id int primary key,user_id int , foreign key(user_id) references User_details(user_id) ,reward_value int);
INSERT INTO User_details (user_id, user_name, password, first_name, last_name, phone_number, email, address)  
VALUES 
(201, 'rahul_21', 'Rahul@123', 'Rahul', 'Sharma', '9876543210', 'rahul.sharma@email.com', 'New Delhi, India'),
(202, 'deepa_r', 'Deepa@789', 'Deepa', 'Raj', '8765432109', 'deepa.raj@email.com', 'Bangalore, India'),
(203, 'vishal_v', 'Vishal@456', 'Vishal', 'Verma', '7654321098', 'vishal.verma@email.com', 'Chennai, India'),
(204, 'swetha_99', 'Swetha@654', 'Swetha', 'Rao', '6543210987', 'swetha.rao@email.com', 'Mumbai, India'),
(205, 'arjun_dev', 'Arjun@321', 'Arjun', 'Naik', '9123456780', 'arjun.naik@email.com', 'Pune, India'),
(206, 'nidhi_m', 'Nidhi@234', 'Nidhi', 'Menon', '8899776655', 'nidhi.menon@email.com', 'Kochi, India'),
(207, 'sandeep_go', 'Sandeep@567', 'Sandeep', 'Goyal', '7788996655', 'sandeep.goyal@email.com', 'Jaipur, India'),
(208, 'meera_kr', 'Meera@901', 'Meera', 'Krishnan', '6677889900', 'meera.krishnan@email.com', 'Coimbatore, India'),
(209, 'rakesh_in', 'Rakesh@147', 'Rakesh', 'Iyer', '9998887776', 'rakesh.iyer@email.com', 'Hyderabad, India'),
(210, 'priya_rk', 'Priya@258', 'Priya', 'Ramakrishnan', '9090909090', 'priya.rk@email.com', 'Mysore, India');
INSERT INTO User_account_details (user_account_id, account_open_date, current_wallet_balance, linked_bank_accounts_count, wallet_pin)  
VALUES 
(201, '2023-01-10', 25000, 2, 1234),
(202, '2022-05-21', 15000, 1, 5678),
(203, '2023-09-18', 35000, 3, 9012),
(204, '2021-11-30', 22000, 2, 3456),
(205, '2022-06-15', 18000, 1, 7890),
(206, '2023-04-28', 27000, 3, 2345),
(207, '2022-12-05', 32000, 2, 6789),
(208, '2023-07-12', 29000, 1, 1357),
(209, '2021-08-20', 40000, 3, 2468),
(210, '2022-03-25', 31000, 2, 9876);
INSERT INTO bank_accounts (bank_account_id, user_id, account_number, ifsc_code, is_active, bank_name, bank_account_branch_location)  
VALUES 
(301, 201, 123456789012, 'HDFC0001', 'YES', 'HDFC Bank', 'Connaught Place, Delhi'),
(302, 202, 234567890123, 'ICIC0002', 'YES', 'ICICI Bank', 'Koramangala, Bangalore'),
(303, 203, 345678901234, 'SBI0003', 'YES', 'State Bank', 'T Nagar, Chennai'),
(304, 204, 456789012345, 'AXIS0004', 'NO', 'Axis Bank', 'Andheri, Mumbai'),
(305, 205, 567890123456, 'KOTK0005', 'YES', 'Kotak Bank', 'Shivaji Nagar, Pune'),
(306, 206, 678901234567, 'UBI0006', 'YES', 'Union Bank', 'MG Road, Kochi'),
(307, 207, 789012345678, 'PNB0007', 'NO', 'Punjab National Bank', 'MI Road, Jaipur'),
(308, 208, 890123456789, 'BOB0008', 'YES', 'Bank of Baroda', 'Race Course, Coimbatore'),
(309, 209, 901234567890, 'CANB0009', 'YES', 'Canara Bank', 'Hitech City, Hyderabad'),
(310, 210, 987654321012, 'IDFC0010', 'YES', 'IDFC Bank', 'KR Circle, Mysore');
INSERT INTO Source_types (source_id, source_type_code, source_type_desc)  
VALUES 
(401, 'WAL', 'Wallet Transfer'),
(402, 'BNK', 'Bank Transfer'),
(403, 'UPI', 'UPI Payment'),
(404, 'CC', 'Credit Card Payment'),
(405, 'DC', 'Debit Card Payment');
INSERT INTO txn_details (txn_id, txn_date_time, source_id, target_id, source_type_id, dest_type_id, txn_amount)  
VALUES 
(501, '2024-01-10 14:30:00', 201, 202, 401, 402, 5000),
(502, '2024-02-15 11:45:00', 203, 204, 402, 403, 7500),
(503, '2024-03-20 09:10:00', 205, 206, 403, 404, 12000),
(504, '2024-04-25 16:55:00', 207, 208, 404, 405, 8800),
(505, '2024-05-30 13:20:00', 209, 210, 405, 401, 6500),
(506, '2024-06-10 18:45:00', 201, 203, 401, 402, 9200),
(507, '2024-07-15 20:30:00', 204, 205, 402, 403, 13000),
(508, '2024-08-20 10:15:00', 206, 207, 403, 404, 15500),
(509, '2024-09-25 12:40:00', 208, 209, 404, 405, 7200),
(510, '2024-10-30 15:05:00', 210, 201, 405, 401, 5400);
INSERT INTO User_reward_details (reward_id, user_id, reward_value)  
VALUES 
(601, 201, 100),
(602, 202, 200),
(603, 203, 150),
(604, 204, 250),
(605, 205, 300),
(606, 206, 180),
(607, 207, 220),
(608, 208, 350),
(609, 209, 400),
(610, 210, 275);
-- Queries
-- 1.number of users using the command line payment application
select count(user_id) as totalusers from user_details;
-- 2.number of transactions happened till date
select count(txn_id) as total_transactions from txn_details;
-- 3.total transactions per user
select count(*),user_id from (select source_id as user_id from txn_details union all select target_id from txn_details)as total_transactions group by user_id;
-- 4.number of active accounts
select count(bank_account_id) as total_activeaccounts from bank_accounts where is_active="yes";
-- 5.display all the user_names of inactive accounts
select user_name from user_details where user_id in(select user_id from bank_accounts where is_active="no");
-- 6.display personal info of the user
select * from user_details where user_id=205;
-- 7.validating users while logging in
select user_id from user_details where user_name="nidhi_m" and password="Nidhi@234";
-- 8.checking no of accounts for a user
select linked_bank_accounts_count from user_account_details where user_account_id=203;
-- 9.checking some user wallet balance
select current_wallet_balance from user_account_details where user_account_id=206;
-- 10.on which date particular user created his account
select account_open_date from user_account_details where user_account_id=206;
-- 11.latest transaction details of a particular user
select txn_id,txn_date_time,txn_amount from txn_details where source_id=209 or target_id=209 order by txn_date_time desc limit 1;
-- 12.total money user sent so far
select sum(txn_amount)as total_money_sent from txn_details where source_id=205;
-- 13.total money user received so far
select sum(txn_amount)as total_money_received from txn_details where target_id=204;
-- 14.largest transaction amount of a user
select max(txn_amount) from txn_details where source_id=206;
-- 15.checking rewards for a user
select reward_id,reward_value from user_reward_details where user_id=205;
-- 16.fetching the user with highest rewards
select user_id from user_reward_details where reward_value=(select max(reward_value) from user_reward_details);
-- 17.users with multiple bank accounts linked
select user_account_id from user_account_details where linked_bank_accounts_count>1;
-- 18.list all transactions where i received money
select txn_id,txn_amount from txn_details where target_id=202;
-- 19. total money sent and received from a user
SELECT  
    (SELECT SUM(txn_amount) FROM Txn_details WHERE source_id =207) AS total_sent,  
    (SELECT SUM(txn_amount) FROM Txn_details WHERE target_id =207) AS total_received;
-- 20. user's highest transaction 
select max(txn_amount)from txn_details where source_id=204 or target_id=204;