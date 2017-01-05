
//Name - Zachary Gold
//Date - 9/21/16
//Class - AP Comp Sci A Period 2
//Lab  - Count Pairs

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{
	int count = 0;	
	for (int i = 0; i<str.length()-1; i++)
	{
		char test = str.charAt(i);
		if (test == str.charAt(i+1))
		{
			count++;
		}
	}
		
	return count;
	}
}