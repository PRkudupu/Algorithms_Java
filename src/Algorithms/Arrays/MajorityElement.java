package Algorithms.Arrays;
/*
 *        I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4 

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE
 */

public class MajorityElement {
	
	public static int get(int [] arr)
	{
		//We are taking the first element of the array
		int major=arr[0], count=1;
			
		for(int i=1;i<arr.length;i++)
		{	
			//If count is set to zero during iteration we need to reset the count
			if (count==0)
			{
				count++;
				major=arr[i];
			}
			//If current element is same as major then increment the count
			else if(major==arr[i])
			{
				count++;
			}
			//If we are here than we know that the current element is not the same then we would decrement the count
			else
			{
				count--;
			}
			
		}
		return major;
		
	}

}
