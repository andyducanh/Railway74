package entity;

public class Manager extends User {
  private int ExpInYear;

  public Manager() {
  }

  public Manager(int id, String full_name, String email, String password, int project_id,
      String role,
      int expInYear) {
    super(id, full_name, email, password, project_id, role);
    ExpInYear = expInYear;
  }

  public int getExpInYear() {
    return ExpInYear;
  }

  public void setExpInYear(int expInYear) {
    ExpInYear = expInYear;
  }

  @Override
  public String toString() {
    return "Manager{" +
        "ExpInYear=" + ExpInYear +
        ", id=" + id +
        ", full_name='" + full_name + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", project_id=" + project_id +
        ", role='" + role + '\'' +
        '}';
  }
}
