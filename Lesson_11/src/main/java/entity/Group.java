package entity;

public class Group {
  private int id;
  private String name;

  public Group() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Group{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
