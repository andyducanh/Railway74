package frontend;


import backend.presentationlayer.EmployeeController;
import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
      EmployeeController controller = new EmployeeController();
      List<Employee> Employees = controller.getListEmployees();
      for (Employee Employee : Employees)
      { System.out.println(Employee);
      }
    }
  }


