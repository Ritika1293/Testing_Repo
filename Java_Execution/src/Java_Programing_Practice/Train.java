package Java_Programing_Practice;
public class Train {
	String name;
	int no;
	String boarding;
	String destination;
	
	Train (String name, int no, String boarding, String destination){
		this.name=name;
		this.no=no;
		this.boarding=boarding;
		this.destination=destination;
	}

}

class Netravatiexpress extends Train{

	Netravatiexpress(String name, int no, String boarding, String destination) {
		super(name, no, boarding, destination);
	}
}
