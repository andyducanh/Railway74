DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE	Fresher_Training_Management;
USE	Fresher_Training_Management;

CREATE TABLE	Trainee(
	TraineeID			INT,
    Full_Name			VARCHAR(50),
    Birth_Date			DATE,
    Gender				VARCHAR(50),
    ET_IQ				INT,
    ET_Gmath			INT,
    ET_English			INT,
    Training_Class		VARCHAR(50),
    Evaluation_Notes	VARCHAR(50),
    VTI_Account			VARCHAR(50)
);

CREATE TABLE	DataTypes(
	ID					INT,
	`Name`				VARCHAR(50),
    `Code`				VARCHAR(50),
    ModifiedDate		DATETIME
);

CREATE TABLE	DataTypes2(
	ID					INT,
	`Name`				VARCHAR(50),
    BirthDate			DATE,
    Gender				INT,
    IsDeletedFlag		INT
);