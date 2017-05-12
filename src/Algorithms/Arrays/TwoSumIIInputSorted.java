package Algorithms.Arrays;
/**
 * Input: numbers={2, 7, 11, 15}, target=9
   Output: index1=1, index2=2
 * @author Prathap Kudupu
 *
 */

public class TwoSumIIInputSorted {
	public static int [] get(int [] arr, int target)
	{
		//array to store the indices
		int [] indices = new int[2];
		
		//Check if the array is empty or contains less than 2 elements
		if (arr ==null || arr.length <2 ) return indices;
	    
		//define the start and the end part of the array
		int start=0;int end=arr.length-1;
		
		//iterate till it reaches end of the loop
		while(start <end)
		{
			//Sum the first and last element in the array
			int sum=arr[start]+arr[end];
			//check if the sum is equal to the target. If yes get the indice
			if(sum==target) 
			{
				indices[0]=start+1;
				indices[1]=end+1;
			}
			//move to the right
			else if(sum > target)
			{
				end--;
			}
			//traverse to the left
			else
			{
				start++;
			}
			
		}
		
		return indices;
		
	}

}
