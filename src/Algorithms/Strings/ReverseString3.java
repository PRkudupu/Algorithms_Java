package Algorithms.Strings;
/**
 Example 1:
 Input: "do you like my blog"
 Output: "golb ym ekil uoy od"
 * @author Prathap Kudupu
 *
 */
public class ReverseString3 {

	public static String get(String s)
	{
		//Convert the string to an Array of string
		char [] arr=s.toCharArray();
		String revStr="";
		for (int i=arr.length-1;i>=0;i--)
		{
			revStr=revStr+arr[i];
		}
		return revStr;
	}
	public static String cleanSolution(String s)
	{
		//Convert the string to an Array of string
		char [] arr=s.toCharArray();
		for (int i=0;i<=arr.length-1;i++)
		{
 			//When i is non space
			if(arr[i]!=' ')
			{
				int j=i;
				while(j+1 < arr.length && arr[j+1]!=' '){
					//Move j to the end
					j++;
				}
				reverse(arr,i,j);
				i=j;
			}
				
		}
		return new String (arr) ;
	}
	//Function to reverse a string
	public static void reverse(char [] ca,int i,int j)
	{
		for(;i<j;i++,j--){
			char temp=ca[i];
			ca[i]=ca[j];
			ca[j]=temp;
		}
		
	}
}
