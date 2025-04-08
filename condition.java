package Day4;
import java.util.Scanner;
public class condition {
	
	public static void main(String []args){
	 
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the your mark:");
	
	int mark = sc.nextInt();
	
//	String result = mark>=35 ? "you are pass" :"you are fail";
//   System.out.println("your result is " +result);
	if(mark >=35 && mark <=100 ) {
		System.out.println("You are pass");
		
		if(mark>=95){
			System.out.println("Grade A++ ");
			System.out.println("you score good mark ");
		}
		else if(mark>=90 ) {
			System.out.println("Grade A");
		}
		else if(mark>=80) {
			System.out.println("Grade B");
		}
		else if(mark>=70) {
			System.out.println("Grade C");
		}
		else  {
			System.out.println("Grade D");
		}
		
	}
	else if(mark<35 && mark>0) {
		System.out.println("You are fail");
	}
	else {
		System.out.println("Mark invalid");
	}
	
		
	
}
	}
