package Day15;

public class PracticeStr {
	
	
	public static void main(String[] args) {
		
		String prac = "PracticeJava";
		String prac1 = "PRACTICEJAVA";
		
		boolean isTrue =prac.startsWith("P");
		boolean isHere =prac1.endsWith("a");
		
		
		System.out.println(prac.length());
		System.out.println(prac.charAt(2));
		System.out.println(prac.substring(2));
		System.out.println(prac.substring(2,8));
		System.out.println(prac1.toLowerCase());
		System.out.println(prac.toUpperCase());
		System.out.println(prac.equals(prac1));
		System.out.println(prac.equalsIgnoreCase(prac1));
		System.out.println(prac.contains("a"));
		System.out.println(isTrue);
		System.out.println(isHere);
		
		
		
		
		
		
	}

}
