
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		String words = "abc ABC 12321 fred alexander";
		WordSort sorter = new WordSort(words);
		sorter.sort();
		System.out.println(sorter);
		
		String words2 = "a zebra friendly acrobatics 435 TONER PRinTeR";
		WordSort sorter2 = new WordSort(words2);
		sorter2.sort();
		System.out.println(sorter2);
	}
}