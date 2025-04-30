package Day12;

public class MethodOverLoading {

	public MethodOverLoading() {
		System.out.println("empty");
	}
	
	public MethodOverLoading(int num) {
		System.out.println(num);
	}
	
	public MethodOverLoading(String name) {
		System.out.println(name);
	}
	
	public MethodOverLoading(int num,String name) {
		System.out.println(num);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		MethodOverLoading person= new MethodOverLoading() ;
		System.out.println(10);
			
		
	}
}
