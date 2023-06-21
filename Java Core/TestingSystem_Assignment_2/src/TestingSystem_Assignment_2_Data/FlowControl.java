package TestingSystem_Assignment_2;


/**
 * Question 1:
Kiểm tra account thứ 2 
Nếu không có phòng ban (tức là department == null) 
thì sẽ in ra text "Nhân viên này chưa có phòng ban"
Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
 */
//Create Deparment


public class FlowControl {	
	
public static void main(String[] args) {
	
	// vd 
	System.out.println("---Check account2---");
	if (account2.departmentId == null) 
	{
	System.out.println("Nhân viên này chưa có phòng ban.");
	} 
	else {
	System.out.println("Phòng ban của nv này là: " +
			account2.departmentId.Name);
	}
}
}
