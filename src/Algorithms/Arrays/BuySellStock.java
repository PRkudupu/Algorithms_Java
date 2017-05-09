/*
 * Here, the logic is to calculate the difference (maxCur += prices[i] - prices[i-1]) 
 * of the original array, and find a contiguous subarray giving maximum profit. If the difference falls below 0, reset it to zero.
 */
package Algorithms.Arrays;

public class BuySellStock {
	
	public static int get(int [] prices){
	//
		int maxCur=0,maxsoFar=0;
		//We need to make sure that we start from the 2nd element in the array
		for (int i=1;i<prices.length;i++){
			//Here we are finding the max current price
			maxCur=Math.max(0, maxCur+=prices[i]- prices[i-1]);
 			maxsoFar=Math.max(maxCur, maxsoFar);
		}
		return maxsoFar;
		
	}

}
