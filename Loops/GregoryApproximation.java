/**
 * 
 * @author zachary.gold
 * 9/16/16
 */

public class GregoryApproximation {
	public static double calculate(int n)
	{
		double piApprox = 1;
		int s = 1;
		for (double i = 3.0; i < n; i+=2)
		{
			if (s%2 == 0)
			{
				piApprox += (1/i); 
			}
			else {
				piApprox -= (1/i);
			}
			s++;
		}
		double pi = piApprox * 4;
		return pi;
	}
	
}
