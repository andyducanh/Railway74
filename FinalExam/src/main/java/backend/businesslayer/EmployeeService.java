package backend.businesslayer;


import backend.datalayer.EmployeeRepository;
import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class EmployeeService implements IEmployeeService {

  private EmployeeRepository repository;
  public EmployeeService() throws FileNotFoundException, IOException {
    repository = new EmployeeRepository();
  }
  public List<Employee> getListEmployees() throws ClassNotFoundException, SQLException {
// logic service
    return repository.getListEmployees();
  }

}

