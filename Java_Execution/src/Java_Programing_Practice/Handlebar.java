package Java_Programing_Practice;

public interface Handlebar{
	void turnleft();
	void press();
	void turnright();
	void holdstraight();
}
	
	interface Horn{
		void release();
	}

	class Bike implements Handlebar, Horn{
		@Override
		public void turnleft() {
			System.out.println("Turn Left");
		}
		@Override
		public void turnright() {
			System.out.println("Turn Right");
		}
		@Override
		public void holdstraight() {
			System.out.println("holdstraight");
		}
		@Override
		public void press() {
			System.out.println("press");	
		}
		@Override
		public void release() {
			System.out.println("release");
			
		}
	}

	

