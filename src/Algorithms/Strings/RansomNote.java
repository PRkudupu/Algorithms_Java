package Algorithms.Strings;
/*
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */
public class RansomNote {
	public static boolean  get(String ransomeNote,String magazine)
	{
		int [] arr=new int[26];
		
		for(int i=0;i<magazine.length();i++)
		{
			arr[magazine.charAt(i)- 'a']++;
		}
		for(int i=0;i<ransomeNote.length();i++)
		{
			if(--arr[magazine.charAt(i)- 'a'] < 0)
			{
				return false;
			}
		}
		return true;
	}

}
