
//Name - Zachary Gold
//Date -
//Class - AP Comp Sci A
//Lab  - FunHouse

import java.lang.System;
import java.lang.Math;

public class FunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum = 0; 
		for (int i = start; i<stop; i++)
		{
			sum += numArray[i];
		}
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
		for (int item : numArray)
		{
			if (item==val)
			{
				count++;
			}
		}
		return count;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		int count = 0;
		for (int item : numArray)
		{
			if (item==val)
			{
				count++;
			}
		}
		
		int[] newArray = new int[numArray.length - count];
		
		int place = 0;
		for (int i=0; i<numArray.length; i++)
		{
			if(numArray[i] != val)
			{
				newArray[place] = numArray[i];
				place ++;
			}
		}
		return newArray;
	}
}