package Java_Programing_Practice;

public class ElectricDevice_Super_call {
	String name;
	double volt;
	ElectricDevice_Super_call (String name,double volt){
		this.name=name;
		this.volt=volt;
	}
}

class AC extends ElectricDevice_Super_call {
	double ton;
	AC (String name,double volt, double ton){
		super (name,volt);
		this.ton=ton;
	}
}

class Refrigerator extends ElectricDevice_Super_call {
	int noOfdoors;
	Refrigerator (String name,double volt, int noOfdoors){
	super (name,volt);
	this.noOfdoors=noOfdoors;
	
}
}

