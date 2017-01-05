import java.util.Arrays;

//Name - Zachary Gold
//Date -
//Class - AP Comp Sci A
//Lab  - Odds and Evens

public class OddsEvensRunner
{
	public static void main( String args[] )
	{
		int[] firstTest = {2, 4, 6, 8, 10, 12, 14};
		System.out.println("Odds - " + Arrays.toString(OddsEvens.getAllOdds(firstTest)));
		System.out.println("Evens - " + Arrays.toString(OddsEvens.getAllEvens(firstTest)));
		
		System.out.println("\n");
		
		int[] secondTest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Odds - " + Arrays.toString(OddsEvens.getAllOdds(secondTest)));
		System.out.println("Evens - " + Arrays.toString(OddsEvens.getAllEvens(secondTest)));
		
	}
}