package Java_Programing_Practice;

import java.util.Objects;

public class Student4{
	String name;
	int id;
	int age;
	
	Student4 (String name, int id, int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
		
	@Override
	public int hashCode() {
		int res=Objects.hash (name,id,age);
		return res;
	}
}
