package Algorithms.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	public static boolean get (int [] num , int k) 
	{
		//Use hash set to check for duplicates
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			if(i>k)
			{
				set.remove(num[i-k-1]);
			}
			//Here we are adding i values to the hashSet.
			//If there is a duplicate then add would fail
			if(!set.add(num[i]))
				return true;
		}
		return false;
	}

}
