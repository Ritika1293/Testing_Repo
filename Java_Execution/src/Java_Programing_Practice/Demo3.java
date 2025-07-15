package Java_Programing_Practice;

public class Demo3 {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());	
		}
		catch (Exception e ) {
			System.out.println("It is null");
			
		}
	}
}
