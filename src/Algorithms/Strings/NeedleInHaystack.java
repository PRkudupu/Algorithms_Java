package Algorithms.Strings;
/**
 * We need to identify the needle in a haystack.
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
 * @author Prathap Kudupu
 *
 */
public class NeedleInHaystack {
	public static int get(String haystack, String needle)
	{
		for(int i=0;;i++){
			for(int j=0;;j++){
				//If length of the needle and j is equal then we know that there is a needle
				if(j==needle.length()) return i;
				if(i+j==haystack.length()) return -1;
				//If this condition is not satisfied j is not incremented
				if(needle.charAt(j)!=haystack.charAt(i+j))
					{break;}
	        }
		}
	}
}
