-- create Database 
DROP DATABASE IF EXISTS Testing_management;
CREATE DATABASE	Testing_management;
USE	Testing_management;

-- create table Department
DROP TABLE IF EXISTS Deparment; 
CREATE TABLE	Department(
	Department_ID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Department_Name		VARCHAR(50) NOT NULL UNIQUE KEY
);

-- create table `Position`
DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`(
	Position_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Position_Name		ENUM('Dev','Test,','Scrum Master','PM')
);

-- create table `Account`
DROP TABLE IF EXISTS `Account`;
CREATE TABLE	`Account`(
	Account_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Email				VARCHAR(100) NOT NULL UNIQUE KEY,
	Username			VARCHAR(50) NOT NULL UNIQUE KEY,
	FullName			VARCHAR(50) NOT NULL,
	Department_ID		INT UNSIGNED NOT NULL ,
	Position_ID			INT UNSIGNED NOT NULL ,
    CreateDate			DATETIME DEFAULT NOW(),
	FOREIGN KEY(Department_ID) REFERENCES Department(Department_ID),
    FOREIGN KEY(Position_ID) REFERENCES `Position`(Position_ID)
  );

-- create table `Group`
DROP TABLE IF EXISTS `Group`;
CREATE TABLE	`Group`(
	Group_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	GroupName			VARCHAR(50) NOT NULL UNIQUE KEY,
	Creator_ID			INT UNSIGNED,
    CreateDate			DATETIME DEFAULT NOW(),
    FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

-- create table Group_Account 
DROP TABLE IF EXISTS Group_Account;
 CREATE TABLE	Group_Account(
	Group_ID			INT UNSIGNED AUTO_INCREMENT,
	Account_ID			INT UNSIGNED NOT NULL,
    JoinDate			DATETIME DEFAULT NOW(),
    PRIMARY KEY(Group_ID,Account_ID),
    FOREIGN KEY(Group_ID) REFERENCES `Group`(Group_ID),
    FOREIGN KEY(Account_ID) REFERENCES `Account`(Account_ID)
);
 
 -- create table Type_Question
 DROP TABLE IF EXISTS Type_Question;
CREATE TABLE	Type_Question(
	Type_ID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	TypeName			ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE KEY
);

-- create table Category_Question
DROP TABLE IF EXISTS Category_Question;
CREATE TABLE	Category_Question(
	Category_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	CategoryName		VARCHAR(50) NOT NULL UNIQUE KEY
);
 
 -- create table Question
 DROP TABLE IF EXISTS Question;
 CREATE TABLE	Question(
	Question_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Content				VARCHAR(255) NOT NULL,
    Category_ID			INT UNSIGNED NOT NULL,
    Type_ID				INT UNSIGNED NOT NULL,
    Creator_ID			INT UNSIGNED NOT NULL,
    CreateDate			DATETIME DEFAULT NOW(),
	FOREIGN KEY(Category_ID) REFERENCES Category_Question(Category_ID),
	FOREIGN KEY(Type_ID) REFERENCES Type_Question(Type_ID),
	FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

-- create table Answer
DROP TABLE IF EXISTS Answer;
 CREATE TABLE	Answer(
	Answer_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Content				VARCHAR(255) NOT NULL,
    Question_ID			INT UNSIGNED NOT NULL,
    isCorrect			BIT,
    FOREIGN KEY(Question_ID) REFERENCES Question(Question_ID)
);

-- create table Exam
DROP TABLE IF EXISTS Exam;
CREATE TABLE	Exam(
	Exam_ID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`Code`				CHAR(10) NOT NULL,
	Title				VARCHAR(255) NOT NULL,
	Category_ID			INT UNSIGNED NOT NULL,
	Duration			INT UNSIGNED NOT NULL,
	Creator_ID			INT UNSIGNED NOT NULL,
    CreateDate			DATETIME DEFAULT NOW(),
	FOREIGN KEY(Category_ID) REFERENCES Category_Question(Category_ID),
	FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

-- create table ExamQuestion
DROP TABLE IF EXISTS Exam_Question;
CREATE TABLE	Exam_Question(
	Exam_ID				INT UNSIGNED NOT NULL,
	Question_ID			INT UNSIGNED NOT NULL,
    PRIMARY KEY(Exam_ID,Question_ID	),
    FOREIGN KEY(Exam_ID) REFERENCES Exam(Exam_ID),
    FOREIGN KEY(Question_ID	) REFERENCES Question(Question_ID)
);
