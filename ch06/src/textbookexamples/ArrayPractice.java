package textbookexamples;

public class ArrayPractice {

	public static void main(String[] args) {
		
		double[] values = new double[10];
		values[5] = 5;
		System.out.println(values[5]);
		System.out.println(values.length);
		
		double m = 1.0;
		for (int i = 0; i < values.length; i++)
		{
			m = m * 2;
			values[i] = m;
			System.out.println(values[i]);
		}
		
		
		

	}

}
