package Algorithms.Arrays;
/*
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeros {

	// Shift non-zero values as far forward as possible
	// Fill remaining space with zeros
	public static void get(int [] arr)
	{
		if (arr == null || arr.length == 0) return;        

	    int insertPos = 0;
	    for (int num: arr) {
	    	// Shift non-zero values as far forward as possible
	        if (num != 0) {
	         arr[insertPos++] = num;
	          }
	    }        
        
	    while (insertPos <arr.length) {
	    	// Fill remaining space with zeros
	    	arr[insertPos++] = 0;
	       }
	}

}
