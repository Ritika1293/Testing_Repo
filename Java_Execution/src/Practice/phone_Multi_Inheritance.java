package Practice;

public interface phone_Multi_Inheritance {
	public static void brand() {
		System.out.println("Phone's brand");
	}
}

class Iphone implements phone_Multi_Inheritance {
	public void battery() {
		System.out.println("5000 MAH Battery");
	}
}

class samsumg implements phone_Multi_Inheritance {
	public void color() {
		System.out.println("Phone has color");
	}
}

class MultiInheritance {
	public static void main(String[] args) {
	Iphone ip = new Iphone();
	samsumg s = new samsumg();
	ip.battery();
	s.color();
	
	}
}
		
