
public class Immutable {
	public static String Validate()
	{
		String s="Prathap";
		s.concat("Kudupu"); // Method appends the string at the end 
		System.out.println(s);
		//Assign it to a reference type then it would have both
		String sref="Prathap";
		sref=sref.concat(" Kudupu"); 
		return sref;
	}

	
}
