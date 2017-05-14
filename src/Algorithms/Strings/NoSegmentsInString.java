package Algorithms.Strings;

public class NoSegmentsInString {
	
	public static int get(String s)
	{
	  int res=0;
	  for (int i=0;i<s.length();i++)
	  {
		  //This condition, we are looking for two spaces and 0 position
		  if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
		  {
			  res++;
		  }
	  }
	  return res;
	}

}
