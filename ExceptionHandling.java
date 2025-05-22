package Day_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		try {
			System.out.println("Enter the number");
			int num=sc.nextInt();
			System.out.println("Division Method:");
			System.out.println("Div:"+ (12/num));
			
			
			int arr[]=null;
			System.out.println(arr[5]);
			
			
		}
		catch(ArithmeticException ar){
			System.out.println(ar);
		}
		catch(InputMismatchException in) {
			System.out.println(in);
		}
		catch(Exception e){
		
			System.out.println(e);
		
		}
	}

	
}
