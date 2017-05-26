

import java.util.ArrayList;
import java.util.List;

public class HomeMath {
	public static void main(String args[]){
		/***
		 * Add 2 digits
		 * * * Input: "38"
              Output: "2"
		 */
			 int digit=38;
				
				int Add2Digits=Algorithms.Math.AddTwoDigits.get(digit);
			
				System.out.println("Result of adding 2 numbers : "+ Add2Digits);
				
				int Add2DigitsRev=Algorithms.Math.AddTwoDigits.recursion(digit);
				
				System.out.println("Result of adding 2 numbers rev: "+ Add2DigitsRev);
		
		
 }
}
