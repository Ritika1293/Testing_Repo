package Practice;

public class Student {

    String name;
    int age;

    // Constructor 1: No parameters
    public Student() {
        System.out.println("Default Constructor Called");
        name = "Scooby";
        age = 4;
    }

    // Constructor 2: One parameter
    public Student(String n) {
        System.out.println("Constructor with one parameter called");
        name = "Roni";
        age = 4;
    }

    // Constructor 3: Two parameters
    public Student(String n, int a) {
        System.out.println("Constructor with two parameters called");
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(
);
    }

    // Main method to test
    public static void main(String[] args) {
        Student s1 = new Student();                 // calls default constructor
        Student s2 = new Student("Ravi");           // calls constructor with one parameter
        Student s3 = new Student("Priya", 22);      // calls constructor with two parameters

        System.out.println();
        s1.display();
        s2.display();
        s3.display();
    }
}