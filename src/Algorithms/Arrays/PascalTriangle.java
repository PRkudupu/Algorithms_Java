package Algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static List<List<Integer>> get(int numRows)
	{
		//List to all rows of list
		List<List<Integer>> allRows = new ArrayList<List<Integer>>();
		//List to store rows
	    List<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			for(int j=1;j<row.size()-1;j++)
			 // set j value from the nest element
				row.set(j, row.get(j)+row.get(j+1));
			//Add rows to the arrayList
			allRows.add(new ArrayList<Integer>(row));
		}
		return allRows;
	}

}
