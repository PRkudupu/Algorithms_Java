package Algorithms.Math;
    /***
	 * Add 2 digits
	 * Input: "38"
       Output: "2"
	 */

public class AddTwoDigits {
//Solution using formula
public static int get(int num)	{
return 1+(num-1)%9;
}

//Using recursion method

public static int recursion(int num)
{
	int sum=0;
	//Convert int to string
	String s=String.valueOf(num);
	for(int i=0;i<s.length();i++)
	{
		sum=sum+(s.charAt(i))-'0';
	}
	//
	if(sum<10)
	{
		return sum;
	}
	//Recursive call
	return recursion(sum);
}
}
