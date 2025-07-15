package Practice;

public class switchCaseTest {


	public static void main(String[] args) {
		String days = "Monday";
		int number = 10;
		
		switch (days) {
		
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday": 
			System.out.println("Thursday");
			break;
		case "Friday": 
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Week Days are invalid");
			
		}		
	}
}

//The switch statement is Java’s multiway branch statement. It provides an
//easy way to dispatch execution to different parts of your code based on the
//value of an expression. As such, it often provides a better alternative than
//a large series of if-else-if statements. 
