package TestingManagement;
import java.time.LocalTime;
public class Account {
	int Id;
	String Email;
	String UserName;
	String FullName;
	Deparment DepartmentId;
	Position PositionId;
	LocalTime CreateDate;
	Group[] groups;
}