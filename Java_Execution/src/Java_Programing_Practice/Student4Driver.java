package Java_Programing_Practice;

public class Student4Driver {
	public static void main(String[] args) {
		Student4 s1=new Student4 ("Pinku", 1, 20);
		Student4 s2=new Student4 ("Pinki", 2, 25);
		Student4 s3=new Student4 ("Pinku", 1, 20);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
