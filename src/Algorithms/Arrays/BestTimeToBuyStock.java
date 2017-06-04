/*
 * Here, the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) 
 * of the original array, and find a contiguous subarray giving maximum profit. If the difference falls below 0, reset it to zero.
 */
package Algorithms.Arrays;
/*
 * Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger 
than buying price)
 */
public class BestTimeToBuyStock {
	
	public static int get(int [] prices){
	//
		int maxSoFar=0, maxCur=0;
		
		//We need to start getting the difference from the second and first element in the array and 
		// keep incrementing i
		for(int i=1;i<=prices.length-1;i++)
		{
			//gets the current max
			maxCur=Math.max(0, maxCur+=prices[i]-prices[i-1]);
			//gets the max so far
			maxSoFar=Math.max(maxCur, maxSoFar);
		}
		return maxSoFar;
		
	}

}
