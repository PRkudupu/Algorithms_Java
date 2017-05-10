package Algorithms.Arrays;

public class ThirdMaxNumber {
	
	public static int get(int [] arr)
	{
	Integer max1=null;
	Integer max2=null;
	Integer max3=null;
	//loop through the array
	for(Integer n : arr)
	{
		
		if(n.equals(max1) || n.equals(max2) || n.equals(max3))
		{
			continue;
		}
		else if(max1==null || n> max1)
		{
			max3=max2;
			max2=max1;
			max1=n;
		}
		else if(max2==null || n> max2)
		{
			max3=max2;
			max2=n;
		}
		else if(max3==null || n> max3)
		{
			max3=n;
		}
			
	}
	return max3==null?max1 :max3;
	}
}
