package PeopleInSchool;
class Employee extends Person {

    private double salary;
    private String department;
  
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    void callEmployee(String name, String contactNum, double salary, String department) {
        
        setName(name);
        setContactNum(contactNum);
        setSalary(salary);
        setDepartment(department);
        
        System.out.println("----------------------------");
        System.out.println("Name          : " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Salary        : " + getSalary());
        System.out.println("Department    : " + getDepartment());
    }
  }