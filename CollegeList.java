package PeopleInSchool;
import java.util.*;
public class CollegeList {

  public static void main(String[] args) { //Main Method
      
  Scanner scanner = new Scanner(System.in);
    
    Student st = new Student();
    Employee emp = new Employee();
    Faculty fac = new Faculty();
      
    //Start
      System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
      String user = scanner.nextLine();

    //Employee
      if (user.equalsIgnoreCase("E")) {
          System.out.println("Type Employee's name, Contact number, Salary, and Department."
                  + "\n" + "Press Enter every input");
          emp.callEmployee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.next());
      } 
    
    //Student
    else if (user.equalsIgnoreCase("S")) {
          System.out.println("Type Student's name, Contact number , Program, and Year Level."
                  + "\n" + "Press Enter every input");
          st.callStudent(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
      } 

    //Faculty
    else if (user.equalsIgnoreCase("F")) {
          String stat;
          System.out.println("Press Y if Regular/Tenured and N if not");
          stat = scanner.nextLine();
          
      if (stat.equalsIgnoreCase("Y")) {
              fac.isRegular = true;
          System.out.println("Type Employee's name, Contact number, Salary, and Department."
                + "\n" + "Press Enter every input");
          fac.CallFaculty(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.next());
        } 
    else if (stat.equalsIgnoreCase("N")) {
              fac.isRegular = false;
          System.out.println("Type Employee's name, contact number, salary, and department."
                + "\n" + "Press Enter every input");
          fac.CallFaculty(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.next());
      }
    
    //Error Message for Faculty Status
    else{
          System.out.println("Invalid Input! Please Try Again");
          scanner.close();
      }
      }
    
    //Error Message for Start
    else {
        System.out.println("Invalid Input!");
      }
  }
}