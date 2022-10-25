import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	String input1,input2;
    String data;
    
    BloodData bd;
    
    System.out.print("Enter blood type of patient: ");
		input1 = sc.nextLine();
        
    System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = sc.nextLine();
        
   	data = input1 + input2;
        
        if(data.isEmpty()){
            bd = new BloodData();
            bd.display();
        }
        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){
            bd = new BloodData();
            bd.setBloodType(input1);
           	bd.setrhFactor(input2);
           	bd.display();
        }
        else{
            System.out.println("Invalid Blood Type!");
        }
        sc.close();
    }
}
