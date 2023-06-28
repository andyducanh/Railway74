package TestingSystem_Assignment_4_com.vti.backend;

import java.util.Scanner;

import TestingSystem_Assignment_4_com.vti.entity.Account;
import TestingSystem_Assignment_4_com.vti.entity.Department;
//import TestingSystem_Assignment_4_com.vti.entity.Department;

public class Excercise1_Constructor {
public static void main(String[] args) {
/**
	 * Question 1:
	Tạo constructor cho department: 
	a) không có parameters 
	b) Có 1 parameter là nameDepartment 
	và default id của Department = 0 
	Khởi tạo 1 Object với mỗi constructor ở trên
*/
	//a 
			public Department() {
			}
			//b
			public Department(String Name) { 
				this.Id = 0;
				this.Name = Name;
		

				
		
	}
	Department department = new Department(); 
	Department department1 = new Department("department1");
	// hoặc
 department1.Name = "department1";
	
/**
 * Question 2:
Tạo constructor cho Account: 
a) Không có parameters
b) Có các parameter là id, Email, Username, FirstName, LastName 
(với FullName = FirstName + LastName)
c) Có các parameter là id, Email, Username, FirstName, LastName 
(với FullName = FirstName + LastName) và Position của User, default createDate = now
d) Có các parameter là id, Email, Username, FirstName, LastName 
(với FullName = FirstName + LastName) và Position của User, createDate
 */
	
	
	//a 
	public Account() {
	}
		
	//b
	
	public Account(Integer Id, String Email, String userName, String firstName,
					String lastName, String fullName) { 
		this.Id = Id; 
		this.Email = Email;
		this.userName = userName; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.fullName = fullName;
	}
	
	//c
	
	public Account(Integer Id, String Email, String userName, String firstName,String lastName, 
					String fullName,Integer positionId, LocalDate createDate ) { 
		this.Id = Id; 
		this.Email = Email;
		this.userName = userName; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.fullName = fullName;
		this.positionId = positionId;
		this.createDate = LocalDate.now();
	
	//d
		
	public Account(Integer Id, String Email, String userName, String firstName,String lastName, 
				String fullName,Integer positionId, LocalDate createDate ) { 
	this.Id = Id; 
	this.Email = Email;
	this.userName = userName; 
	this.firstName = firstName; 
	this.lastName = lastName; 
	this.fullName = fullName;
	this.positionId = positionId;
	this.createDate = createDate;	
	
	Account account1 = new Account();
	Account account2 = new Account(2, "emai2", "username2", "firstname","lastName", "fullname2");
	
	Position position3 = new Position();
	Account account3 = new Account(3, "emai3", "username3", "fullname3", position3);
	
	Position position4 = new Position();
	Account acc4account4 = new Account(3, "email3", "username3", "fullname3",position4, LocalDate.now());
	
	System.out.println(account1);
	System.out.println(account2);
	System.out.println(account3);
	System.out.println(account4);
	
	
// Set tên trực tiếp	
//Account account = new Account();	
//account.userName = " Duc Anh";     //thay đổi giá trị mặc định của các thành phần trong account
//System.out.println(account);	

// ng dùng nhập vào tên useName
	
//Scanner scanner = new Scanner(System.in);
//System.out.println("Nhập vào dữ liệu người dùng");
//String useNameNhap = scanner.nextLine(); 
//
//Account account1 = new Account();
//Account account2 = new Account();
//Account account3 = new Account();
//
//account1.userName = useNameNhap; 
//
//System.out.println("Thông tin người dùng là: \n"+ account1);
//System.out.println("Thông tin người dùng là: \n"+ account2);
//System.out.println("Thông tin người dùng là: \n"+ account3);



	
//Department department = new Department();	
//
//System.out.println(department);	
	
	
	
	
	
}
}
