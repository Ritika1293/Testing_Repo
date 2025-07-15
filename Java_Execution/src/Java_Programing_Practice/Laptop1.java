package Java_Programing_Practice;

public class Laptop1 {
	String brand;
	String processor;
	double price;
	int Ram;
	Laptop1 (String brand, String processor, double price, int Ram){	
		this.brand=brand;
		this.processor=processor;
		this.price=price;
		this.Ram=Ram;
	}
	
	@Override
	public String toString() {
	return brand+" "+processor+" "+price+" "+Ram;
	
}
}

