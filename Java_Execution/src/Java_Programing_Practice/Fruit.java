package Java_Programing_Practice;

public class Fruit {
	String name;
	String color;
	Fruit (String name, String color){
		this.name=name;
		this.color=color;
	}
}

class Apple extends Fruit {
	Apple (String name, String color){
		super (name, color);	
	}	
}

class Mango extends Fruit {
	Mango (String name, String color){
		super (name,color);
	}
}

class Orange extends Fruit {
	Orange (String name, String color){
		super (name, color);
	}
}
