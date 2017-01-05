
//Name - Zachary Gold
//Date - 9/21/16
//Class - AP Comp Sci A Period 2
//Lab  - Loop Stats

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public void loopStatsGo()
	{
		System.out.println("even count " + getEvenCount());
		System.out.println("odd count " + getOddCount());
		System.out.println("total " + getTotal());
		System.out.println(" ");
	}

	public void loopStats(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int i = start; i<=stop; i++)
		{
			if (i%2==0)
			{
				evenCount++;
			}
		}
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int i = start; i<=stop; i++)
		{
			if (i%2!=0)
			{
				oddCount++;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int i = start; i<=stop; i++)
		{
			total+=i;
		}
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;	
	}
}