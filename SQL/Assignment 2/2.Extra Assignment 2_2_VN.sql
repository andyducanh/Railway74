-- Create database  Fresher_Training_Management
DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE	Fresher_Training_Management;
USE	Fresher_Training_Management;

-- Create table Trainee
DROP TABLE IF EXISTS Trainee; 
CREATE TABLE	Trainee(
	Trainee_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name			VARCHAR(50) NOT NULL,
    Birth_Date			DATE NOT NULL,
    Gender				ENUM('Male','Female','Unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ<=20) NOT NULL,
    ET_Gmath			TINYINT UNSIGNED CHECK(ET_Gmath<=20) NOT NULL,
    ET_English			TINYINT UNSIGNED CHECK(ET_English<=50) NOT NULL,
    Training_Class		CHAR(10) NOT NULL,
    Evaluation_Notes	TEXT NOT NULL
);

-- INSERT Column VTI_Account
ALTER TABLE Trainee ADD COLUMN VTI_Account VARCHAR(50) NOT NULL UNIQUE KEY;

-- Create table Data_Types
DROP TABLE IF EXISTS Data_Types;
CREATE TABLE	Data_Types(
	ID					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(50) NOT NULL,
    `Code`				CHAR(5) NOT NULL,
    Modified_Date		DATETIME DEFAULT NOW()
);

-- Create table Data_Types2
DROP TABLE IF EXISTS Data_Types2;
CREATE TABLE	Data_Types2(
	ID					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(50) NOT NULL,
    BirthDate			DATE NOT NULL,
    Gender				ENUM('0','1','2'),	-- 0=Male, 1=Female, 2=Unknown
    Is_Deleted_Flag		ENUM('0','1')		-- 0=đang hoạt động, 1=đã xóa 
);

-- Insert data Trainee
INSERT INTO Trainee(Full_Name	,		Birth_Date,		Gender,		ET_IQ,	ET_Gmath,ET_English,Training_Class,Evaluation_Notes,VTI_Account)
VALUES
					('Bui Duc Anh',   	'1994-11-15',	'Male',		'20',	'20',	'50'	,	'DEV',			'xuất sắc',		'vtiaccount1@gmail.com'),
                    ('Nguyen Nam Anh',	'1994-09-15',	'Male',		'15',	'10',	'30'	,	'JAVA',			'xuất sắc',		'vtiaccount2@gmail.com'),
                    ('Bui Thu Huyen',   '1994-11-20',	'Female',	'19',	'18',	'45'	,	'C#',			'xuất sắc',		'vtiaccount3@gmail.com'),
                    ('Tran Anh Thu',  	'1994-10-15',	'Unknown',	'18',	'20',	'40'	,	'DEV',			'xuất sắc',		'vtiaccount4@gmail.com'),
                    ('Nguyen Cat Nhu',  '1979-11-10',	'Female',	'17',	'19',	'50'	,	'JAVA',			'xuất sắc',		'vtiaccount5@gmail.com');
SELECT * FROM Trainee WHERE ET_IQ>=

DROP TABLE IF EXISTS Data_Types;
CREATE TABLE	Data_Types(
	ID					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(50) NOT NULL,
    `Code`				CHAR(5) NOT NULL,
    Modified_Date		DATETIME DEFAULT NOW()
);

INSERT INTO Data_Types(`Name`,`Code`,Modified_Date)
VALUES
					


SELECT * FROM Data_Types