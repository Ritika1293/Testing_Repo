package Java_Programing_Practice;

abstract class Office {
	abstract public void createNewFile();
}

class Word1 extends Office {
	@Override
	public void createNewFile() {
System.out.println("Word File Created");	
	}	
}

class Excel1 extends Office{
	@Override
	public void createNewFile () {
		System.out.println("Excel file created");
	}
}