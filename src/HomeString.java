

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
		/*
		String s="Hello, my name is John";
	 
		int no=Algorithms.Strings.NoSegmentsInString.get(s);
		System.out.println("Segments in string : "+ no);
	     */
		/**
		 * Detect Capitol
		 * Input: "Hello, my name is John"
              Output: 5		 
		 */
		/*
		String s="USA";
		 
		boolean isCapitol=Algorithms.Strings.DetectCapitol.get(s);
		System.out.println("Detect Capitol : "+ isCapitol);
		*/
		/**
		 * Roman to Integer
		 * Input : MCMIV
		   Output :  1904                        C    M
		   M is a thousand, CM is nine hundred (100-1000)
		   and IV is four 
		 */
		/*
		String s="MCMIV";
		 
		int  romanToInteger=Algorithms.Strings.RomanToInteger.get(s);
		System.out.println("Detect Capitol : "+ romanToInteger);
	   */
		/**
		 * Longest Common Prefix
		 * Input  : {"tommorow", "tommy", "tomandGerry", "tod"}
           Output : "to"
		 */
		/*
		 * 
		String [] str={"tommorow", "tommy", "tomandGerry", "tod"};
		 
		String  longestCommonPrefix=Algorithms.Strings.LongestCommonPrefix.get(str);
		System.out.println("Detect Capitol : "+ longestCommonPrefix);
		*/
		/**
		 * Reverse a string 3
		 * Input: "do you like my blog"
           Output: "golb ym ekil uoy od"
		 */
		/*
		String str="do you like my blog";
		 
		String  revStr=Algorithms.Strings.ReverseString3.cleanSolution(str);
		System.out.println("Reverse a string : "+ revStr);
		*/
		/**
		 * Valid Parentheses
		 close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not
		 */
		/*
		String str="()[";
		 
		boolean  valid=Algorithms.Strings.ValidParentheses.get(str);
		System.out.println("Valid Parentheses : "+ valid);
		*/
		/**
		 * Implement strStr
		 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
		 */
		/*
		String s="strSt";
		String needle="St";
		 
		int  valid=Algorithms.Strings.NeedleInHaystack.get(s,needle);
		System.out.println("Needle in Haystack : "+ valid);
		*/
		/**
		 * Valid Palindrome
		 * A man, a plan, a canal: Panama" is a palindrome.
		 */
		/*
		String s="An, pna";
		 
		boolean valid=Algorithms.Strings.ValidPalindrome.get(s);
		System.out.println("Valid palindrome : "+ valid);
		*/
		/**Largest Uncommon Sequence 1
		 * * Input: "aba", "cdc"
             Output: 3
		 */
		/*
		String a="abc";
		String b="abc";
		 
		int seq=Algorithms.Strings.LongestUnCommonSequence1.get(a,b);
		System.out.println("Largest Uncommon Sequence : "+ seq);
		*/
		/**STUDENTS ATTENDANCE RECORD 1
		 * * Input: "PPALLP"
             Output: 3
		 */
		/*
		String s="PPALPP";
	
		boolean attendance=Algorithms.Strings.StudentsAttendanceRecord1.get(s);
		System.out.println("Student Attendance : "+ attendance);
		*/
		/**REVERSE VOWEL OF A STRING
		 * * Input: "hello"
             Output: "holle"
		 */
		/*
		String s="hello";
		
		String reverseVowels=Algorithms.Strings.ReverseVowelsOfString.get(s);
		//display the new reversed vowels
		for(char c:reverseVowels.toCharArray())
		{
		System.out.println("Reversed vowels : "+ c);
		}
		*/
		/**LENGTH OF THE LAST WORD
		 * * Input: "Prathap Kudupu"
             Output: 5
		 */
		/*
        String s="prathap Kudupu";
		
		int lengthOfLastWord=Algorithms.Strings.LengthOfLastWord.optimum(s);
		
		System.out.println("Length of the last word : "+ lengthOfLastWord);
		*/
		
		/**REVERSE A STRING
		 * * Input: "Blog"
             Output: "golB"
		 */
		/*
		    String s="Blog";
			
			String reverse=Algorithms.Strings.ReverseString.usingPointers(s);
			
			System.out.println("Reverse of a string : "+ reverse);
		*/
		/**ANAGRAM
		 * * Input: "Pra", "aPr"
	         Output: true
		 */
		   String a="Pra";
		   String b="aP";
			
			boolean isAnagram=Algorithms.Strings.Anagram.get(a,b);
			
			System.out.println("The given 2 strings are Anagram (True:false ) -->"+ isAnagram);
	
 }
}
