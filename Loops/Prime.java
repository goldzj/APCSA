
//Name - Zachary Gold
//Date - 9/22/16
//Class - AP Comp Sci A Period 2
//Lab  - Prime Number

import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number=0;
	}

	public Prime(int num)
	{
		number=num;
	}

	public void setPrime(int num)
	{
		number=num;
	}

	public boolean isPrime()
	{
		for (int i = 2; i < Math.sqrt(number); i++)
		{
			if (number%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public String toString()
	{
		if(isPrime())
		{
			return "" + number + " is prime.";
		}
		return "" + number + " is not prime.";
	}
}