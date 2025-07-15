package Practice;

public class superKeyTest {
int a = 10;
}

class number extends superKeyTest{
	int a = 12;

public void show() {
		
	System.out.println("Variable value"+super.a);
}

public static void main(String [] args) {
number object = new number();
object.show();
}
}

