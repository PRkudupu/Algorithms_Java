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
			//If mid is greater than the insertValue than we need traverse left to the mid
			else if(arr[mid] >insertValue) high=mid-1;
			//If mid is less than the insertValue than we need to traverse right to the mid 
			else low=mid+1;
		}
		return low;
	}
	
}
