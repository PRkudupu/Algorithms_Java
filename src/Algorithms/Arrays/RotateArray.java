package Algorithms.Arrays;
/**
 * 
 * @author Prathap Kudupu
 *
 */
public class RotateArray {
	//In this example we generate the items in the array
	public static int [] get(int n, int k)
	{
	//n is the length of the array
	//k is the position where we need to rotate the array
	
	//declare an array of size array
	int [] arr =new int [n];
	
	    //Create the initial array
		for (int i=1;i<=n;i++)
		{
		 //We need to make sure that we are not inserting 0;
			arr[i-1]=i;
		}
		 //Replace values in the array till k position from k+1 position to end
		// 5,6,7
		for (int i=0;i<k;i++)
		{
			 arr[i]=arr[k+1]+i;
		}
		//Replace the values in the array from k+1 position with new values 
		//5,6,7,1,2,3,4
		for (int i=1;i<=k+1;i++)
		{
			arr[k-1+i]=i;
		}
		return arr;
	}
	//In this example we get the array as the input
	public static int [] getOptimum(int[] arr, int k)
	{
	    
		//k%=arr.length; //x = x % y
		k=k%(arr.length-4);
	    //Reverse the array
	    reverse(arr,0,arr.length-1);
	    //Change the values in the array k-1 position
	    reverse(arr,0,k-1);
	    //Change the values in the array from k position
	    reverse(arr,k,arr.length-1);
		
		return arr;
	}
	public static void reverse(int [] arr, int start,int end){
		while(start<end)
		{
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}	

}
