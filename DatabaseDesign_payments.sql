-- Creation of Data Base
create database Paymentsapp;
use Paymentsapp;

-- Creation of Tables 
create table User_details (user_id int primary key , user_name varchar(25), password varchar(15),first_name varchar(20) ,last_name varchar(20),phone_number varchar(15),email varchar(200) unique,address varchar(50));

create table User_account_details(user_account_id int , foreign key (user_account_id) references User_details(user_id),account_open_date date, current_wallet_balance bigint,linked_bank_accounts_count int,wallet_pin int);

create table Bank_accounts(bank_account_id int primary key, user_id int , foreign key (user_id) references User_details(user_id),account_number bigint unique,ifsc_code varchar(8),is_active varchar(5),bank_name varchar(15),bank_account_branch_location varchar(20));

create table Source_types(source_id int primary key,source_type_code varchar(4),source_type_desc varchar(20));

create table Txn_details(txn_id int primary key, txn_date_time datetime  , source_id int,foreign key(source_id) references User_details(user_id), target_id int ,foreign key(target_id) references User_details(user_id),source_type_id int , dest_type_id int ,foreign key (source_type_id) references Source_types(source_id),foreign key (dest_type_id) references Source_types(source_id),txn_amount bigint);

create table User_reward_details(reward_id int primary key,user_id int , foreign key(user_id) references User_details(user_id) ,reward_value int );

select * from User_details;

-- Insertion of data
 
 INSERT INTO User_details (user_id, user_name, password, first_name, last_name, phone_number, email, address)  
VALUES 
(1, 'ram123', 'pass123', 'Ram', 'Kumar', '9876543210', 'ram@gmail.com', 'Hyderabad'),
(2, 'anusha456', 'secure456', 'Anusha', 'Reddy', '9876543222', 'anusha@gmail.com', 'Bangalore'),
(3, 'lokesh789', 'lokesh@789', 'Lokesh', 'Babu', '9876543233', 'lokesh@gmail.com', 'Chennai'),
(4, 'bhavani99', 'bhavani@99', 'Bhavani', 'Sharma', '9876543244', 'bhavani@gmail.com', 'Mumbai'),
(5, 'venkat07', 'venkat@07', 'Venkat', 'Raj', '9876543255', 'venkat@gmail.com', 'Delhi'),
(6, 'sree_kala', 'kala@123', 'Sree', 'Kala', '9876543266', 'sreekala@gmail.com', 'Kolkata'),
(7, 'surya_91', 'surya@91', 'Surya', 'Teja', '9876543277', 'surya@gmail.com', 'Pune'),
(8, 'giridhar', 'giri@123', 'Giridhar', 'M', '9876543288', 'giridhar@gmail.com', 'Goa'),
(9, 'charan_rock', 'charan@99', 'Charan', 'Sai', '9876543299', 'charan@gmail.com', 'Nagpur'),
(10, 'haribabu', 'hari@123', 'Hari', 'Babu', '9876543300', 'haribabu@gmail.com', 'Visakhapatnam'),
(11, 'sam_siva', 'sam@456', 'Samba', 'Siva', '9876543311', 'samba@gmail.com', 'Ahmedabad'),
(12, 'teja_star', 'teja@999', 'Teja', 'Ram', '9876543322', 'teja@gmail.com', 'Chandigarh'),
(13, 'meghana_23', 'meghana@23', 'Meghana', 'Devi', '9876543333', 'meghana@gmail.com', 'Bhopal'),
(14, 'karthik_raj', 'karthik@raj', 'Karthik', 'Raj', '9876543344', 'karthik@gmail.com', 'Lucknow'),
(15, 'deepthi_12', 'deepthi@12', 'Deepthi', 'K', '9876543355', 'deepthi@gmail.com', 'Coimbatore'),
(16, 'pradeep_m', 'pradeep@123', 'Pradeep', 'M', '9876543366', 'pradeep@gmail.com', 'Mysore'),
(17, 'varun_cool', 'varun@cool', 'Varun', 'Chowdary', '9876543377', 'varun@gmail.com', 'Jaipur'),
(18, 'manoj_s', 'manoj@777', 'Manoj', 'S', '9876543388', 'manoj@gmail.com', 'Trivandrum'),
(19, 'rahul_dev', 'rahul@dev', 'Rahul', 'Dev', '9876543399', 'rahul@gmail.com', 'Patna'),
(20, 'sravan_k', 'sravan@king', 'Sravan', 'K', '9876543400', 'sravan@gmail.com', 'Indore');


 INSERT INTO User_account_details (user_account_id, account_open_date, current_wallet_balance, linked_bank_accounts_count, wallet_pin)  
