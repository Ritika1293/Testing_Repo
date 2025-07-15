package Practice;

public class LadderifelseTest {
	public static void main (String[]args) {
		int number = 10;
		
		if (number>50) {
			System.out.println("Print +ve");
		}
		else if(number<50) {
			System.out.println("Print -ve");
		}
		else {
			System.out.println("Print ODD");
		}
	}

}

// The if statements are executed from the top down. As soon as one of the
//conditions controlling the if is true, the statement associated with that if is
//executed, and the rest of the ladder is bypassed. If none of the conditions
//is true, then the final else statement will be executed. The final else acts as Core JAVA 8
//a default condition; that is, if all other conditional tests fail, then the last
//else statement is performed. If there is no final else and all other
//conditions are false, then no action will take place.
