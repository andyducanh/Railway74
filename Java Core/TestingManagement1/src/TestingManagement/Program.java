package TestingManagement;

import java.time.LocalTime;

import TestingManagement.Position.PositionName;
import TestingManagement.TypeQuestion.TypeName;

public class Program {

	
	public static void main(String[] args) {
		// Logic
		
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
	position1.PositionName = PositionName.DEV;

	Position position2 = new Position();
	position2.Id = 2;
	position2.PositionName = PositionName.TEST;
	
	Position position3 = new Position();
	position3.Id = 3;
	position3.PositionName = PositionName.SCRUM_MASTER;
	
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
	account1.UserName = "ducanh";
	account1.FullName = "Bui Duc Anh";
	account1.DepartmentId = deparment1;
	account1.PositionId = position1;
	account1.CreateDate = LocalTime.now();
	Group[] GroupOfAccount1 = { group1, group2 };
	account1.groups = GroupOfAccount1;
	

	Account account2 = new Account();
	account2.Id = 2;
	account2.Email = "thuhuyen@gmail.com";
	account2.UserName = "thuhuyen";
	account2.FullName = "Nguyen Thu Huyen";
	account2.DepartmentId = deparment2;
	account2.PositionId = position2;
	account2.CreateDate = LocalTime.now();
	Group[] GroupOfAccount2 = { group1, group3 };
	account2.groups = GroupOfAccount2;
	

	Account account3 = new Account();
	account3.Id = 3;
	account3.Email = "namanh@gmail.com";
	account3.UserName = "namanh";
	account3.FullName = "Tran Nam Anh";
	account3.DepartmentId = deparment3;
	account3.PositionId = position3;
	account3.CreateDate = LocalTime.now();
	Group[] GroupOfAccount3 = { group2, group3 };
	account3.groups = GroupOfAccount3;
	
	// Create Account Of Group
	
	Account[] AccountOfGroup1 = { account1, account2 };
	group1.accounts = AccountOfGroup1;
	
	Account[] AccountOfGroup2 = { account1, account3 };
	group2.accounts = AccountOfGroup2;
	
	Account[] AccountOfGroup3 = { account2, account3 };
	group3.accounts = AccountOfGroup3;
	
	
	// Create TypeQuestion
	
	TypeQuestion TypeQuestion1 = new TypeQuestion();
	TypeQuestion1.Id = 1;
	TypeQuestion1.TypeName = TypeName.ESSAY;
	
	TypeQuestion TypeQuestion2 = new TypeQuestion();
	TypeQuestion2.Id = 2;
	TypeQuestion2.TypeName = TypeName.MUTIPLE_CHOICE;
	
	TypeQuestion TypeQuestion3 = new TypeQuestion();
	TypeQuestion3.Id = 3;
	TypeQuestion3.TypeName = TypeName.ESSAY;

	// Create CategoryQuestion
	
	
	
	// Create Exam
	
	// Create Question
	
	
	// Create Answer
	
	
	// Cú pháp cách 1 dòng
	System.out.println("\n");
	
	// In ra thông tin Account 
	
	
	System.out.println("Account 1: ");
	System.out.println("id: " + account1.Id);
	System.out.println("Email: " + account1.Email);
	System.out.println("Username: " + account1.UserName);
	System.out.println("FullName: " + account1.FullName);
	System.out.println("Department Name: " + account1.DepartmentId.Name);
	System.out.println("Position Name: " + account1.PositionId.PositionName);
	System.out.println("CreateDate: " + account1.CreateDate);
	
	System.out.println("\n");

	System.out.println("Account 2: ");
	System.out.println("id: " + account2.Id);
	System.out.println("Email: " + account2.Email);
	System.out.println("Username: " + account2.UserName);
	System.out.println("FullName: " + account2.FullName);
	System.out.println("Department Name: " + account2.DepartmentId.Name);
	System.out.println("Position Name: " + account2.PositionId.PositionName);
	System.out.println("CreateDate: " + account2.CreateDate);
	
	System.out.println("\n");
	
	// In ra thông tin Deparment
	
	System.out.println("Deparment 1: ");
	System.out.println("Id: "+ deparment1.Id);
	System.out.println("Name: "+ deparment1.Name);
	
	System.out.println("\n");
	
	System.out.println("Deparment 3: ");
	System.out.println("Id: "+ deparment3.Id);
	System.out.println("Name: "+ deparment3.Name);
	
	System.out.println("\n");
	
	
	}
}
