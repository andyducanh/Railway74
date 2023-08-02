package backend.datalayer;

import entity.Group;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.JDBCUtils;


public class GroupRepository {
 JDBCUtils jdbcUtils = new JDBCUtils();
  public List<Group> getListGroups() throws ClassNotFoundException, SQLException, IOException {
    Connection connection = jdbcUtils.getConnection();
    String sqlString = "Select * from `group`";
    Statement stmtStatement = connection.createStatement();
    ResultSet rs = stmtStatement.executeQuery(sqlString);
    List<Group> lstGroups = new ArrayList<Group>();
    while(rs.next()){
      Group group = new Group();
      group.setId(rs.getInt("id"));
      group.setName(rs.getString("name"));
      lstGroups.add(group);
    }
      return lstGroups;
    }
//  private GroupRepository repository;
//
//  public GroupService() {
//    repository = new GroupRepository();
//  }
//

//    // logic service
//    return repository.getListGroups();
//  }
}
