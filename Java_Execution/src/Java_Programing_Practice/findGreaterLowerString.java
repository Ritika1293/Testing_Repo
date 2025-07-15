package Java_Programing_Practice;

public class findGreaterLowerString {

	public static void main(String[] args) {
		
		        String s = "Welcome to automation";
		        int lower = 0;
		        int upper = 0;
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            if (ch >= 'A' && ch <= 'Z') {
		                upper = upper + ch;
		                upper++;
		            } else if (ch >= 'a' && ch <= 'z') {
		                lower = lower + ch;
		                lower++;
		            }
		       
		    System.out.println(lower);
		    System.out.println(upper);
		    System.out.println("Lower Case Letters :"+ lower);
		    System.out.println("Upper Case Letters :" + upper);
		}
		
	}
}

