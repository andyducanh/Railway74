package TestingSystem_Assignment_2_Data;



public class Exercise1_FlowControl {

public static void main(String[] args) {
	/**
	 * Question 1:
	Kiểm tra account thứ 2 
	Nếu không có phòng ban (tức là department == null) 
	thì sẽ in ra text "Nhân viên này chưa có phòng ban"
	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
	 */
	// vd 
	System.out.println("---Check account2---");
	
	if (Account.Account2.departmentId == null) 
	{
	System.out.println("Nhân viên này chưa có phòng ban.");
	} 
	else {
	System.out.println("Phòng ban của nv này là: " + Account.Account2.departmentId.Name);
	}
	
	
	
	
	
	
}
		
}
	
	
	
