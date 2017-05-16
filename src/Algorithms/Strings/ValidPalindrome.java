package Algorithms.Strings;
/**
 * "A man, a plan, a canal: Panama" is a palindrome.
"   race a car" is not a palindrome.
 * @author Prathap Kudupu 
 *
 */
public class ValidPalindrome {

	public static boolean get(String str)
	{
		//if string is empty return true
		if(str.isEmpty())
		{
			return true;
		}
		int head =0, tail=str.length()-1;
		//loop  through the strings to find if it is a valid palindrome
		 while(head <= tail)
		 {
			 //Increment the header if the character isLetter or digit
			 if(!Character.isLetterOrDigit(str.charAt(head))){
				 head++;
			 }
			 //Decrement the tail if the character isLetter or digit
			 else if(!Character.isLetterOrDigit(str.charAt(tail))){
				 tail--;
			 }
			 else {
				   if(Character.toLowerCase(str.charAt(head)) !=Character.toLowerCase(str.charAt(tail)))
				   {
					   return false;
				   }
				   head++;
				   tail--;
			  
			 }
		 }
		return true;
	}
}
