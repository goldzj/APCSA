package params;

public class ParameterLabs {


	public void arrayTools (int[] arr, int first, int last, int num)
	{
		int sum = 0;
		int n = first;
		while (n<last)
		{
			sum += n;
			n++;
		}
		int count = 0;
		for (int i : arr)
		{
			if (i == num)
				count++;
		}
		
		System.out.println("Sum of " + first + "-" + last + ": "+ sum);
		System.out.println("Count of " + num +"s: " + count);
	}
	
	public void wordPrinter(String word, int num)
	{
		for (int i = 0; i < num; i++)
		{
			System.out.println(word);
		}
	}
	
	public void letterBox(char x, int n)
	{
		for (int i = 0; i<n; i++)
		{
			for (int j =0; j<n; j++)
			{
				System.out.println(x);
			}
			System.out.println();
		}
	}
	
	public void triangleWord(String word)
	{
		int n = word.length();
		int count = 1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < count; j++)
			{
				System.out.println(word.substring(0, count));
			}
		}
	}
	
	public void primes(int number, int start)
	{
		Integer[] primes = new Integer[number];
		int count = 0;
		int number1 = start;
		boolean prime = true;
		while (count <= number1)
		{
			for (int i = 0; i < Math.sqrt((double)number1); i++)
			{
				if (number1 % i == 0)
				{
					prime = false;
				}
			}
			if (prime)
			{
				primes[count] = number1;
				count++;
			}
		}
	}

}

