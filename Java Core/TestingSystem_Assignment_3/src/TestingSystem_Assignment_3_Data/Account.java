package TestingSystem_Assignment_3_Data;

import java.time.LocalDate;

public class Account {
		public int Id;
		public String Email; 
		public String userName; 
		public String fullName; 
		public LocalDate createDate; 
		
@Override
	public String toString() {
		return " Account [Account_ID =" +Id+ 
				" , Email ="+Email+
				" , User_Name ="+userName+
				" , Full_Name ="+fullName+
				" ,  Create_Date ="+createDate+"]";
		}

}
