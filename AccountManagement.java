package Day19;

import java.util.Scanner;

class Account{
	
	private int id;
	private String name;
	private int pin=2424;
	private double balance= 100000;
	
	 
	
	
	/**
	 * @param id
	 * @param name
	 * @param pin
	 * @param balance
	 */
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name+ ", balance=" + balance + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance,int pin) {
		
		if(this.pin==pin) {
			this.balance = balance;
		}else {
			System.out.println("invalid pin");
		}
	}
	 public Account() {
		 
	 }
	
	
	
}

public class AccountManagement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account acc= new Account();
		
		boolean isTrue =true;
		while(isTrue) {
			System.out.println("Enter the 1 for add the details");
			System.out.println("Enter the 2 for update the details");
			System.out.println("Enter the 3 for Show the details");
			System.out.println("Enter the 4 for Exit the details");
			
			int Key=sc.nextInt();
			if(Key==1) {
			System.out.println("Enter the id");
			
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name");
			String name=sc.nextLine();
			acc =new Account(id, name);
			}
			else if (Key==2){
				System.out.println("Enter the id");
				
				int id=sc.nextInt();
				sc.nextLine();
				acc.setId(id);
				System.out.println("Enter the name");
				String name=sc.nextLine();
				acc.setName(name);
				
				System.out.println("Enter the balance amount");
				double amount=sc.nextDouble();
				
				double existBalance= acc.getBalance();
				double total =existBalance -amount;
				
				System.out.println("Enter the pin");
				int pin =sc.nextInt();
				
				acc.setBalance(total,pin);
				
				
				
				
				
			}else if(Key==3) {
				System.out.println(acc);
				
			}else if(Key==4) {
				isTrue=false;
				System.out.println("Thank you");
			}else {
				System.out.println("Enter the correct value");
			}
			
		}
		
		
	}

	
	
	

}
