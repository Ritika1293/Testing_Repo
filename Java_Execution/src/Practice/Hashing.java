package Practice;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        HashSet <Integer> set = new HashSet<>();
		        set.add(1);
		        set.add(2);
		        set.add(3);
		        set.add(1);
		       
		       if (set.contains(1)){
		           
		        System.out.println("Set contain 1");
		    }
		     if (!set.contains(6)){
		         System.out.println("Set does not contain 6");
		     }
		     
		     set.remove(1);
		     if (!set.contains(1)){
		         System.out.println("I deleted 1");
			     System.out.println("I deleted 2");
		     }
		     System.out.println ("size of element is : "+ set.size());
		
	}

}
