package Java_Programing_Practice;

public class flower_driver_constructor_overloading {

	public static void main(String[] args) {
		flower f1 = new flower ("Rose");
		flower f2 = new flower ("Marry gold","Yellow");
		flower f3 = new flower ("Lily","white", "winter");
		
		System.out.println(f1.name);
		
		System.out.println(f2.name);
		System.out.println(f2.color);
		
		System.out.println(f3.name);
		System.out.println(f3.color);
		System.out.println(f3.season);

	}

}