VALUES 
(1, '2023-01-15', 5000, 2, 1234),
(2, '2023-02-20', 10000, 1, 5678),
(3, '2023-03-12', 2000, 1, 1111),
(4, '2023-04-10', 7500, 3, 2222),
(5, '2023-05-05', 12000, 2, 3333),
(6, '2023-06-18', 8000, 1, 4444),
(7, '2023-07-22', 9500, 2, 5555),
(8, '2023-08-30', 3000, 1, 6666),
(9, '2023-09-09', 14000, 3, 7777),
(10, '2023-10-01', 2000, 1, 8888),
(11, '2023-10-20', 6000, 2, 9999),
(12, '2023-11-10', 7000, 1, 1212),
(13, '2023-11-25', 9000, 3, 1313),
(14, '2023-12-15', 4500, 2, 1414),
(15, '2024-01-05', 11000, 1, 1515),
(16, '2024-01-20', 3500, 1, 1616),
(17, '2024-02-05', 5000, 2, 1717),
(18, '2024-02-15', 3000, 1, 1818),
(19, '2024-02-22', 7000, 2, 1919),
(20, '2024-02-23', 8000, 3, 2020);


 INSERT INTO Bank_accounts (bank_account_id, user_id, account_number, ifsc_code, is_active, bank_name, bank_account_branch_location)  
VALUES 
(101, 1, 123456789012, 'HDFC0001', 'Yes', 'HDFC', 'Madhapur'),
(102, 2, 987654321098, 'SBI0002', 'Yes', 'SBI', 'Whitefield'),
(103, 3, 456789123456, 'ICIC0003', 'No', 'ICICI', 'Chennai'),
(104, 4, 789123456789, 'AXIS0004', 'Yes', 'AXIS', 'Mumbai'),
(105, 5, 321654987321, 'PNB0005', 'Yes', 'PNB', 'Delhi'),
(106, 6, 741852963147, 'KOTK0006', 'No', 'Kotak', 'Kolkata'),
(107, 7, 852963741258, 'UBIN0007', 'Yes', 'Union Bank', 'Pune'),
(108, 8, 963741258963, 'IDBI0008', 'No', 'IDBI', 'Goa'),
(109, 9, 741852963852, 'BOB0009', 'Yes', 'Bank of Baroda', 'Nagpur'),
(110, 10, 963852741258, 'CANB0010', 'Yes', 'Canara Bank', 'Visakhapatnam');


 INSERT INTO Source_types (source_id, source_type_code, source_type_desc)  
VALUES 
(1, 'WAL', 'Wallet'),
(2, 'BNK', 'Bank Transfer'),
(3, 'UPI', 'UPI Payment'),
(4, 'CRD', 'Credit Card'),
(5, 'DBT', 'Debit Card');


 INSERT INTO Txn_details (txn_id, txn_date_time, source_id, target_id, source_type_id, dest_type_id, txn_amount)  
