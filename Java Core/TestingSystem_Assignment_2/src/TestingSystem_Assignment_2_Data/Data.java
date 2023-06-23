package TestingSystem_Assignment_2_Data;

import java.time.LocalTime;


import TestingSystem_Assignment_2_Enum.PositionName;

public class Data {

@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	// Create Deparment
	
	Deparment deparment1 = new Deparment();
	deparment1.Id = 1;
	deparment1.Name = "Sale";	
		
	Deparment deparment2 = new Deparment();
	deparment2.Id = 2;
	deparment2.Name = "Marketing";
		
	Deparment deparment3 = new Deparment();
	deparment3.Id = 3;
	deparment3.Name = "Dev";
		
	// Create Possion
		
	Position position1 = new Position();
	position1.Id = 1;
	position1.Name = PositionName.DEV;
	
	Position position2 = new Position();
	position2.Id = 2;
	position2.Name = PositionName.TEST;
	
	Position position3 = new Position();
	position3.Id = 3;
	position3.Name = PositionName.SCRUM_MASTER;
		
	// Create Group
	
	Group group1 = new Group();
	group1.Id = 1;
	group1.groupName = "Java Fresher";
	group1.JoinDate = LocalTime.now();	
		
	Group group2 = new Group();
	group2.Id = 2;
	group2.groupName = "PHP Fresher";
	group2.JoinDate = LocalTime.now();
		
	Group group3 = new Group();
	group3.Id = 3;
	group3.groupName = "Python Fresher";
	group3.JoinDate = LocalTime.now();
		
	// Create Account
	
	Account account1 = new Account();
	account1.Id = 1;
	account1.Email = "ducanh@gmail.com";
	account1.userName = "ducanh";
	account1.fullName = "Bui Duc Anh";
	account1.departmentId = deparment1;
	account1.positionId = position1;
	account1.createDate = LocalTime.now();	
	Group[] groupaccount1 = { group1, group2 }; 
	account1.groups = groupaccount1;
		
	Account account2 = new Account();
	account2.Id = 2;
	account2.Email = "thuhuyen@gmail.com";
	account2.userName = "thuhuyen";
	account2.fullName = "Nguyen Thu Huyen";
	account2.departmentId = deparment2;
	account2.positionId = position2;
	account2.createDate = LocalTime.now();
	account2.groups = new Group[] { group3, group2 }; 
	
	Account account3 = new Account();
	account3.Id = 3;
	account3.Email = "namanh@gmail.com";
	account3.userName = "namanh";
	account3.fullName = "Tran Nam Anh";
	account3.departmentId = deparment3;
	account3.positionId = position3;
	account3.createDate = LocalTime.now();
	

	// Create Account Of Group
	
	group1.accounts = new Account[] { account1 }; 
	group2.accounts = new Account[] { account1, account2 }; 
	group3.accounts = new Account[] { account2 };
	
	/**
	 * Question 1:
	Kiểm tra account thứ 2 
	Nếu không có phòng ban (tức là department == null) 
	thì sẽ in ra text "Nhân viên này chưa có phòng ban"
	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
	 */
	
		System.out.println("---Question 1: Check account2---");
		
		if (account2.departmentId == null) 
		{
		System.out.println("Nhân viên này chưa có phòng ban.");
		} 
		else {
		System.out.println("Phòng ban của nhân viên này là: " + account2.departmentId.Name);
		}
/**
 * Question 2:
Kiểm tra account thứ 2 
Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
 **/


	System.out.println("---Question 2: Check account2---");	
		if (account2.groups == null) {
		System.out.println("Nhân viên này chưa có group");
		} 
		else {
		int countGroup = account2.groups.length; 
		if (countGroup == 1 || countGroup == 2) {
		System.out.println("Group của nhân viên này là Java Fresher, PHP Fresher");
		}
		if (countGroup == 3) {
		System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}
		if (countGroup >= 4) {
		System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		}

		
/**
 * Question 3: Sử dụng toán tử ternary để làm Question 1	
 */
		System.out.println("---Question 3: Check account 2 by ternary ---");	
		System.out.println(account2.departmentId == null 
				? "Nhân viên này chưa có phòng ban."
				: "Phòng ban của nhân viên này là: " + account2.departmentId.Name);	
		
/**
 * Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: 
 * Kiểm tra Position của account thứ 1 
 * 	Nếu Position = Dev thì in ra text "Đây là Developer"
	Nếu không phải thì in ra text "Người này không phải là Developer"	
 */
		System.out.println("---Question 4: Check account 1 by ternary ---");
		System.out.println(account1.positionId.Name.toString() ==  "DEV"
				? "Đây là Developer."
				: "Người này không phải là Developer.");
		
/**
 * Question 5:
Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau: 
Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
Còn lại in ra "Nhóm có nhiều thành viên"		
 */

		System.out.println("---Question 5: Number of accounts in group1---");
		
		if (group1.accounts == null) {
			System.out.println("Nhóm không có thành viên nào");
			} 
		else {
		int countAccount = group1.accounts.length; 
		switch(countAccount)
		{
		case 1:
			System.out.println("Nhóm có một thành viên.");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên. ");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên. ");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
		}		
/**
 * Question 6: Sử dụng switch case để làm lại Question 2		
 */
		System.out.println("---Question 6: Check account2 by switch---");	
		if (account2.groups == null) {
		System.out.println("Nhân viên này chưa có group");
		} 
		else {
		int countGroup = account2.groups.length; 
		switch(countGroup) {
		case 1: 
			System.out.println("Group của nhân viên này là Java Fresher, PHP Fresher");
			break;
		case 2: 
			System.out.println("Group của nhân viên này là Java Fresher, PHP Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;	
		}
		}	
/**	
 *  Question 7: Sử dụng switch case để làm lại Question 4		
*/
		
		System.out.println("---Question 7: Check account 1 by switch ---");
		
		String positionName = account1.positionId.Name.toString(); 
		switch(positionName) {
		case "DEV":
			System.out.println("Đây là Developer.");
			break;	
		default:
			System.out.println("Người này không phải là Developer.");	
			break;
		}
		
	/**
	 * Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
	họ
	 */
		System.out.println("---Question 8: Account information---");
		
		Account[] accArray = { account1, account2, account3};
		for (Account account : accArray) {
		System.out.println(	"Account_ID: " + account.Id + 
							" Email: " + account.Email + 
							" Name: " + account.fullName +
							" Deparment_Name: "+ account.departmentId.Name);
		}
	
/**
 * Question 9: In ra thông tin các phòng ban bao gồm: id và name
 */
		System.out.println("---Question 9: Deparment information---");
		
		Deparment[] depArray = { deparment1, deparment2, deparment3};
		for (Deparment Deparment : depArray) {
		System.out.println(	"Deparment_ID: " + Deparment.Id +
							" Deparment_Name: "+ Deparment.Name);
			
		}
		
/**
 * Question 10: In ra thông tin các account bao gồm: 
 * Email, FullName và tên phòng ban của họ theo định dạng như sau: 
 * 
 * Thông tin account thứ 1 là:
		Email: NguyenVanA@gmail.com
		Full name: Nguyễn Văn A
		Phòng ban: Sale 
 * 
 */
		
		System.out.println("----FOR Question 10: Account information---");
		
		Account[] accArray1 = { account1, account1 }; 
		
		for (int i = 0; i < accArray1.length; i++) { 
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accArray1[i].Email);
			System.out.println("Full name: " + accArray1[i].fullName);
			System.out.println("Phòng ban: " + accArray1[i].departmentId.Name);
		}
		
		
		
		
		
		
		
		
		
	}
}		

