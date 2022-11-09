package PeopleInSchool;
class Faculty extends Employee {

  private boolean status;
  boolean isRegular;
 
  boolean status() {
      if (isRegular == true) {
          return status = true;
      }if (isRegular == false) {
          return status = false;
      }
      return status;
  }

  void CallFaculty(String name, String contactNum, double salary, String department) {

      setName(name);
      setContactNum(contactNum);
      setDepartment(department);
      setSalary(salary);

      System.out.println("----------------------------");
      System.out.println("Name          : " + getName());
      System.out.println("Contact Number: " + getContactNum());
      System.out.println("Salary        : " + getSalary());
      System.out.println("Department    : " + getDepartment());
      
      
      if (status() == true) {
          System.out.println("Status        : Regular/Tenured");
      } 
      else if (status() == false) {
          System.out.println("Status        : Not Regular/Tenured");
      }
  }
}