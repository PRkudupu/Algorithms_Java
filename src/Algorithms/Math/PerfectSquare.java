package Algorithms.Math;

public class PerfectSquare {
	public static boolean Get(int num)
	{
		int i=1;
		//loop through till n is less than 0
	    while(num>0)
	    {
	    	num-=i;
	    	i+=2;
	    }
	    return num == 0;
	}
	//Find the perfect square using Binary Search
	
	public static boolean BinarySearchMethod(int num)
	{
		int low=0;
		int high=num;
		while (low <= high)
		{
			long mid=(low+high) >>>1;
			
			if(mid*mid==num)return true;
			else if(mid*mid < num)
				{low =(int)mid+1;}
			else 
			    {high =(int)mid-1;}
		}
		return false;
		
	}
	//Using Newtons Method
	public static boolean NewtonMethod(int num)
	{
		 long x = num;
	        while (x * x > num) {
	            x = (x + num / x) >> 1;
	        }
	        return x * x == num;
	}

}
