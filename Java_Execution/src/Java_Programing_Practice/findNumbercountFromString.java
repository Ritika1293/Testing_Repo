package Java_Programing_Practice;

public class findNumbercountFromString {

	public static void main(String[] args) {
		String s = "Welcome to automation";
        
        int lowerCount = 0;
        int upperCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;  // Just increment
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;  // Just increment
            }
        }

        System.out.println("Lowercase count: " + lowerCount);
        System.out.println("Uppercase count: " + upperCount);
    }
}





        
        

