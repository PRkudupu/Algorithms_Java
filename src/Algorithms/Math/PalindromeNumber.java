package Algorithms.Math;

public class PalindromeNumber {

	public static boolean get(int x)
	{
		if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	      //Input 12321
	       //0 = 0 + 1
	       //1 = 10+ 2
	       //12= 120+3 =123
	       	rev = rev*10 + x%10;
	       	//1232
	       	//123
	       	//12
	       	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
}
