package Java_Programing_Practice;

public class Book {
	String Name;
	String Author;
	Double Price;
	
	Book (String Name){
		this.Name=Name;
		System.out.println ("Name");
	}
		
	Book (String Name, String Author){
			this (Name);
			this.Author=Author;
			System.out.println ("Author");
	}		
	Book (String Name, String Author, double Price){
		this (Name, Author);
		this.Price=Price;
		System.out.println ("Name,Author, Price");
	}
	}
