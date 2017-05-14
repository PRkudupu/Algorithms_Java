

import java.util.ArrayList;
import java.util.List;

public class HomeString {
	public static void main(String args[]){
	
		/****
		 * 
		 * HOME PAGE FOR CALLING ALL THE STRING MANIPULATION FUNCTIONS
		 */
		
		/**
		 * Reverse a string 2
		 * 
		 */
		/*
		String s="abcdefg";
	    int k=2;
		
		String reverserString=Algorithms.Strings.ReverseString2.get(s,k);
		System.out.println("Missing Number : "+ reverserString);
		*/
		/**
		 * Ransome Note
		 * 
		 */
		/*
		String ransomNote="aa";
		String magazine="aab";
	  
		boolean exists=Algorithms.Strings.RansomNote.get(ransomNote,magazine);
		System.out.println("Missing Number : "+ exists);
		*/
		/**
		 * No of segments in a string
		 * Input: "Hello, my name is John"
              Output: 5		 
		 */
		String s="Hello, my name is John";
	 
		int no=Algorithms.Strings.NoSegmentsInString.get(s);
		System.out.println("Segments in string : "+ no);
	
	
 }
}
