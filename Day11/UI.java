package Day11;
import java.util.Scanner;
public class UI {
	public static void main(String []args){
    	 
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("Enter the First number");
    	 int number1=sc.nextInt();
    	 System.out.println("Enter the First number");
    	 int number2=sc.nextInt();
    	 
    	 
    	 calculator calc=new calculator();
    	 calc.add(number1,number2);
    	 
    	 
    	
    	 calc.sub(number1,number2);
    	 
    	 
    	
    	 calc.mul(number1,number2);
    	 
     }
}
