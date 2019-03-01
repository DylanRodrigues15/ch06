package textbookexamples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		final int LENGTH = 10;
		double[] values = new double[LENGTH];
		int currentSize = 0;
		//Read inputs
		System.out.println("Please enter values, press Q to quit: ");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble());
		{
			//Grow array if filled
			if (currentSize >= values.length)
			{
				values = Arrays.copyOf(values, 2 * values.length);
			}
			
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		
		//Find largest input
		
		double largest = values[0];
		for (int i = 0; i < currentSize; i++)
		{
			if (values[i] > largest)
			{
				largest = values[i];
			}
		}
		
		for (int i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			if (values[i] == largest)
			{
				System.out.println(" <=== largest");
				
			}
			System.out.println();
		}
		
		

		
	}

}



