package frontend;

import backend.presentationlayer.GroupController;

import entity.Group;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Program {

  public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
    GroupController groupController = new GroupController();
    List<Group> lstGroup = groupController.getListGroups();
    System.out.println(lstGroup.size());
  }
}
