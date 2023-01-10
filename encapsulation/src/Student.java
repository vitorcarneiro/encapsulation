public class Student {
  String name;
  int age;

  private String cpf;
  private String email;

  String university;
  Course course;
  boolean isBlocked = false;

  void blockStudent() {
    this.isBlocked = true;
  }
  
  void setCpf(String newCpf) {
    this.cpf = newCpf;
  }
  void setEmail(String newEmail) {
    this.email = newEmail;
  }
}
