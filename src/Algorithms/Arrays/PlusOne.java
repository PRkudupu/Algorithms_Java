package Algorithms.Arrays;

public class PlusOne {


public static int [] get(int [] digits)
{
	//Loop through the array
	for(int i=digits.length-1;i>=0;i--)
	{
		//check if the digits are less than 9
		if(digits[i]<9){
			digits[i]++;
			return digits;
		}
		//If the no is greater than 1 then assign 0
		digits[i]=0;
	}
	//Create new array
	int [] newNumber = new int [digits.length+1];
	newNumber[0]=1;
	return newNumber;
  }
} 