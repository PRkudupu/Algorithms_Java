package Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualK {

	public static int get(int [] num,int k)
	{
		int sum=0,result=0;
		//use hash MAP
		Map<Integer,Integer> preSum=new HashMap<>();
		preSum.put(0, 1);
		
	    //Iterate the array
		for (int i=0;i<num.length;i++)
		{
			sum+=num[i];
			if(preSum.containsValue(sum-k)){
				result+=preSum.get(sum-k);
			}
			//
			preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
		}
		return result;
	}
}
