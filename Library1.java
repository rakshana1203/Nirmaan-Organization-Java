package Day14;

public class Library1 {
 
	int id;
	String bookName;
	double price;
	String authorName;
	
	public static void main(String[] args) {
		Library1 li1 = new Library1();
		li1.bookName="aa";
		li1.id=1;
		li1.authorName="rex";
		li1.price=200;
		
		
		
		Library1 li2 = new Library1();
		li2.bookName="bb";
		li2.id=2;
		li2.authorName="saff";
		li2.price=300;
		
		Library1 li3 = new Library1();
		li3.bookName="cc";
		li3.id=3;
		li3.authorName="don";
		li3.price=350;
		
		
		Library1 li4 = new Library1();
		li4.bookName="dd";
		li4.id=4;
		li4.authorName="tom";
		li4.price=400;
		
		
		
		
		
		System.out.println(li1.price);
		System.out.println(li1.authorName);
		System.out.println(li1.bookName);
		System.out.println(li1.id);
		System.out.println();
		
		
		System.out.println(li2.authorName);
		System.out.println(li2.price);
		System.out.println(li2.bookName);
		System.out.println(li2.id);
		System.out.println();
		
		System.out.println(li3.authorName);
		System.out.println(li3.price);
		System.out.println(li3.bookName);
		System.out.println(li3.id);
		System.out.println();
		
		System.out.println(li4.authorName);
		System.out.println(li4.price);
		System.out.println(li4.bookName);
		System.out.println(li4.id);
		
	}
}
