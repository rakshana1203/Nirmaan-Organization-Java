package Day7;

import java.util.Scanner;

public class Iteration {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number i:");
		int iterationI = sc.nextInt();
		System.out.println("Enter the number j:");
		int iterationJ = sc.nextInt();
		
		for(int i=1; i<=iterationI; i++ ) {
			System.out.println("iteration of I:"+i);
			for(int j=1; j<=iterationJ; j++ ) {
				System.out.println("iteration of J:"+j);}
		}
		
	
	}
}
