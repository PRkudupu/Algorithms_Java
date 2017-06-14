package Algorithms.Math;

public class NthDigit {
	public static int Get(int n)
	{
		int len=1;
		long count =9;
		int start=1;
		
		while(n>len*count)
		{
			n-=len*count;
			len+=1;
			count*=10;
			start*=10;
			
		}
		start+=(n-1)/len;
		
		//Convert to string
		String s=Integer.toString(start);
		//return the numeric value
		return Character.getNumericValue(s.charAt((n-1)% len));
		
		
	}

}
