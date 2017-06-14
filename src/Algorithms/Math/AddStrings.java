package Algorithms.Math;

public class AddStrings {
	public static String Get(String num1,String num2)
	{
		StringBuilder sb= new StringBuilder();
		int carry=0;
				for(int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0||carry ==1;i--,j--)
				{
					//Fetches the string which needs to be added. This needed when carry=1
					int x=i<0?0:num1.charAt(i)-'0';
					int y=j<0?0:num2.charAt(j)-'0';
					//Append the string varaible
					sb.append((x+y+carry)%10);
					//This variable is needed for carrying
					carry=(x+y+carry)/10;
				}
		
	       return sb.reverse().toString();
		
	}

}
