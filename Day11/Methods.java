package Day11;

public class Methods {
     String name;
     long phoneNum;
     double salary;
     
     void empDetails(){
    	 System.out.println("Employee name:" + name);
    	 System.out.println("Employee phoneNo:" +phoneNum);
    	 System.out.println("Employee salary:" +salary);
     }
	
	
	public static void main(String[] args) {
		Methods emp= new Methods();
		emp.name="raks";
		emp.phoneNum=9876543210l;
		emp.salary=60000;
		emp.empDetails();
		
		
		Methods emp1= new Methods();
		emp1.name="rash";
		emp1.phoneNum=9876543210l;
		emp1.salary=60000;
		emp1.empDetails();
		
	}
}
