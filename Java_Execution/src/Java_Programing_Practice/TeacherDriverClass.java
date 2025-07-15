package Java_Programing_Practice;

public class TeacherDriverClass {
	public static void main(String[] args) {
		Teacher_constructor_overloading t1= new Teacher_constructor_overloading (30);
		System.out.println (t1.age);

		Teacher_constructor_overloading t2 = new Teacher_constructor_overloading (30,5);
		System.out.println (t2.age);
		System.out.println (t2.Height);

		Teacher_constructor_overloading t3= new Teacher_constructor_overloading (30, 5, "Aparna");
		System.out.println (t3.age);
		System.out.println (t3.Height);
		System.out.println (t3.Name);
	}
}

