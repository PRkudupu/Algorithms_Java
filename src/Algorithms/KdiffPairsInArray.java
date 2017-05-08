package Algorithms;
import java.util.Map;
import java.util.HashMap;
public class KdiffPairsInArray {

	public static int get(int [] nums,int k)
	{
		if(nums== null || nums.length==0 || k<0 ) return 0;
		
		//An object that maps keys to values. A map cannot contain duplicate keys; 
		//each key can map to at most one value.
		 Map<Integer, Integer> map = new HashMap<>();
		
		 //Insert all the contents of the array to hash table.
		 for(int i:nums)
		 {
			 //While inserting also make sure that you check for duplications
			 map.put(i, map.getOrDefault(i,0)+1);
		 }
		 int count=0;
		 //Count the no of pairs in mapping table
		 for(Map.Entry<Integer, Integer> entry :map.entrySet())
		 {
			 //If K=0
			 /*
			  * Input: [1, 3, 1, 5, 4], k = 0
				Output: 1
				Explanation: There is one 0-diff pair in the array, (1, 1)
			  * 
			  */
			 if(k==0){
				if(entry.getValue() >=2)
				{
					count++;
				}
				 
			 }
			 else
			 {
				 //Check if the K pair exists in the hashMap
				 if(map.containsKey(entry.getKey()+k))
					 count++;
		
			 }
		 }
		 return count;
		 
		
	}
}
	 	