package Algorithms.Strings;

import java.util.Stack;

/**
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Prathap Kudupu
 *
 */
public class ValidParentheses {
	
	public static boolean get(String s)
	{
		Stack<Character>  stack= new Stack<Character>();
		//Iterate through the string
		for(char c: s.toCharArray())
		{
			if(c =='(')
			{
				stack.push(')');
			}
			else if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='[')
			{
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop()!=c)
			{
				return false;
			}
		}
		//It would return true if the stack is empty or it would return false
		return stack.isEmpty();
			
	
	}

}
