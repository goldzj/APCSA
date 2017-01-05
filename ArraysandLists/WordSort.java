
//Name - Zachary Gold
//Date -
//Class - AP Computer Science A
//Lab  - 

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		String output = "";
		for (int n = 0; n < wordRay.length; n++)
		{
			output += "word " + n + " :: ";
			output += wordRay[n];
			output += "\n";
		}
		return output;
	}
}