package Algorithms;

/******
Function to check if the given no is a prime number
Here we start we loop till Number=divisor.
Before reaching this condition if the modulous == 0 then we know that it is not a prime number
*******/
public class checkPrimNo {
	
	public static boolean validate(int n){
		int divisor=2;
		while(n>divisor){
			if(n%divisor==0){
				return false;
			}
			divisor++;
		}
		return true;
	}

}
