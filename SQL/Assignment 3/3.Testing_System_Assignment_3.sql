-- create Database 
DROP DATABASE IF EXISTS Testing_management;
CREATE DATABASE	Testing_management;
USE	Testing_management;

-- create table Department
CREATE TABLE IF NOT EXISTS	Department(
	Department_ID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Department_Name		VARCHAR(255) NOT NULL UNIQUE KEY
);

-- create table 'Position'
CREATE TABLE IF NOT EXISTS `Position`(
	Position_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Position_Name		ENUM('Dev','Test','Scrum Master','PM')
);

-- create table 'Account'
CREATE  TABLE IF NOT EXISTS	`Account`(
	Account_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Email				VARCHAR(255) NOT NULL ,
	Username			VARCHAR(255) NOT NULL ,
	FullName			VARCHAR(255) NOT NULL,
	Department_ID		INT UNSIGNED NOT NULL ,
	Position_ID			INT UNSIGNED NOT NULL ,
    CreateDate			DATETIME DEFAULT NOW(),
	FOREIGN KEY(Department_ID) REFERENCES Department(Department_ID),
    FOREIGN KEY(Position_ID) REFERENCES `Position`(Position_ID)
    );
    
-- create table 'Group'
CREATE TABLE IF NOT EXISTS	`Group`(
	Group_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	GroupName			VARCHAR(255) NOT NULL UNIQUE KEY,
	Creator_ID			INT UNSIGNED,
    CreateDate			DATETIME DEFAULT NOW(),
    FOREIGN KEY(Creator_ID) REFERENCES `Account`(Account_ID)
);

-- create table Group_Account 
CREATE TABLE IF NOT EXISTS	Group_Account(
	Group_ID			INT UNSIGNED AUTO_INCREMENT,
	Account_ID			INT UNSIGNED NOT NULL,
    JoinDate			DATETIME DEFAULT NOW(),
    PRIMARY KEY(Group_ID,Account_ID),
    FOREIGN KEY(Group_ID) REFERENCES `Group`(Group_ID),
    FOREIGN KEY(Account_ID) REFERENCES `Account`(Account_ID)
);
 
 -- create table Type_Question
CREATE TABLE IF NOT EXISTS	Type_Question(
	Type_ID				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	TypeName			ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE KEY
);

-- create table Category_Question
CREATE TABLE IF NOT EXISTS	Category_Question(
	Category_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	CategoryName		VARCHAR(255) NOT NULL UNIQUE KEY
);
 
 -- create table Question
