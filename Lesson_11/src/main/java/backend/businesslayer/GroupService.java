package backend.businesslayer;

import backend.datalayer.GroupRepository;
import entity.Group;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class GroupService {

  private GroupRepository repository;

  public GroupService() {
    repository = new GroupRepository();
  }

  public List<Group> getListGroups() throws ClassNotFoundException,
      SQLException, IOException {
    // logic service
    return repository.getListGroups();
  }
}
