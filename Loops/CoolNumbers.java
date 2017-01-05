
//Name - Zachary Gold
//Date - 9/19/16
//Class - AP Comp Sci A Period 2
//Lab  - CoolNumbers

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		if (num % 3 == 0 && num % 4 == 0 && num % 5 == 0 && num % 6 == 0)
		{
			return true;
		}
		
		return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for (int i = 6; i < stop; i++)
		{
			if(isCoolNumber(i)) {
				count++;
			}
		}
		return count;
	}
}