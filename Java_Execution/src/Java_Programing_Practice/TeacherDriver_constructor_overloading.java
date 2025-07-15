package Java_Programing_Practice;
		
		    	public class TeacherDriver_constructor_overloading {
		    	    public static void main(String[] args) {
		    	        // Using first constructor
		    	        teacher_ t1 = new teacher_(25);

		    	        // Using second constructor
		    	        teacher_ t2 = new teacher_(30, 5.9);

		    	        // Using third constructor
		    	        teacher_ t3 = new teacher_("Alice", 28, 5.6);

		    	        // Display the details
		    	        System.out.println(t1.age);
		    	        
		    	        System.out.println(t2.age);
		    	        System.out.println(t2.height);
		    	       
		    	        System.out.println(t3.name);
		    	        System.out.println(t3.age);
		    	        System.out.println(t3.height);
		    	       
		    	    }
		    	}
