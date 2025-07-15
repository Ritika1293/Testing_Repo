package Java_Programing_Practice;

public class Product1 {
	String name;
	int price;
	Product1 (String name, int price){
		this.name=name;
		this.price=price;
	}
}

class Sirt extends Product1 {
	int size;
	String color;
	Sirt (String name, int price, int size, String color){
		super (name, price);
		this.size=size;
		this.color=color;
	}
}

