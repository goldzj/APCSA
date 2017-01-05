import java.lang.Math;
import java.util.Arrays;

public class Lucky7 {

	public static void main(String[] args)
	{
		int[] test = CreateArray();
		System.out.println("Your array is: " + Arrays.toString(sortArray(test)));
		
	}
	
	public static int[] CreateArray()
	{
		int length = (int)(Math.random() * 10);
		int[] sevens = new int[length];
		for (int i = 0; i<length; i++)
		{
			sevens[i] = (int) (Math.random() * 10);
		}
		return sevens;
	}
	public static int[] sortArray(int[] numArray)
	{
		int[] newRay = new int[numArray.length];
		int count = 0;
		for (int i = 0; i< numArray.length; i++)
		{
			if(numArray[i] == 7)
			{
				count++;
			}
		}
		for (int i = 0; i<count; i++)
		{
			newRay[i] = 7;
		}
		for (int i = 1; i<newRay.length-count; i++)
		{
			if(numArray[i] != 7)
			{
				newRay[count+i] = numArray[i];
			}
		}
		return newRay;
	}
}