VALUES 
(1, '2025-02-23 10:30:00', 1, 2, 1, 2, 2000),
(2, '2025-02-23 12:45:00', 2, 1, 2, 1, 1500),
(3, '2025-02-24 09:15:00', 3, 4, 3, 1, 3000),
(4, '2025-02-25 14:00:00', 5, 6, 4, 2, 2500),
(5, '2025-02-26 11:10:00', 7, 8, 1, 3, 1000),
(6, '2025-02-27 16:45:00', 9, 10, 5, 4, 5000),
(7, '2025-02-28 18:30:00', 11, 12, 2, 5, 1200),
(8, '2025-03-01 19:45:00', 13, 14, 1, 2, 800),
(9, '2025-03-02 22:00:00', 15, 16, 3, 1, 300),
(10, '2025-03-03 07:15:00', 17, 18, 5, 4, 7000);


 INSERT INTO User_reward_details (reward_id, user_id, reward_value)  
VALUES 
(1, 1, 50),
(2, 2, 75),
(3, 3, 100),
(4, 4, 25),
(5, 5, 60),
(6, 6, 90),
(7, 7, 30),
(8, 8, 40),
(9, 9, 20),
(10, 10, 80),
(11, 11, 55),
(12, 12, 70),
(13, 13, 85),
(14, 14, 95),
(15, 15, 110),
(16, 16, 45),
(17, 17, 35),
(18, 18, 65),
(19, 19, 120),
(20, 20, 130);



-- 1 display number of users present in the application

select count(user_id) as No_of_users from User_details;

-- 2 Total number of Transactions done in the system 

select count(txn_id) as Total_transactions from txn_details;

-- 3 Fetch the total transactions per each user

SELECT user_id, COUNT(*) AS total_transactions FROM (
    SELECT source_id AS user_id FROM Txn_details
    UNION ALL
    SELECT target_id FROM Txn_details
) AS all_transactions
GROUP BY user_id
ORDER BY total_transactions DESC;

-- 4 Display all the active users
select count(bank_account_id) as no_active_accounts from bank_accounts where is_active="yes"; 

-- 5  Display all the user_names of inactive accounts
select user_name as inactive_users from user_details as u inner join bank_accounts as b on u.user_id = b.user_id  where b.is_active="no";

-- 6 Display Personal of the user 
select * from user_details where user_id=18;

-- 7 validate the user while login
select user_id from user_details where user_name="anusha456" and password="secure456";

-- 8 Fetch the total bank accounts linked to a user
select user_account_id, linked_bank_accounts_count from user_account_details;


-- 9 how can i check my current wallet balance
select current_wallet_balance from user_account_details where user_account_id=2; 

-- 10 on which date i've created my wallet
select account_open_date as created_date from user_account_details where user_account_id=3; 

-- 11 show latest transaction of a user
select txn_id,txn_date_time,txn_amount from txn_details where source_id=2 or target_id=2 order by (txn_date_time) desc limit 1;

-- 12 how much money i sent so far
select sum(txn_amount) as total_debited_amount from txn_details where source_id=1;

-- 13 how much money i've recieved
select sum(txn_amount) as total_credited_amount from txn_details where target_id=4;

-- 14 how many transaction done in this month
select max(txn_amount) from txn_details where source_id=5;

-- 15 Checking rewards for a user 
select reward_id,reward_value from user_reward_details where user_id=2; 

-- 16 Which users have the highest rewards
select user_id , reward_value from user_reward_details where reward_value=(select max(reward_value) from user_reward_details); 

-- 17 find users with mutliple bank account linked
select user_account_id from user_account_details where linked_bank_accounts_count>1;

-- 18 Which source type (bank, wallet, UPI) is used the most?
select source_type_desc from source_types inner join txn_details on txn_details.source_type_id=(select );

-- 19 list all transactions where i recieved money 
select txn_id , txn_amount from txn_details where target_id=2; 

-- 20 show much money is sent and recieved from a user
select (select sum(txn_amount) from txn_details where source_id=2)as sent, (select sum(txn_amount) from txn_details where target_id=2) as recieved;

-- 21 Users highest transaction made
select max(txn_amount)  from txn_details where source_id=2  or target_id=2 ;