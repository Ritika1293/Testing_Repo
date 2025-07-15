package Java_Programing_Practice;

public class Laptop {
	String Brand;
	double Price;
	String Processor;

}

class HP extends Laptop {
	HP (String Brand, double Price,String Processor){
		this.Brand=Brand;
		this.Price=Price;
		this.Processor=Processor;
	}
}