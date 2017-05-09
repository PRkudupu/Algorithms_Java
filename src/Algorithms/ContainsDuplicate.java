package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
	//Using trvial method
	/*
	 * Time complexity: O(N^2), memory: O(1)
	 */
	public static Boolean getTrivial(int [] arr)
	{
		//Iterate through the array
		for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
	}
	//Here we first sort than we know that duplicates should be next to each other
	//O(N lg N), memory: O(1) 
	public static Boolean getSortandFind(int [] arr)
	{
		//Here we sort the array
		Arrays.sort(arr);
		//Iterate through the array
		for(int i = 0; i < arr.length; i++) {
                if(arr[i] == arr[i+1]) {
                    return true;
                }
            }
         return false;
	}
  //Using Hash Set
	public static Boolean getHashSet(int [] arr)
	{
		//If you make any variable, It will be constant.
	   final 	Set<Integer> distinct = new HashSet<Integer>();
		//Iterate through the array
		for(int i=0;i<arr.length;i++)
		{
			if(distinct.contains(arr[i]))
			{
				return true;
			}
			distinct.add(arr[i]);
		}
		
		return false;
	}
	
	//Using Hash Map
	public static Boolean get(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		//Iterate through the array
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(map.get(arr[i])))
			{
				return true;
			}
			map.put(arr[i], arr[i]);
		}
		
		return false;
	}

}
