package entity;

public class Employee extends User{
private String ProSkill;

  public Employee(String proSkill) {
  }

    public Employee(int id, String full_name, String email, String password, int project_id,
      String role, String proSkill) {
    super(id, full_name, email, password, project_id, role);
    ProSkill = proSkill;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "ProSkill='" + ProSkill + '\'' +
        ", id=" + id +
        ", full_name='" + full_name + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", project_id=" + project_id +
        ", role='" + role + '\'' +
        '}';
  }
}
