import java.util.Arrays;

public class FindNextLargest 
{

	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(nums));
		System.out.println("The next largest value after 5 is " + findIt(nums, 5));
		int[] nums2 = {10, 30, 20, 40, 50, 15};
		System.out.println(Arrays.toString(nums2));
		System.out.println("The next largest value after 12 is " + findIt(nums2, 12));
	}
	
	public static int findIt(int[] numArray, int number)
	{
		int result = 0;
		Arrays.sort(numArray);
		for (int i = 0; i < numArray.length; i++)
		{
			if(numArray[i]>number)
			{
				result = numArray[i];
				break;
			}
		}
		return result;
	}
}
