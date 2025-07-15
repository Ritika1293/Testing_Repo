package Java_Programing_Practice;

public class Product {
	double Price;
	String Name;	
}


class Shirt extends Product {
	String Size;
	String Color;
	Shirt (double Price, String Name,String Size, String Color){
		this.Price=Price;
		this.Name=Name;
		this.Size=Size;
		this.Color=Color;
	}
}
