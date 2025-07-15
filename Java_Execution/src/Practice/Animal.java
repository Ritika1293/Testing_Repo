package Practice;

public class Animal { // parent class or base class or super class
    public void eat() {
        System.out.println("Eat Veg");
    }
}

class Horse extends Animal { // child class or subclass or derived class
    public void run() {
        System.out.println("Run super fast");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Horse h = new Horse();  // create object of subclass
        h.eat();  // inherited from Animal
        h.run();  // from Horse
    }
}

	
	
	


