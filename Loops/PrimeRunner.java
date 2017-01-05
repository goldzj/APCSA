
//Name - Zachary Gold//Date - 9/22/16
//Class - AP Comp Sci A Period 2
//Lab  - Prime Number


public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime primeTest = new Prime(24);
		System.out.println(primeTest);
		primeTest.setPrime(7);
		System.out.println(primeTest);
		primeTest.setPrime(100);
		System.out.println(primeTest);
		primeTest.setPrime(113);
		System.out.println(primeTest);
		primeTest.setPrime(65535);
		System.out.println(primeTest);
		primeTest.setPrime(2);
		System.out.println(primeTest);
		primeTest.setPrime(7334);
		System.out.println(primeTest);
		primeTest.setPrime(7919);
		System.out.println(primeTest);
		primeTest.setPrime(1115125003);
		System.out.println(primeTest);
	}	
}