-- Để quản lý Thực tập của sinh viên, người ta xây dựng một cơ sở dữ liệu có tên là
-- ThucTap gồm các sơ đồ quan hệ sau (trường có dấu gạch chân là PrimaryKey)
--  Country(country_id, country_name)
--  Location(location_id, street_address, postal_code, country_id)
--  Employee(employee_id, full_name, email, location_id)

DROP DATABASE IF EXISTS Thuc_tap;
CREATE DATABASE Thuc_tap;
USE Thuc_tap;

CREATE TABLE Country(
	country_id INT AUTO_INCREMENT PRIMARY KEY,
	country_name VARCHAR(100)NOT NULL UNIQUE KEY
);

CREATE TABLE Location(
	location_id INT AUTO_INCREMENT PRIMARY KEY,
	street_address VARCHAR(255),
    postal_code VARCHAR(100)NOT NULL UNIQUE KEY,
    country_id INT,
    FOREIGN KEY(country_id) REFERENCES Country(country_id)
);

CREATE TABLE Employee(
	employee_id INT AUTO_INCREMENT PRIMARY KEY,
	full_name VARCHAR(100),
    email VARCHAR(255),
    location_id INT,
    FOREIGN KEY(location_id) REFERENCES Location(location_id)
);
-- Cau 1: Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 3 bản ghi vào table

 -- Insert data Country
INSERT INTO Country	(country_name)
VALUES 
					('VietNam'),
                    ('USA'),
                    ('Singapo');
 -- Insert data Location
INSERT INTO Location(street_address, 	postal_code, 	country_id)
VALUES 
					('Ngo Gia Tu',			180000, 			1),
					('Tran Nguyen Han',		100000, 			2),
					('Nguyen Van Cu',		550000, 			3);
  -- Insert data Employee                  
INSERT INTO Employee(full_name, 		email, 					location_id)
VALUES 
					('Bui Duc Anh', 	'ducanh@gmail.com', 		'1'),
                    ('Bui Thu Huyen',	'thuhuyen@gmail.com',		'2'),
                    ('Bui Son Tung',	'sontung@gmail.com',		'3');

SELECT * FROM Country;
SELECT * FROM Location;
SELECT * FROM Employee;

-- Cau 2: Viết lệnh để
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT co.country_id , co.country_name,lo.street_address,em.full_name,em.email
FROM Country co
JOIN Location lo using(country_id)
JOIN Employee em using(location_id)
WHERE country_name = 'VietNam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT country_name
FROM Country co
JOIN Location lo using(country_id)
JOIN Employee em using(location_id)
WHERE email = 'thuhuyen@gmail.com';
-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.

SELECT COUNT(
FROM Country co
JOIN Location lo using(country_id)
JOIN Employee em using(location_id)
WHERE email = 'thuhuyen@gmail.com';



-- Cau 3: Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee



-- Cau 4: Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
-- location đó sẽ có location_id = null


