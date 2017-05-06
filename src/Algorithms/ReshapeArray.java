package Algorithms;
/*
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix. 
 Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list
 */
public class ReshapeArray {
	
	public static int [][] get(int [][] nums,int r, int c){
		
		int arrayNums=nums.length;
		int firstArrayLength=nums[0].length;
		
		//We cannot reshape an array of 2 * 2 matrix to a 2 * 4 matrix
		if(arrayNums*firstArrayLength!=r*c )
			return nums;
			else
			{
				//New reshaped array
				int [][] reshapedArray= new int [r][c];
				for (int i=0;i<r*c;i++)
				{
                    /*
                     * 
                     *  1st iteration
						new[0][0]=nums[0][0];
						
						2nd iteration
						new[1/4][1%4]=nums[1/2,1%2]
						new[0][1]    =nums[0][0]
						
						3rd iteration
						new[2/4][2%4]=nums[2/2,2%2]
						new[0][2] = nums[1,0]
						
						4th iteration
						[3/4][2%4]=nums[3/2,3%2]
						new[0][3] =nums[1,1]
                     */
					reshapedArray[i/c][i%c]=nums[i/firstArrayLength][i%firstArrayLength];
				}
		      return reshapedArray;
			}
				
		
	}

}


