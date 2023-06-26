package TestingSystem_Assignment_3_Data;


import java.time.LocalDate;

public class Exercise2_DefaultValue {
public static void main(String[] args) {

/**
 * Question 1:
Không sử dụng data đã insert từ bài trước, 
tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo): 
· Email: "Email 1" 
· Username: "User name 1" 
· FullName: "Full name 1" 
· CreateDate: now
 */
	System.out.println("---Question 2.1---");
	Account[] accArray = new Account[5];
	
	for (int i = 0; i < accArray.length; i++) 
	{ 
		Account acc = new Account(); 
		acc.Email = "Email " + i;
		acc.userName = "User name " + i; 
		acc.fullName = "Full name " + i;
		acc.createDate = LocalDate.now();
		accArray[i] = acc;
	

	System.out.println("Thông tin Account " + i + accArray[i].toString()); // giống với lệnh sysout bên dưới
		
//		System.out.println("Thông tin Account " + i + 
//				" Account_ID = " +accArray[i].Id+ 
//				" , Email = "+accArray[i].Email+
//				" , User_Name = "+accArray[i].userName+
//				" , Full_Name = "+accArray[i].fullName+
//				" , Create_Date = "+accArray[i].createDate);	
	
	}
}
}
