package Algorithms.Strings;
/*
 * Input: s = "abcdefg", k = 2
    Output: "bacdfeg
 */
public class ReverseString2 {
	public static String get(String s,int k)
	{
		//Convert the string in char array
		char [] arr=s.toCharArray();
		//Array length
		int n=arr.length;
		int i=0;
		while(i<n){
			int j=Math.min(i+k-1, n-1);
			//Call the swap function
			swap(arr,i,j);
			//Increment the counter
			i+=2*k;
		}
	//Convert character to string and return
	return String.valueOf(arr); 
	}
	private static void swap(char [] arr, int l, int r)
	{
		while(l<r)
		{
			//Store the first char as temp
			char temp=arr[l];
			//Swap the last element to the first element
			arr[l++]=arr[r];
			//Swap the first element from the temp to last element
			arr[r--]=temp;
		}
	}

}
