import java.security.AlgorithmConstraints;

import java.util.ArrayList;
import java.util.List;

public class Home {
	public static void main(String args[]){
	
	//Example for immutable
    //Call to static function for immutable example
	//System.out.println(Immutable.Validate());
		
	/*
	//Call to a static function to reverse a phrase
	System.out.println(ArrayFunctions.ReversePhrase("My Name is Prathap"));
	
	//Call to static string builder
	System.out.println(ArrayFunctions.ReversePhraseSB("My Name is Prathap using SB"));
	
	//String to validate if it is chinese character or japaneese character
	System.out.println(ArrayFunctions.ReversePhraseChinJap("ABCabc")); */
    
	/*Call Two Calls to calculate the sum
		int [] numbers={4,7,2,30};
		int [] result =TwoSumArray.twoSum(numbers, 9); 
		if (result.length!=0)
		{
		  for (int i=0;i<=result.length-1;i++)
		  { 
			  System.out.println(result[i]);			  
		  }
		}*/
		
	//Get the factorial of a number
		
     /*Check if the given no is prime 
		boolean validate=Algorithms.checkPrimNo.validate(5);
		System.out.println(validate);
		
		Algorithms.PrimeFactors.Fectf(75);
    */
		
		/***************
		 * 
		 * Reshape MATRIX
		 */
		/*//initialize a do dimensional array
		int [][] nums={{1,2},{3,4}};
		//Add data to the array
		int [][] newnums;
		
		newnums= Algorithms.ReshapeArray.get(nums,1,4);
		for (int i=0;i<newnums[0].length;i++)
		{
				System.out.println(newnums[0][i]);
		}*/
		/***************
		 * 
		 * ARRAY PARTITION
		 */
		/*
		int [] arr={1,4,3,2};
		
		int num = Algorithms.ArrayPartition.get(arr);
	     System.out.println(num);
	     */
	 	/***************
		* 
	    * SUB Array sum equals K
	    * Input: [3, 1, 4, 1, 5], k = 2
         Output: 2
         Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
         Although we have two 1s in the input, we should only return the number of unique pairs.
		*/
		/*
	    int [] arr ={1,1,1,1};
	    int num =Algorithms.SubArraySumEqualK.get(arr,2);
	    */
	 	/***************
		* 
		* K-diff Pairs in an Array
	    */
		/*
		int [] nums= {3, 1, 4, 1, 5};
		int k = 2;
		
		int count=Algorithms.KdiffPairsInArray.get(nums,k);
		System.out.println("count "+count);
		*/
		/***************
		* 
		* Input: [1,1,0,1,1,1]
          Output: 3
          Explanation: The first two digits or the last three digits are consecutive 1s.
          The maximum number of consecutive 1s is 3.
	    */
		/*
		int [] arr= {1, 1, 0, 1, 1,1};
		
		int max=Algorithms.MaxConsecutiveOnes.get(arr);
		System.out.println("max consecutive ones "+ max);
		
		/**
		 * Input:
		[4,3,2,7,8,2,3,1]

			Output:
			[5,6]
		 */
		/***************
		* 
		* Input:
			[4,3,2,7,8,2,3,1]
			Output:
			[5,6]
	    */
		/*
		int [] arr= {4,3,2,7,8,2,3,1};
		 List<Integer> ret=new ArrayList<Integer>();
				
		 ret=	Algorithms.AllNosDissappearedInArray.get(arr);
		for(int i:ret)
		{
			System.out.println("Dissapeared InArray "+ i);
			
		}
		*/
		/***************
		* 
		* Best time to buy a stock
			Input: [7, 1, 5, 3, 6, 4]
			Output: 5
			max. difference = 6-1 = 5 
	    */
		/*
		int [] arr= {7, 1, 5, 3, 6, 4};
		
		int max=Algorithms.BuySellStock.get(arr);
		System.out.println("max consecutive ones "+ max);
		*/
		/***************
		* 
		*Given nums = [2, 7, 11, 15], target = 9,
		Because nums[0] + nums[1] = 2 + 7 = 9,
          return [0, 1].
	    */
		/*
		int [] arr= {2, 7, 11, 15};
		int target=9;
		int[] result= new int [2];
				
		result=	Algorithms.TwoSum.get(arr,target);
		for(int i:result)
		{
			System.out.println("Tow sum array indices "+ i);
			
		}*/
		/***************
		* 
		*Given arr = [1, 7, 8, 10,20,7]
		  Given an array of integers, find if the array contains any duplicates.
	    */
		/*
		int [] arr= {3, 2, 8, 10,20,2};
		
		boolean duplicate=Algorithms.ContainsDuplicate.getHashSet(arr);
		System.out.println("Do we have duplicates in an array True ? False :: "+duplicate);
		*/
		
		/***************
		* 
		*  Max profit
			Input: [7, 1, 5, 3, 6, 4]
		*/
		/*
		int [] arr= {7, 1, 5, 3, 6, 4};
		
		int max=Algorithms.Arrays.BuySellStock2.get(arr);
		System.out.println("max profit "+ max);
		*/
		/***************
		* 
		*  You may assume the integer do not contain any leading zero, except the number 0 itself
		*  The digits are stored such that the most significant digit is at the head of the list
			Input: [7, 1, 5, 3, 6, 4]
		*/
		/*
		int [] arr= {1, 1, 0, 10, 6, 10};
		int [] result= {};
		 result=Algorithms.Arrays.PlusOne.get(arr);
		
		 //loop through the array
		 for(int no :result)
		 System.out.println("Integer values "+ no);
		 */
		/***************
		* 
		*  Given an array of integers and an integer k, find out whether there are two distinct 
		*  indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
			Input: [7, 8, 4, 3, 6, 4] k=4
		*/
		/*
		int [] arr= {7, 8, 4, 3, 6, 4};
		int k = 4;
	
		boolean value=Algorithms.Arrays.NearByDuplicate.get(arr,k);
		System.out.println("Consecutive duplicates : "+ value);
		*/
		/***************
		* 
		*  Given input array nums = [1,1,2],
            Your function should return length = 2, with the first two 
            elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length
		*/
		/*
		int [] arr= {1,1,2};
		int k = 3;
	
		int value=Algorithms.Arrays.removeDuplicatesSortedArray.get(arr,k);
		System.out.println("Duplicates array : "+ value);
		*/
		/**
		 * 
		 * Remove element from an array
		 */
		int [] arr= {3,2,2,3};
		int n = 4;
		int ele=3;
	
		int value=Algorithms.Arrays.removeElement.get(arr,n,ele);
		System.out.println("Duplicates array : "+ value);
 }
}
