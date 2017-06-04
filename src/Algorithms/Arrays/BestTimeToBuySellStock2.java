package Algorithms.Arrays;

public class BestTimeToBuySellStock2 {

	public static int get(int [] prices)
	{
		//maxProfit
		int maxprofit=0;
		//loop through the array set . We need to keep on adding the profit
		//We need to buy and sell before buying others
		for(int i=0;i<prices.length-1;i++)
		{
			//We need to make sure that selling is greater than profit
			if(prices[i+1] >prices[i])
			{
				maxprofit+=prices[i+1]-prices[i];
			}
		}
		return maxprofit;
		
	}
}
