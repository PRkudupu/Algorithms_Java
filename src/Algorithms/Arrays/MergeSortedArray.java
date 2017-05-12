package Algorithms.Arrays;
/**
 * We need to merge sorted array. num1 and num2 to num1
 * We can assume num1 has enough space to hold num2
 * @author Prathap Kudupu
 *
 */
public class MergeSortedArray {
	
	public static int [] get(int [] A,int m, int [] B,int n)
	{
		int i=m-1, j=n-1, k=m+n-1;
	    while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
	    while (j>-1)         A[k--]=B[j--];
	    return A;
	}
	
	public static int [] merge(int A[], int m, int B[], int n) {
		 
        while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }
        }
 
        while(n > 0){
            A[m+n-1] = B[n-1];
            n--;
        }
        return A;
    }

}
