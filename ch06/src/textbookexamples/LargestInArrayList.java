package textbookexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestInArrayList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Double> inputs = new ArrayList<Double>();
		
		//READ INPUTS
		while (in.hasNextDouble())
		{
			inputs.add(in.nextDouble());
		}
		//FIND LARGEST INPUT
		double largest = inputs.get(0);
		for (int i = 0; i < inputs.size(); i++)
		{
			if (inputs.get(i) > largest)
			{
				largest = inputs.get(i);
			}
		}
		//print all elements
		for (double element : inputs)
		{
			System.out.print(element);
			if (element == largest)
			{
				System.out.print(" <=== largest");
			}
			System.out.println(); //puts each element on a new element
			
		}
	}

}
