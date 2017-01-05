
//Name - Zachary Gold
//Date - 
//Class - AP Comp Sci A
//Lab  - FunHouse

import java.lang.reflect.Array;
import java.util.Arrays;

public class FunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + FunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + FunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + FunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + FunHouse.getCount(one,9));
		int [] remove = FunHouse.removeVal(one, 4);
		System.out.println("Without 4s: " + Arrays.toString(remove));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		System.out.println("");
		System.out.println(Arrays.toString(two));
		int[] removeTwo = FunHouse.removeVal(two, 4);
		System.out.println("Without 4s: " + Arrays.toString(removeTwo));


	}
}