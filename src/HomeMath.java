

import java.util.ArrayList;
import java.util.List;

public class HomeMath {
	public static void main(String args[]){
		/***
		 * Add 2 digits
		 * * * Input: "38"
              Output: "2"
		 */
			  /*int digit=38;
				
				int Add2Digits=Algorithms.Math.AddTwoDigits.get(digit);
			
				System.out.println("Result of adding 2 numbers : "+ Add2Digits);
				
				int Add2DigitsRev=Algorithms.Math.AddTwoDigits.recursion(digit);
				
				System.out.println("Result of adding 2 numbers rev: "+ Add2DigitsRev);
				*/
				/***
				       Input: n = 15
						Output: false
						Divisors of 15 are 1, 3 and 5. Sum of 
						divisors is 9 which is not equal to 15.

						Input: n = 6
						Output: true
						Divisors of 6 are 1, 2 and 3. Sum of 
						divisors is 6.
				 */
				/*
				boolean isPerfect =Algorithms.Math.PerfectNumber.get(8);
				System.out.println(isPerfect);
				*/
		       /**
		        * Input 12321 is a palindrome number
		        * Input 1231 is not a palindrome number
		        */
				/*
				boolean isPalindrome =Algorithms.Math.PalindromeNumber.get(12321);
				System.out.println(isPalindrome);
				*/
			    /** MINIMUM MOVES TO EQUAL ARRAY ELEMENTS
			        Input:[1,2,3]
				    Output:3
				    
				    [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
				 */
				int arr [] ={1,2,3};
				int minMoves =Algorithms.Math.MinMovesToArrayElement.get(arr);
				System.out.println("Minimum Moves :" + minMoves);
 }
}
