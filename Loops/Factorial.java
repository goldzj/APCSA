//Name - Zachary Gold
//Date - 9/22/16
//Class - AP CompSci A Period 2
//Lab  - Factorial

public class Factorial
{
	private int number;

	public Factorial()
	{
		number = 0;
	}

	public Factorial(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}

	public int getNum()
	{
		return number;
	}

	public long getFactorial( )
	{
		long factorial=1;
		for (int i = 2; i<=number; i++)
		{
			factorial *= i;
		}
		return factorial;
	}

	public String toString()
	{
		return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
	}
}