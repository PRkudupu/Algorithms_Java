package Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

	public static int [] get(int [] arr,int target)
	{
		//Array to store the indices
		int [] result= new int[2];
		
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<=arr.length;i++){
			//This is where we are checking if the target -1 is eqaul to the key in the array
			//In this scenario in the 1st iteration 2 is inserted as key
			//In the second iteration when we check for contains key we would have the key so now we know that 
			// [0] ,[1] is the sum of two 
			if(map.containsKey(arr[i])){
				result[0]=map.get(arr[i]);
				result[1]=i;
				return result;
			}
			map.put(target-arr[i],i);
		}
		return result;
				
	}
}
