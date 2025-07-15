package Java_Programing_Practice;

public class Product1Driver {
	public static void main(String[] args) {
		Product1 p= new Sirt("Peter England", 1500, 46,"Black");
	System.out.println(p.name);
	System.out.println(p.price);
	
	Sirt s= (Sirt) p;
	System.out.println(s.size);
	System.out.println(s.color);
	
	}
}
