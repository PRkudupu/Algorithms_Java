package Algorithms.Arrays;

import java.util.HashSet;
import java.util.Set;

public class NearByDuplicate {

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	public static boolean get(int [] arr, int k)
	{
		//Declare a set
		Set<Integer> set = new HashSet<Integer>();
		//iterate through the array
		for(int i=0;i<arr.length;i++)
		{
			//Check if i is greater than k
			if(i>k){
				set.remove(arr[i]-k-1);
			}
			if(!set.add(arr[i])){
				return true;
			}
		}
		return false;
	}
}
