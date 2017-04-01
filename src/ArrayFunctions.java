
public class ArrayFunctions {
	/*
	 * 
	 * Function to reverse a phrase 
	 */
	public static String ReversePhrase(String phrase)
	{
		String [] words =phrase.split(" ");
		
		String rev="";
		//loop
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i]+ " ";
		}
		
		return rev;
	}
	
	/*
	 * 
	 * Function to reverse a word 
	 */
	public static String ReverseWord(String word)
	{
		char [] chars =word.toCharArray();
		
		String rev="";
		//loop
		for(int i=chars.length-1;i>=0;i--)
		{
			rev=rev+chars[i]+ " ";
		}
		
		return rev;
	}
	/**
	 * Function to reverse a phrase using stringbuilder
	 * @param phrase
	 * @return
	 */
	public static String ReversePhraseSB(String phrase)
	{
		String [] words =phrase.split(" ");
		StringBuilder revB=new StringBuilder();
		
		
		String rev="";
		//loop
		for(int i=words.length-1;i>=0;i--)
		{
			revB.append(words[i]);
			revB.append(" ");
		}
		
		return revB.toString();
	}
	
	/*
	 * Function to reverse string containing japanese or chinese characters
	 */
	public static String ReversePhraseChinJap(String phrase)
	{
		char [] words =phrase.toCharArray();
		String revString="";
		
		//loop
		for(int i=words.length-1;i>=0;i--)
		{
			if(IsChinese(words[i]))
			{
				//Check last string in Japanese
				if(!revString.isEmpty())
				{
				char [] checkJapanese=revString.toCharArray();
				char lastChar=checkJapanese[checkJapanese.length-1];
				if (IsJapanese(lastChar))
				{
					revString=revString+" ";
				}
				}
				revString=revString+words[i];
				
			}
			else if(IsJapanese(words[i]))
			{
				//Check last string in chinese
				if(!revString.isEmpty())
				{
				char [] checkChinese=revString.toCharArray();
				char lastChar=checkChinese[checkChinese.length-1];
				if (IsChinese(lastChar))
				{
					revString=revString+" ";
				}
				}
				revString=revString+words[i];	
			}
		}
		
		//Reverse of all the characters
		String [] sent =revString.split(" ");
		
		String rev="";
		//loop to reverse individual char
		for(int i=0;i<=sent.length-1;i++)
		{
			rev=rev+ ReverseWord(sent[i]);
		}
		
		return rev.replace(" ","");		
				
	}
	/*
	 * Function to check if the given character is chinese
	 */
	public static Boolean IsChinese(char chinese)
	{
		String  chineseCharac ="abc";
		
		int exists=chineseCharac.indexOf(chinese);
		if(exists==-1)
		return false ;
		else
			return true;
	}
	/*
	 * Function to check if the given character is japaneese
	 */
	public static Boolean IsJapanese(char japanese)
	{
		
		String  chineseCharac ="ABC";
		int exists=chineseCharac.indexOf(japanese);
		if(exists==-1)
		return false ;
		else
			return true;
	}
	
}
;