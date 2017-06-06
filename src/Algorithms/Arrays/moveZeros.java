package Algorithms.Arrays;

public class MoveZeros
{
	public static void get(int arr[])
	{
		if (arr==null || arr.length==0 ) return;
		//Loop through the array to find zeros
		int insertpos=0;
		for(int n: arr)
		{
			if(n!=0)
			arr[insertpos++]=n;
			
		}
		//This is where we replace end of the array with zero based on the insertPos count
		while(insertpos < arr.length)
		{
			arr[insertpos++]=0;
		}
	}
}