CREATE TABLE IF NOT EXISTS	Question(
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
CREATE TABLE IF NOT EXISTS	Answer(
	Answer_ID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Content				VARCHAR(255) NOT NULL,
    Question_ID			INT UNSIGNED NOT NULL,
    isCorrect			BIT,
    FOREIGN KEY(Question_ID) REFERENCES Question(Question_ID)
);

-- create table Exam
CREATE TABLE IF NOT EXISTS	Exam(
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
CREATE TABLE IF NOT EXISTS	Exam_Question(
	Exam_ID				INT UNSIGNED NOT NULL,
	Question_ID			INT UNSIGNED NOT NULL,
    PRIMARY KEY(Exam_ID,Question_ID	),
    FOREIGN KEY(Exam_ID) REFERENCES Exam(Exam_ID),
    FOREIGN KEY(Question_ID	) REFERENCES Question(Question_ID)
);

-- Insert data Department
INSERT INTO Department	(Department_Name)
VALUES
						(N'Sale1'),
						(N'Sale2'),
						(N'Marketing'),
						(N'HCNS'),
						(N'Kế toán'),
						(N'Kỹ thuật'),
						(N'Đào tạo dài hạn'),
						(N'Đào tạo ngắn hạn'),
						(N'Truyền thông nội bộ'),
						(N'Bảo vệ');
                        
 -- Insert data `Position`
INSERT INTO `Position`	(Position_Name)
VALUES
						(N'Dev'),
						(N'Test'),
						(N'Scrum Master'),
						(N'PM');

-- Insert data `Account`(  					
INSERT INTO `Account` (Email							, Username			, FullName				, Department_ID	, Position_ID, CreateDate)
VALUES 				('account.123456@gmail.com'			, 'dangblack'		,'Bui Duc Anh'			,	'3'			,   '1'		,'2020-03-05'),
					('account1@gmail.com'				, 'quanganh'		,'Nguyen Quang Anh'		,	'1'			,   '2'		,'2020-03-05'),
                    ('account2@gmail.com'				, 'vanchien'		,'Nguyen Van Chien'		,   '2'			,   '3'		,'2020-03-07'),
                    ('account3@gmail.com'				, 'duong1'			,'Duong Do'				,   '4'			,   '4'		,'2020-03-08'),
                    ('account4@gmail.com'				, 'thang123'		,'Nguyen Chien Thang'	,   '3'			,   '4'		,'2020-03-10'),
                    ('account.5@gmail.com'				, 'xuananh'			,'Tran Xuan Anh'		,   '6'			,   '3'		,'2020-04-05'),
                    ('account.6@gmail.com'				,'huan1'			,'Bui Xuan Huan'		,   '2'			,   '2'		, NULL		),
                    ('account.8@gmail.com'				, 'tungnui'			,'Nguyen Thanh Tung'	,   '8'			,   '1'		,'2020-04-07'),
                    ('account.9@gmail.com'				, 'duongghuu'		,'Duong Van Huu'		,   '9'			,   '2'		,'2020-04-07'),
                    ('account.10@gmail.com'				, 'thuhuyen99'		,'Bui Thu Huyen'		,   '5'			,   '1'		,'2020-04-09');

-- Insert data  'Group' 
INSERT INTO `Group`	(  GroupName			, Creator_ID	, CreateDate)
VALUES 				('Testing System'		,   '5'			,'2019-03-05'),
					('Development'			,   '1'			,'2020-03-07'),
                    ('VTI Sale 01'			,   '2'			,'2020-03-09'),
                    ('VTI Sale 02'			,   '3'			,'2020-03-10'),
                    ('VTI Marketing 03'		,   '4'			,'2020-03-28'),
                    ('VTI Creator'			,   '6'			,'2020-04-06'),
                    ('VTI Marketing 01'		,   '7'			,'2020-04-07'),
                    ('Management'			,   '8'			,'2020-04-08'),
                    ('Chat with love'		,  	'9'			,'2020-04-09'),
                    ('HCNS'					,  	'10'		,'2020-04-10');
            
-- Insert data  Group_Account   
INSERT INTO `Group_Account`	(  Group_ID	, Account_ID	, JoinDate	 )
VALUES 						(	1		,    1		,'2019-03-05'),
							(	1		,    2		,'2020-03-07'),
							(	3		,    3		,'2020-03-09'),
							(	3		,    4		,'2020-03-10'),
							(	5		,    5		,'2020-03-28'),
							(	1		,    3		,'2020-04-06'),
							(	1		,    7		,'2020-04-07'),
							(	8		,    3		,'2020-04-08'),
							(	1		,    9		,'2020-04-09'),
							(	10		,    10		,'2020-04-10');  
-- Insert data  Type_Question  
INSERT INTO Type_Question	(TypeName			) 
VALUES 						('Essay'			), 
							('Multiple-Choice'	);    
                            
-- Insert data  Category_Question 
INSERT INTO Category_Question		(CategoryName	)
VALUES 								('Java'			),
									('ASP.NET'		),
									('ADO.NET'		),
									('SQL'			),
									('javascript'	),
									('Ruby'			),
									('Python'		),
									('C++'			),
									('C Sharp'		),
									('PHP'			);        
                                    
-- Insert data Question  
INSERT INTO Question	(Content			, Category_ID, Type_ID		, Creator_ID, CreateDate )
VALUES 					(N'Câu hỏi về Java'	,	1		,   '1'			,   '2'		,'2020-04-05'),
						(N'Câu Hỏi về PHP'	,	10		,   '2'			,   '2'		,'2020-04-05'),
						(N'Hỏi về C#'		,	9		,   '2'			,   '3'		,'2020-04-06'),
						(N'Hỏi về Ruby'		,	6		,   '1'			,   '4'		,'2020-04-06'),
						(N'Hỏi về javascript',	5		,   '1'			,   '5'		,'2020-04-06'),
						(N'Hỏi về ADO.NET'	,	3		,   '2'			,   '6'		,'2020-04-06'),
						(N'Hỏi về ASP.NET'	,	2		,   '1'			,   '7'		,'2020-04-06'),
						(N'Hỏi về C++'		,	8		,   '1'			,   '8'		,'2020-04-07'),
						(N'Hỏi về SQL'		,	4		,   '2'			,   '9'		,'2020-04-07'),
						(N'Hỏi về Python'	,	7		,   '1'			,   '10'	,'2020-04-07');
                        
-- Insert data Answer  
INSERT INTO Answer	(  Content		, Question_ID	, isCorrect	)
VALUES 				(N'Content 01'	,   1			,	0		),
					(N'Content 02'	,   1			,	1		),
                    (N'Content 03'	,   1			,	0		),
                    (N'Content 04'	,   1			,	1		),
                    (N'Content 05'	,   2			,	1		),
                    (N'Content 06'	,   3			,	1		),
                    (N'Content 07'	,   4			,	0		),
                    (N'Content 08'	,   8			,	0		),
                    (N'Content 09'	,   9			,	1		),
                    (N'Content 10'	,   10			,	1		);
                    
-- Insert data Exam
INSERT INTO Exam	(`Code`			, Title					, Category_ID	, Duration	, Creator_ID	, CreateDate )
VALUES 				('VTIQ001'		, N'Đề thi C#'			,	1			,	60		,   '5'			,'2019-04-05'),
					('VTIQ002'		, N'Đề thi PHP'			,	10			,	60		,   '2'			,'2019-04-05'),
                    ('VTIQ003'		, N'Đề thi C++'			,	9			,	120		,   '2'			,'2019-04-07'),
                    ('VTIQ004'		, N'Đề thi Java'		,	6			,	60		,   '3'			,'2020-04-08'),
                    ('VTIQ005'		, N'Đề thi Ruby'		,	5			,	120		,   '4'			,'2020-04-10'),
                    ('VTIQ006'		, N'Đề thi Postman'		,	3			,	60		,   '6'			,'2020-04-05'),
                    ('VTIQ007'		, N'Đề thi SQL'			,	2			,	60		,   '7'			,'2020-04-05'),
                    ('VTIQ008'		, N'Đề thi Python'		,	8			,	60		,   '8'			,'2020-04-07'),
                    ('VTIQ009'		, N'Đề thi ADO.NET'		,	4			,	90		,   '9'			,'2020-04-07'),
                    ('VTIQ010'		, N'Đề thi ASP.NET'		,	7			,	90		,   '10'		,'2020-04-08');
                    
-- Insert data ExamQuestion
INSERT INTO Exam_Question(Exam_ID	, Question_ID	) 
VALUES 					(	1	,		5		),
						(	2	,		10		), 
						(	3	,		4		), 
						(	4	,		3		), 
						(	5	,		7		), 
						(	6	,		10		), 
						(	7	,		2		), 
						(	8	,		10		), 
						(	9	,		9		), 
						(	10	,		8		); 
            
--  Question 2: Lấy ra tất cả phòng ban
SELECT		*
FROM		Department;   

--  Question 3: Lấy ra id của phòng ban "Sale1"
SELECT 		Department_ID 
FROM 		Department 
WHERE 		Department_Name = N'Sale1';

--  Question 4: lấy ra thông tin account có full name dài nhất
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM `Account`);

--  Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM `Account`) AND Department_ID = 3;

--  Question 6: : Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 		* 
FROM 		`Group`
WHERE		CreateDate <'2019-12-20';

--  Question 7: : Lấy ra ID của question có >= 4 câu Content
SELECT 		Question_ID
FROM 		Answer
GROUP BY 	Question_ID
HAVING 		COUNT(Question_ID) >= 4;

--  Question 8:  Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT `Code`
FROM Exam
WHERE Duration >=60 AND CreateDate < '2019-12-20';

--  Question 9: Lấy ra 5 group được tạo gần đây nhất

SELECT GroupName
FROM `Group`
ORDER BY CreateDate DESC
LIMIT 5;

--  Question 10: Đếm số nhân viên thuộc department có id = 2
SELECT 	COUNT(Account_ID) AS 'Số nhân viên' 
FROM 		`Account`
WHERE 		Department_ID = 2;

--  Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT 		FullName
FROM 		`Account` 
WHERE 		FullName LIKE 'D%o';

--  Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE 
FROM 		Exam 
WHERE 		CreateDate < '2019-12-20';

--  Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE 
FROM 		Question 
WHERE 		Content LIKE 'Câu hỏi%';
--  Question 14: Update thông tin của account có id = 5 thành tên "Nguyen Duc Anh" và email thành andy.ducanh123@gmail.com
UPDATE 		`Account` 
SET 		Fullname 	= 	'Nguyen Duc Anh', 
			Email 		= 	'andy.ducanh123@gmail.com'
WHERE 		Account_ID = 5;
SELECT *
FROM `Group_Account` ;

--  Question 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE 		`Group_Account` 
SET 		Account_ID = 5 
WHERE 		Group_ID = 4;
