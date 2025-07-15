package Java_Programing_Practice;

public interface Switch {
	void on();
	void off();
}

class Fan implements Switch {
	@Override
	public void on () {
		System.out.println("Fan is on");		
		}
	@Override
	public void off() {
		System.out.println("Fan is off");
	}
}

