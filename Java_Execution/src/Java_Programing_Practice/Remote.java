package Java_Programing_Practice;

abstract class Remote {
	abstract public void on();
	abstract public void off();
}

class ACRemote extends Remote{
	@Override
	public void on() {
		System.out.println("ON");
	}
	public void off() {
		System.out.println("Off");
	}
	
}


