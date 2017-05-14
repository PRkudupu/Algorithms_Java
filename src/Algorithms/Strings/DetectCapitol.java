package Algorithms.Strings;

public class DetectCapitol {
	public static boolean get(String word)
	{
		int cnt=0;
		for(char c:word.toCharArray())
			//If the condition is true we are counter is incremented
			if('Z' -c >= 0) cnt++;
		    //If the count is zero and the count and length are same and count is 1 and difference is greater than zero 
			return ((cnt==0 ||cnt==word.length())|| (cnt==1 && 'Z' - word.charAt(0) >=0));
		
	}
	
}


