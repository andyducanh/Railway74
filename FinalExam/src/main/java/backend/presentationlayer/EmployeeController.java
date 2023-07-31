package backend.presentationlayer;


import backend.businesslayer.EmployeeService;
import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import utils.JDBCUtils;

public class EmployeeController {
      private EmployeeService employeeService; public EmployeeController() throws FileNotFoundException, IOException { employeeService = new EmployeeService();
      }
      public List<Employee> getListEmployees() throws ClassNotFoundException, SQLException {
// validation TODO
            return employeeService.getListEmployees();
      }
}
