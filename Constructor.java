package Day17;

public class Constructor {

	String EmpName;
	long phoneNumber;
	
	Constructor(String name, long number){
		
		EmpName = name;
		phoneNumber = number;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Constructor c= new Constructor("rakshana",7896783459l) ;
		
		System.out.println(c.EmpName);
		System.out.println(c.phoneNumber);
		
		
	}
}
