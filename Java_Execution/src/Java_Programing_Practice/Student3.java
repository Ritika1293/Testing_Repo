package Java_Programing_Practice;

public class Student3 {
	String name;
	int id;
	Student3 (String name, int id){
		this.name=name;
		this.id=id;
	}
		@Override
		public String toString(){
			return name+" "+id;
	}
}