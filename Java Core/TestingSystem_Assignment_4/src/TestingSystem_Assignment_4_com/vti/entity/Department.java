package TestingSystem_Assignment_4_com.vti.entity;

public class Department {
	private Integer Id;
	private String Name;
	
	

	public Department() { 
		this.Id = 0;
		this.Name = "Name";

	}

	public int getId() {
		return Id;
	}


	public String getName() {
		return Name;
	}

	//a 
//		public Department() {
//		}
		//b

		@Override
		public String toString() {
			return "Department [Id=" + Id + ", Name=" + Name + "]";
		}
		
		
}

