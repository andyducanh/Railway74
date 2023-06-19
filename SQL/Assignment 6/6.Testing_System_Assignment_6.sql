USE `testing_management`;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
		-- Buoc 1: 
SELECT * FROM `account`;
SELECT * FROM `department`;
		
SELECT a.Email,a.Username,a.FullName
FROM `account`a
JOIN `department` d
ON a.`Department_ID`= d.`Department_ID`
WHERE d.`Department_Name` = 'Sale2';

       -- Buoc 2 - tao store
DELIMITER $$
CREATE PROCEDURE `account_of_deparment`
(IN in_department_name NVARCHAR(50))
	BEGIN
		SELECT a.Email,a.Username,a.FullName
		FROM `account`a
		JOIN `department` d
		ON a.`Department_ID`= d.`Department_ID`
		WHERE d.`Department_Name` = in_department_name; -- thay "sale2' bang in_department_name
	END$$
DELIMITER; 

 CALL `account_of_deparment`('Sale1');
        
-- Question 2: Tạo store để in ra số lượng account trong mỗi group

SELECT * FROM `group_account`; 
			-- Buoc 1
SELECT Group_ID,count(Account_ID)
FROM `group_account` 
WHERE Group_ID='1'
GROUP BY Group_ID;
			-- Buoc 2: Tao Store
DROP PROCEDURE IF EXISTS sp_AccountOfGroup;
DELIMITER $$
CREATE PROCEDURE sp_AccountOfGroup(IN in_GroupID INT UNSIGNED)
BEGIN

	SELECT 		Group_ID, COUNT(Account_ID) as Num_account
    FROM		`group_account`  
    WHERE		Group_ID = in_GroupID
    GROUP BY	Group_ID;
	
END$$
DELIMITER ;

call sp_AccountOfGroup(1);

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
SELECT * FROM type_question;
SELECT * FROM question;
-- buoc 1
	SELECT		COUNT(Type_ID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(now());
 -- buoc 2   
DROP PROCEDURE IF EXISTS sp_typeQuestionOfMonth;
DELIMITER $$
CREATE PROCEDURE sp_typeQuestionOfMonth()
BEGIN

	SELECT		COUNT(Type_ID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(NOW());
	
END$$
DELIMITER ;

call testingsystem.sp_typeQuestionOfMonth();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
SELECT * FROM question;


DROP PROCEDURE IF EXISTS ID_of_TypeQuestion;
DELIMITER $$
CREATE PROCEDURE ID_of_TypeQuestion()
IN	in_typequestion 
OUT out_id_typequestion INT
BEGIN

END$$
DELIMITER ;

call ID_of_TypeQuestion();

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question



-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi 
-- và trả về group có tên chứa chuỗi của người dùng nhập vào 
-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào





-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công




-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất




-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID




-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
 -- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing





-- Question 11: Viết store cho phép người dùng xóa phòng ban 
-- bằng cách người dùng nhập vào tên phòng ban 
-- và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc






-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay




-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")


