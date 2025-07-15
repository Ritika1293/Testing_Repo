package Java_Programing_Practice;

public class Teacher_constructor_overloading {
	String Name;
	int age;
	int Height;
	Teacher_constructor_overloading (String Name){
		this.Name=Name;
		this.age=age;
		this.Height=Height;
	}
Teacher_constructor_overloading (int age){
	this.age=age;
}
Teacher_constructor_overloading (int age, int Height){
	this.age=age;
    this.Height=Height;
}

Teacher_constructor_overloading (int age , int Height, String Name){
	this.age=age;
	this.Height=Height;
	this.Name=Name;
	
}
}

