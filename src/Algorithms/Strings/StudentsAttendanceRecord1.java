package Algorithms.Strings;
/*
 * Input: "PPALLP"
   Output: True

  Input: "PPALLL"
   Output: False
 */
public class StudentsAttendanceRecord1 {
	
	public static boolean get(String s){
		//Using regular expression. If LL is more than 2 continuous and A is more than 2.
		return s.matches(".*LLL*.|.*A.*A.");
	}

}
