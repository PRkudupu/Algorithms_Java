package Algorithms.Math;
/*
Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of 
divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of 
divisors is 6.
 */
public class PerfectNumber {
	
	public static  boolean get(int num)
	{
		//If num is 1 then return false
		if (num==1) return false;
		
		int sum=0;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
			if(i!=num/i) sum+=num/i;
		}
		sum++;
		
		return sum == num;
				
	}

}
