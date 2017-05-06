package Algorithms;

import java.util.ArrayList;

public class PrimeFactors {
	
	private static int primes[];

	public static int [] Fectf(int n){
	
	primes = null;
	int divisor=2;
	//Answer: Run a while loop. start dividing by two and if not divisible increase divider until u r done.
	
	for(int i=n;i>2;i++)
	{
		if(n%divisor==0){
			primes[i]=divisor;
		n=n/divisor;
		}	
		else
		{
			divisor++;
		}
	}

	return primes;
	
}
}
