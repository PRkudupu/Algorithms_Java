package Algorithms.Strings;
/**
 *  Input : Prathap Kudupu
 *  Output: 6
 * @author Prathap Kudupu
 *
 */
public class LengthOfLastWord {
  
	public static int get(String s)
	{
		if(s==null || s.length()==0) return 0;
		//convert string to char array
		char [] c=s.toCharArray();
		
		int tail=c.length-1;
		char space=' ';
		int length=0;
		for(int i=tail;i>=0;i--) 
		{
			if(c[i]==space)
			{
			  break;
			}
			length++;
		}
		return length;
	}
}
