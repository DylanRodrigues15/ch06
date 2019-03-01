package textbookexamples;
/**
 * @author Dylan Rodrigues
 * Program prints out a table of medal winner counts with row totals
 */
public class Medals {

	public static void main(String[] args) {
		final int COUNTRIES = 7;
		final int MEDALS = 3;
		String[] countries = 
			{
					"Canada",
					"Qin",
					"Germany",
					"SK",
					"Japan",
					"Rus",
					"US",
			};
		int[][] counts = 
			{
					{1, 0, 1},
					{1, 1, 1},
					{0, 0, 1},
					{1, 0, 0},
					{0, 1, 1},
					{0, 1, 1},
					{1, 1, 0},
			};
		System.out.println("       Country     Gold  Silver Bronze  TOTAL");
		
		for (int i = 0; i < COUNTRIES; i++)
		{
			System.out.printf("%15s", countries[i]);
			int total = 0;
			
			for (int j = 0; j < MEDALS; j++)
			{
				System.out.printf("%8d", counts[i][j]);
				total = total + counts[i][j];
			}
			System.out.printf("%8d\n", total);
		}
	}

}
