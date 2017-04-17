
public class Factorial {
	public static double Get(int n)
	{
		if (n==1)
			return 1;
		double fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	//find factorial using recursion
	public static double RecGet(int n)
	{
		if (n==1)
			return 1;
		return n * RecGet(n-1);
	}

}
