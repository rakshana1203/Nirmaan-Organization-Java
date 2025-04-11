package Day3;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");

		int num1 = sc.nextInt();
		System.out.println("Enter the first number:");
		int num2 = sc.nextInt();

		System.out.println("Addition of: " + (num1 + num2));

		System.out.println("Substraction: " + (num1 - num2));

		System.out.println("Multiplication: " + (num1 * num2));

		System.out.println("Division: " + (num1 / num2));
		
		System.out.println("Modulus: "+(num1 % num2));	
		
		System.out.println("Relatinal Operations:");
		
		System.out.println(num1 > num2);

	}
}
