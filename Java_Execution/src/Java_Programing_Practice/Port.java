package Java_Programing_Practice;

public interface Port {
	void connect();
	void disconnect ();
}

class chargerport implements Port{
	@Override
	public void connect() {
		System.out.println("Connected");
	}
	@Override
	public void disconnect () {
		System.out.println("Disconnected");
	}
}