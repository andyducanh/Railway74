package backend.presentationlayer;

import backend.businesslayer.GroupService;
import entity.Group;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;



public class GroupController {

  private GroupService groupService;

  public GroupController() {
    groupService = new GroupService();
  }

  public List<Group> getListGroups() throws ClassNotFoundException,
      SQLException, IOException {
    // validation TODO
    return groupService.getListGroups();
  }
}

