package Practice;

public class forTest {

	public static void main(String[] args) {
		int i = 15;
		int a;
		int b = i;
		for (i=1;i>=15;i++); {
			System.out.println("For loop working as expected");
		}
		
		for (a=1;b>i;a++);{
			System.out.println("For loop is not working as expected");
		}
	}
}
