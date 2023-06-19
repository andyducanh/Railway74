USE testing_management;

-- 1.Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT * FROM `account`;
SELECT * FROM `department`;

SELECT a.Account_ID,a.Email,a.Username,a.FullName,d.Department_Name
FROM  `account` a
JOIN `department` d
ON a.`Department_ID` = d.`Department_ID`;


-- 2.Viết lệnh để lấy ra thông tin các account được tạo sau ngày 2020-04-01
SELECT *
FROM  `account` 
WHERE `CreateDate`>'2020-04-01';

-- 3.Viết lệnh để lấy ra tất cả các developer 
SELECT a.Email,a.Username,a.FullName,p.Position_Name
FROM `account` a
JOIN `position` p
ON a.`Position_ID` = p.`Position_ID`
WHERE Position_Name = 'Dev';

-- 4.Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT d.Department_ID, d.Department_Name, COUNT(a.`Department_ID`) as 'So_luong_NV'
FROM `account` a
JOIN`department` d
ON a.`Department_ID` = d.`Department_ID`
GROUP BY d.Department_Name
HAVING Count(d.`Department_ID`)>1;

-- 5.Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT *
FROM question q
JOIN exam_question eq
ON q.Question_ID = eq.Question_ID
GROUP BY q.Content
HAVING COUNT(q.Content)= SELECT 




-- maau tham khao --------------------------------
SELECT 		Q.QuestionID, Q.Content, Q.CategoryID, Q.TypeID, Q.CreatorID, Q.CreateDate, Count(Q.Content) AS 'SO LUONG'
FROM		Question Q 
INNER JOIN 	ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY	Q.Content
HAVING		COUNT(Q.Content) = (SELECT	MAX(CountQ)
								FROM		
										(SELECT 		COUNT(Q.QuestionID) AS CountQ
										FROM			ExamQuestion EQ 
										INNER JOIN 		Question Q ON EQ.QuestionID = Q.QuestionID
										GROUP BY		Q.QuestionID) AS MaxContent);



-- 6.Thông kê mỗi category Question được sử dụng trong bao nhiêu Question



-- 7.Thông kê mỗi Question được sử dụng trong bao nhiêu Exam



-- Question 8: Lấy ra Question có nhiều câu trả lời nhất



-- Question 9: Thống kê số lượng account trong mỗi group



-- Question 10: Tìm chức vụ có ít người nhất



-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM



-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: 
-- thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …




-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm



-- Question 14:Lấy ra group không có account nào



-- Question 15: Lấy ra group không có account nào



-- Question 16: Lấy ra question không có answer nào

-- Exercise 2: Union
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
-- b) Lấy các account thuộc nhóm thứ 2
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau



-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
-- b) Lấy các group có nhỏ hơn 7 thành viên
-- c) Ghép 2 kết quả từ câu a) và câu b)