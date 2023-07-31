package entity;

public class User {

  protected int id;
  protected String full_name;
  protected String email;
  protected String password;
  protected int project_id;
  protected String role;

  public User() {
  }

  public User(int id, String full_name, String email, String password, int project_id, String role) {
    this.id = id;
    this.full_name = full_name;
    this.email = email;
    this.password = password;
    this.project_id = project_id;
    this.role = role;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFull_name() {
    return full_name;
  }

  public void setFull_name(String full_name) {
    this.full_name = full_name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }



  public int getProject_id() {
    return project_id;
  }

  public void setProject_id(int project_id) {
    this.project_id = project_id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", full_name='" + full_name + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", project_id=" + project_id +
        ", role='" + role + '\'' +
        '}';
  }
}