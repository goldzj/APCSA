
//Name - Zachary Gold
//Date -
//Class - AP Comp Sci
//Lab  - Odds and Evens

import java.util.Scanner;

public class OddsEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0;
		if (odd) 
		{
			for (int i=0; i < array.length; i++)
			{
				if (array[i] %2 != 0)
				{
					count++;
				}
			}
		}
		else
		{
			for (int i=0; i < array.length; i++)
			{
				if (array[i] %2 == 0)
				{
					count++;
				}
			}
		}	
		return count;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int[] newRay = new int[countEm(array, false)];
		int place = 0;
		for (int i = 0; i<array.length; i++)
		{
			if (array[i] %2 == 0)
			{
				newRay[place] = array[i];
				place++;
			}
		}
		return newRay;
	}

	public static int[] getAllOdds(int[] array)
	{
		int[] newOdd = new int[countEm(array, true)];
		int place = 0;
		for (int i = 0; i<array.length; i++)
		{
			if (array[i] %2 != 0)
			{
				newOdd[place] = array[i];
				place++;
			}
		}
		return newOdd;
	}
}