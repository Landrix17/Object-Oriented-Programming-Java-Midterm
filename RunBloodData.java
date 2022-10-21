import java.util.*;

public class RunBloodData{
	public static void main(String[] args){

Scanner scs = new Scanner(System.in);
System.out.print("Enter blood type of patient: ");

String input1 = scs.nextLine();

System.out.print("Enter the Rhesus factor (+ or -): ");
String input2 = scs.nextLine();

if(input1.equals("O")){
BloodData bd = new BloodData(input1,input2);

if(input2.equals("+")){
bd.display();

}

else if(input2.equals("-")){
bd.display();
}

else{
System.out.println("You entered wrong input!");
}
}

else if(input1.isEmpty()){
BloodData bd = new BloodData();
if(input2.isEmpty()){
bd.display();

}
else{
System.out.println("You entered wrong input!");
}

}


else if(input1.equals("A") ){
BloodData bd = new BloodData(input1,input2);

if(input2.equals("+")){
bd.display();
}

else if(input2.equals("-")){
bd.display();
}

else{
System.out.println("You entered wrong input!");
}
}

else if(input1.equals("B")){
BloodData bd = new BloodData(input1,input2);
if(input2.equals("+")){
bd.display();
}

else if(input2.equals("-")){
bd.display();
}

else{
System.out.println("You entered wrong input!");
}
}

else if(input1.equals("AB")){
BloodData bd = new BloodData(input1,input2);
if(input2.equals("+")){

bd.display();
}
else if(input2.equals("-")){

bd.display();
}

else{
System.out.println("You entered wrong input!");
}
}


}

}

 