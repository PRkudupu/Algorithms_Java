package Algorithms.Strings;
/**Reverse vowels of a string
 * * Input: "hello"
     Output: "holle"
 */
public class ReverseVowelsOfString {
	
	public static String get(String s)
	{
		//Check for empty and null condition
		if(s==null || s.length()==0) return s;
		//Store all the vowels in a variable
		String vowels="aeiouAEIOU";
		//Convert the string into character array
		char [] c=s.toCharArray();
		// we need 2 pointers. One for the hed and other for the tail
		int head=0;
		int tail=c.length-1;
		//Loop through the array to reverse the string
		while (head <tail)
		{
			//Increment head if we do not find vowels
			while(head<tail && !vowels.contains(c[head]+""))
			{
				head++;
			}
			//Decrement tail, if we do not find vowels
			while(head<tail && !vowels.contains(c[tail]+""))
			{
				tail--;
			}
			char temp=c[head];
				c[head]=c[tail];
				c[tail]=temp;
				
			head++;
			tail--;
		}
		
		return new String(c);
	}

}
