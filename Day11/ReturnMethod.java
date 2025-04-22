package Day11;

public class ReturnMethod {
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	
	
	public static void main(String []args){
		ReturnMethod calc= new ReturnMethod();
		int total=calc.add(10, 10);
		System.out.println("total is:" +total);
	}
}
