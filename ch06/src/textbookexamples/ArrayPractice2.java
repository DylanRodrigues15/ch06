package textbookexamples;

import java.util.Arrays;

public class ArrayPractice2 {

	public static void main(String[] args) {
		double[] values = new double[12];
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i * i;
		}
		
		double total = 0;
		for (double element : values)
		{
			total = total + element;
		}
		double average = 0;
		if (values.length > 0)
		{
			average = total / values.length;
		}
		
		System.out.println("The total sum of the values in array is " + total + " and the average is "+ average);
		
		double biggest = values[0];
		double smallest = values[0];
		for (int i = 0; i < values.length; i++)
		{
			if (values[i] > biggest)
			{
				biggest = values[i];
			}
			else if (values[i] < smallest) {
				smallest = values[i];
			}
			
		}
		System.out.println("Smallest value is: " + smallest + " and the largest is: " + biggest);
		System.out.println("values = " + Arrays.toString(values));
		
		double searchValue = 49.0;
		int pos = 0;
		boolean found = false;
		while (pos < values.length && !found)
		{
			if (values[pos] == searchValue)
			{
				found = true;
			}
			else 
			{
				pos++;
			}
		}
		
		if (found) { System.out.println("Found at position " + pos); }
		else { System.out.println("Not found. :("); }
		
		

	}

}
