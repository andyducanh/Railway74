package TestingSystem_Assignment_2_Data;

import java.time.LocalTime;


public class Account {
	public int Id;
	String Email;
	public String userName;
	public String fullName;
	public Deparment departmentId;
	public Position positionId;
	public LocalTime createDate;
	public Group[] groups;

	
	@Override
	public String toString() {
		return "Account [Account_ID =" +Id+ ", Email ="+Email+", User_Name ="+userName+
				", Full_Name ="+fullName+", Department_ID ="+departmentId+
				", Position_ID ="+positionId+", Create_Date ="+createDate+"]";
	}
	
	public 	String getEmail() {
		return Email;
	}
		

}
