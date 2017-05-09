package Algorithms.Arrays;
/**
 * Input: [1,1,0,1,1,1]
   Output: 3
   Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 * @author Prathap Kudupu
 *
 */
public class MaxConsecutiveOnes {
	
  public static int get(int [] arr)
  {
	  int maxNow=0,max=0;
	  
	  //loop through the array to find the maximum no of consecutive arrays
	  for( int i :arr)
	  {
		  //Reset MaxNow to 0 or else increment by one
		  max=Math.max(max,maxNow= i==0 ?0 :maxNow+1) ;
	  }
		
	  return max;
  }
}
