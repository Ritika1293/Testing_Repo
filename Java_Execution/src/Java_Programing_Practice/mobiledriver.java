package Java_Programing_Practice;

public class mobiledriver {
	public static void main(String[] args) {
		mobile m=new mobile ("Realme", 2, 15000);
		System.out.println(m.Brand);
		System.out.println(m.ram);
		System.out.println(m.price);
		
		iphone i=new iphone ("Redmi", 4, 20000, 42);
		System.out.println(i.Brand);
		System.out.println(i.ram);
		System.out.println(i.price);
		System.out.println(i.processor);
	}
}
