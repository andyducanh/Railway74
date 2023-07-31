package backend.datalayer;


import entity.Employee;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public interface IEmployeeRepository {
public List<Employee> getListEmployees() throws ClassNotFoundException, SQLException;
}
