package Algorithms.Arrays;

public class removeElement {

	//If we find the specified element in the array then I need to remove it 
	//Must do it in place of constant memory
	public static int get(int arr[], int n, int elem)
	{
		int begin=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=elem){
				arr[begin++]=arr[i];
			}
		}
		return begin;
		
	}
}
