package Algorithms.Arrays;

public class MissingNumber {
	public static int get(int []arr)
	{
		int xor=0, i=0;
		
	    for(i=0;i<arr.length;i++)
	    {
	    	xor=xor ^ i ^ arr[i];
	    }
	    return xor ^ i;
		
	}

}
