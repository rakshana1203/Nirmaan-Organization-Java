package Day9;
import java.util.Scanner;
public class While {
     public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
 	    boolean isCorrect=true;
    	 while(isCorrect) {
    	 System.out.println("simple calculator");
 		
 		System.out.println("Enter the frist number:");
 		int num1=sc.nextInt();
 		
 		System.out.println("Enter the second number:");
 		int num2=sc.nextInt();
 		
 		System.out.println("Enter the key:");
 		int key=sc.nextInt();
 
 		
 		switch (key) {
 		case 1:{
 			System.out.println("Addition is: "+ (num1+num2));
 			break;
 		}
 		case 2:{
 			System.out.println("Subtraction is: "+(num1-num2));
 			break;
 		}
 		case 3:{
 			System.out.println("multiplication is : "+(num1*num2));
 			break;
 			}
 		case 4:{
 			System.out.println("division is: "+(num1/num2));
 			break;
 		}
 		case 5:{
 			isCorrect=false;
 				System.out.println("Nandri");
 			
 			break;
 		}
 		default :{
 			System.out.println("invalid");
 		}
 		}
     }}
}
