package Java_Programing_Practice;

public class Demo4 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}


