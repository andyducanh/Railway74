package backend.businesslayer;

import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
  public List<Employee> getListEmployees() throws ClassNotFoundException, SQLException;
}
