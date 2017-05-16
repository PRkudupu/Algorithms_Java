package Algorithms.Strings;
/*
 * Input: "aba", "cdc"
   Output: 3
 */
public class LongestUnCommonSequence1 {

	public static int get(String a, String b)
	{
		//If a = b then return -1 else return the max of the 2 strings
		return a.equals(b)?-1:Math.max(a.length(),b.length());
	}
}
