package Algorithms.Arrays;
/*
 * Search insert position
 */
public class searchInsertPosition {
 
	public static int get(int [] arr,int insertValue)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high/2);
			//If mid is equal to insert value
			if(arr[mid]==insertValue)return mid;  
			//
			else if(arr[mid] >insertValue) high=mid-1;
			else low=mid+1;
		}
		return low;
	}
	
}
