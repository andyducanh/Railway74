DROP DATABASE IF EXISTS FinalExam4;
CREATE DATABASE FinalExam4;
Use FinalExam4;
DROP TABLE IF EXISTS User;
CREATE TABLE IF NOT EXISTS User
 (
 id INT, 
 full_name VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL,
 passwosd VARCHAR(255) NOT NULL,
 exp_in_year VARCHAR(255),
 pro_skill VARCHAR(255),
 project_id INT NOT NULL,
role 	ENUM('Employee','Manager')

 );
 
 DROP TABLE IF EXISTS Manager;
 CREATE TABLE IF NOT EXISTS `Manager`(
 id INT, 
 exp_in_year VARCHAR(255)

 );
 DROP TABLE IF EXISTS Employee;
 CREATE TABLE IF NOT EXISTS `Employee`(
 id INT, 
 pro_skill VARCHAR(255)

 );