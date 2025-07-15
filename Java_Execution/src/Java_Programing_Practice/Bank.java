package Java_Programing_Practice;

abstract class Bank {
	abstract public void Deposit();
	abstract public void Withdraw();
	
}

class SBI extends Bank{
	@Override
	public void Deposit () {
		System.out.println("Deposit Amount");
	}
		@Override
		public void Withdraw () {
		System.out.println("Withdraw Amount");
		}
	}


