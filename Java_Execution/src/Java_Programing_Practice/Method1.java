package Java_Programing_Practice;

public class Method1 {
	public static void m1() {
		int i=10;
		int j=0;
		System.out.println(i/j);	
	}

	public static void main(String[] args) {
	try {
		m1();
	}
	catch (Exception e) {
		System.out.println("Exeption object propagation");
	}
	}
}
