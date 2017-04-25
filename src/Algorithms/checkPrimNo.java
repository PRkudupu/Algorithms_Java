package Algorithms;

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
