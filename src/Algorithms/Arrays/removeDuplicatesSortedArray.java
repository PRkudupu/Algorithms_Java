package Algorithms.Arrays;

public class removeDuplicatesSortedArray {
	//Time O(1) Space O(1)
	public static int get(int arr [], int n)
	{
		//The length is less than 2 than return
		if(n < 2) 
		{return n;}
        int id = 1;
        for(int i = 1; i < n; ++i) {
            if(arr[i] != arr[i-1]) 
            {
            	System.out.println("arr[i]  :" +arr[i]);
            	System.out.println("arr[i-1]  :" +arr[i-1]);
            	arr[id++] = arr[i];
            	System.out.println("arr[i-1]  :" +arr[id++]);
            	
            }
        }
        return id;
	}

}
