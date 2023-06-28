package TestingSystem_Assignment_4_com.vti.entity;

import java.time.LocalDate;

public class Account {
	private Integer Id;
	private String Email;
	public String userName;
	public String firstName;
	public String lastName;
	private String fullName;
	private Integer departmentId;
	private Integer positionId;
	private LocalDate createDate;
	private Group[] groups;

	
	public Account() {      // Hàm khởi tạp mặc định và không truyền gtri gì cả
	this.Id = 1;			// this. để set cái gia trị mặc định từ null thành các gtri khác
	this.departmentId = 1;
		
		
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [Account_ID =" +Id+ ", Email ="+Email+", User_Name ="+userName+
				", First_Name ="+firstName+", Last_Name ="+lastName+
				", Full_Name ="+fullName+", Department_ID ="+departmentId+
				", Position_ID ="+positionId+", Create_Date ="+createDate+"]";
	}
	
	public 	String getEmail() {
		return Email;
	}

	public Group[] getGroups() {
		return groups;
	}





	public String getUserName() {
		return userName;
	}





	
		

}
