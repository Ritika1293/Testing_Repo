package Java_Programing_Practice;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Hi");
		
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
		System.out.println(c);
		}
		catch (Exception e ) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Bye");
		
	}

}
