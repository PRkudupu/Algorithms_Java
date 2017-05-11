package Algorithms.Arrays;
import java.util.ArrayList;
/**
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
import java.util.List;

public class PascalTriangle2 {
	
	public static List<Integer> get(int rowIndex){
		
		//Declare a new List
		List<Integer> list=new ArrayList<Integer>();
		 
		if(rowIndex <0)
		{
			return list;
		}
		//Creation of Pascal triangle list
		for(int i=0;i< rowIndex+1;i++) 
		{
			list.add(0,1);
			for(int j=1;j<list.size()-1;j++)
			{
				list.set(j, list.get(j)+list.get(j+1));
			}
		}
		return list;
	}

}
