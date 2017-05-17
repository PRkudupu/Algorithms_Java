package Algorithms.Strings;

import java.util.Arrays;

public class Anagram {
	
	public static boolean get(String a,String b)
	{
		//Check for null and empty string
		if (a==null || a.length()==0 || b==null | b.length()==0) return false;
		
		//Remove empty space
		String fString=a.replace("\\s", "");
		String SString=b.replace("\\s", "");
        
		//If both length is no equal then return false
		if (a.length()!=b.length()) return false;
		//Convert both the strings into Char Array
		char [] fCArray=fString.toLowerCase().toCharArray();
		char [] SCArray=SString.toLowerCase().toCharArray();
		
		//Sort both the array
		Arrays.sort(fCArray);
		Arrays.sort(SCArray);
		
		//Check if both are equal.
		return Arrays.equals(fCArray, SCArray);
				
	}

}
