package backend.datalayer;


import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCUtils;

public class EmployeeRepository implements IEmployeeRepository {

    private JDBCUtils jdbc;
    public EmployeeRepository() throws FileNotFoundException, IOException {
      jdbc = new JDBCUtils();
    }
    public List<Employee> getListEmployees() throws ClassNotFoundException, SQLException {
      List<Employee> employees = new ArrayList<>();
// Create a statement object
      String sql = "SELECT * FROM `Employee`";
// execute query
      ResultSet resultSet = jdbc.executeQuery(sql);
// handling result set
      while (resultSet.next()) {
        Employee employee = new Employee(resultSet.getString("ProSkill"));
        employees.add(employee);
      }
      jdbc.disconnect();
      return employees;
    }
  }
