package Java_Programing_Practice;

public class TextDriver {
	public static void main(String[] args) {
		text t1 = new text ("Hello", ".txt", 4,100);
		System.out.println(t1.name);
		System.out.println(t1.ext);
		System.out.println(t1.size);
		System.out.println(t1.noOfLines);
	}

}
