package Practice;

public class thisKeyTest {
	int a=15; //instance variable

	public void show() {
		// TODO Auto-generated method stub
		
		double a=10.5; // local variable (shadows instance variable)
		System.out.println("Value of A :"+a); // local 
		System.out.println("Value of A :"+this.a); // instance
		
	}
	public static void main(String[] args) {
		
		thisKeyTest object = new thisKeyTest ();
			object.show();
		}

	}


//The above program code will display “Value of A is : 10.5”, because
//the preference will always go to local variable or the variable with immediate scope.

//The above statement will display “Value of A is: 15”, because the
//reference “this” will point to current instance variable “a” of the class
