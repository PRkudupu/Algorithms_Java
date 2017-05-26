package Algorithms.Strings;

public class ReverseStringRecursion {
	public static String get(String s)
	{
		//Return when string length= 1
		if(s.length() <=1) return s;
		
		return get(s.substring(1, s.length()))+s.charAt(0);
	}


}
