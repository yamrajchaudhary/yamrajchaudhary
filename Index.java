
import java.util.*; 

public class Index { 
	public static void main(String[] args) 
	{ 

		// Declare an empty List of size 5 
		List<String> list = new ArrayList<String>(5); 

		// Add elements to the list 
		list.add("Welcome"); 
		list.add("to"); 
		list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 

		// Index from which you want 
		// to remove element 
		int index = 2; 

		// Initial list 
		System.out.println("Initial List: " + list); 

		// remove element 
		list.remove(index); 

		// Final list 
		System.out.println("Final List: " + list); 
	} 
} 
