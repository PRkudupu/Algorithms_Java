package Algorithms.Strings;
/**
 * Longest common Prefix
 * @author Prathap Kudupu
 *
 */
public class LongestCommonPrefix {
	public static String get(String [] strs)
	{
		//Check if the string array is null or the length is zero
		if (strs.length==0 || strs==null ) return "";
		
		//Get the first string in the array of strings
		String pre=strs[0];
		int i=1;
		//iterate till the end of the array
		while(i <strs.length)
		{
			//We are taking the second string and comparing if index of previous returns 0 
			//If it returns zero we know that its common prefix
			while(strs[i].indexOf(pre)!=0)
				pre=pre.substring(0, pre.length()-1);
			i++;
		}
		return pre;
	}

}
