package TestingSystem_Assignment_4_com.vti.entity;
import java.time.LocalTime;


public class Group {
	private int Id;
	private String groupName;
	private Account creatorID;
	private LocalTime JoinDate;
	private Account[] Accounts;

	
	public int getId() {
		return Id;
	}

	public String getGroupName() {
		return groupName;
	}

	public Account getCreatorID() {
		return creatorID;
	}

	public LocalTime getJoinDate() {
		return JoinDate;
	}

	public Account[] getAccounts() {
		return Accounts;
	}
	
	
	
	
	
	
	
	
}

