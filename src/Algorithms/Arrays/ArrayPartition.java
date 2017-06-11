package Algorithms.Arrays;

import java.util.Arrays;

public class ArrayPartition {
	
	public static int  get(int [] nums)
	
	{
		Arrays.sort(nums);
		int results=0;
		for(int i=0;i<nums.length;i+=2)
		{
			results+=nums[i];
		}
		return results;
	}

}
