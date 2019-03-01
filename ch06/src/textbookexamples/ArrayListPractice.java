package textbookexamples;

import java.util.ArrayList;


public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Emily");
		names.add("Rajesh");
		names.add("Chhatrapati Shivaji");
		names.add("Jalaluddin Akbar");
		/**
		String name = names.get(3);
		System.out.println(name);
		System.out.println(names.size());
		names.set(3,  "Bajirao Peshwa");
		name = names.get(3);
		System.out.println(name);
		**/
		System.out.println(names);
		System.out.println(reverse(names));
		
	}
	
	public static ArrayList<String> reverse(ArrayList<String> naamo)
	{
		//Allocate a list to hold the method result
		ArrayList<String> result = new ArrayList<String>();
		
		//Traverse the names list in reverse order, starting with the last element
		for (int i = naamo.size() - 1; i >= 0; i--)
		{
			//Add each name to the result
			result.add(naamo.get(i));
			
		}
		return result;
	}

}
