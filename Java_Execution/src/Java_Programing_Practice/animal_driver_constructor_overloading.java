package Java_Programing_Practice;

public class animal_driver_constructor_overloading {

public static void main(String[] args) {
	animal_ a1 = new animal_("Dog");	
	animal_ a2 = new animal_("Cat", "Siamese");
	animal_ a3 = new animal_("Parrot", "Macaw", "Green");
	
	System.out.println(a1.name);
	
	System.out.println(a2.name);
	System.out.println(a2.breed);
	
	System.out.println(a3.name);
	System.out.println(a3.breed);
	System.out.println(a3.color);
}        

	}
