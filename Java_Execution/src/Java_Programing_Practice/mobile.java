package Java_Programing_Practice;

public class mobile {
	String Brand;
	int ram;
	double price;
	mobile (String brand, int ram, double price){
		this.Brand=brand;
		this.ram=ram;
		this.price=price;
	}
}

class iphone extends mobile {
	int processor;
	iphone (String brand, int ram, double price, int processor){
		super (brand, ram, price);
		this.processor=processor;
	}
}

class iphone16 extends mobile {
	String chargingtype;
	String model;
	iphone16 (String brand, int ram, double price,String chargertype, String model){
		super (brand, ram, price);
		this.chargingtype=chargingtype;
		this.model=model;
	}
}
