package arrayOfRefs;

//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot < pups.length)
		{
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int greatest = 0;
		String name = "";
		for (Dog puppy: pups)
		{
			if (puppy.getAge() > greatest)
			{
				greatest = puppy.getAge();
				name = puppy.getName();
			}
		}
		return name;
		
	}

	public String getNameOfYoungest()
	{
		int min = pups[0].getAge();
		String name = pups[0].getName();
		for (Dog puppy : pups)
		{
			if(puppy.getAge() < min)
			{
				min = puppy.getAge();
				name = puppy.getName();
			}
		}
		
		return name;
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}