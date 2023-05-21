-- Create database  Fresher_Training_Management
DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE	Fresher_Training_Management;
USE	Fresher_Training_Management;

-- Create table Trainee
DROP TABLE IF EXISTS Trainee; 
CREATE TABLE	Trainee(
	Trainee_ID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name			VARCHAR(50) NOT NULL,
    Birth_Date			DATE NOT NULL,
    Gender				ENUM('Male','Female','Unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ<=20) NOT NULL,
    ET_Gmath			TINYINT UNSIGNED CHECK(ET_Gmath<=20) NOT NULL,
    ET_English			TINYINT UNSIGNED CHECK(ET_English<=50) NOT NULL,
    Training_Class		CHAR(10) NOT NULL,
    Evaluation_Notes	VARCHAR(50) NOT NULL
);

-- INSERT Column VTI_Account
ALTER TABLE Trainee ADD COLUMN VTI_Account VARCHAR(50) NOT NULL UNIQUE KEY;

-- Create table Data_Types
DROP TABLE IF EXISTS Data_Types;
CREATE TABLE	Data_Types(
	ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(50) NOT NULL,
    `Code`				CHAR(5) NOT NULL,
    Modified_Date		DATETIME DEFAULT NOW()
);

-- Create table Data_Types2
DROP TABLE IF EXISTS Data_Types2;
CREATE TABLE	Data_Types2(
	ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Name`				VARCHAR(50) NOT NULL,
    BirthDate			DATE NOT NULL,
    Gender				ENUM('0','1','2'),	-- 0=Male, 1=Female, 2=Unknown
    Is_Deleted_Flag		ENUM('0','1')		-- 0=đang hoạt động, 1=đã xóa 
);