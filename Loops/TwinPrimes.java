
public class TwinPrimes {
	public static void main (String[] args)
	{
		int count = 0;
		int i = 0;
		boolean prime1 = false;
		boolean prime2 = false;
		while (count<20)
		{
			i++;
			for (int j = 2; j<Math.sqrt(i)+1; j++)
			{
				if (i%j==0)
				{
					prime1 = false;
				}
				else
				{
					prime1 = true;
				}
			}
			if (prime1 == true)
			{
				for (int j = 2; j<Math.sqrt(i+2)+1; j++)
				{
					if ((i+2)%j==0)
					{
						prime2 = false;
					}
					else
					{
						prime2 = true;
					}
				}
			}
			if (prime1 == true && prime2 == true)
			{
				count++;
				System.out.println("Twin Primes: " + i + " " + i+2);
			}
		}
	}
}
