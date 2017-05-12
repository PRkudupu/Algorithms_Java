package Algorithms.Arrays;

public class MaximumSubArray {
	public static int get(int arr [])
	{
		int maxsoFar=arr[0], maxEndingHere=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			//Get the max in the iteration
			maxEndingHere=Math.max(maxEndingHere+arr[i], arr[i]);
			//Get the max so far
			maxsoFar=Math.max(maxEndingHere, maxsoFar);
		
		}
		return maxsoFar;
		
	}

}
