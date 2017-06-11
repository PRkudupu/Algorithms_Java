package Algorithms.Math;
/**
 * Solution
 * sum(array) - n * minimum
 * @author Prath
 *
 */
public class MinMovesToArrayElement {
	
	public static int get(int arr [])
	{
		if (arr.length == 0 ) return 0;
		int min=arr[0];
		for(int n: arr)
		{
			min=Math.min(min, n);
		}
		int res=0;
		for(int n: arr)
		{
			res+=n-min;
		}
		return res;
	}

}
