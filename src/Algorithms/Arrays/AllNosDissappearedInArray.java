package Algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;
/*
 * Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 * 
 */
public class  AllNosDissappearedInArray
{
public static List<Integer> get(int[] nums) {
    List<Integer> ret = new ArrayList<Integer>();
    
    //In this iteration we are marking numbers with negative numbers
    for(int i = 0; i < nums.length; i++) {
        int val = Math.abs(nums[i]) - 1;
        if(nums[val] > 0) {
            nums[val] = -nums[val];
        }
    }
    //In this iteration we are checking for numbers which are non negative and then we 
    // are adding the index +1 value to the arraylist
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] > 0) {
            ret.add(i+1);
        }
    }
    return ret;
}


}
