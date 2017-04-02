
public class Home {
	public static void main(String args[]){
	
	
	
	//Example for immutable
    //Call to static function for immutable example
	//System.out.println(Immutable.Validate());
		
	/*
	//Call to a static function to reverse a phrase
	System.out.println(ArrayFunctions.ReversePhrase("My Name is Prathap"));
	
	//Call to static string builder
	System.out.println(ArrayFunctions.ReversePhraseSB("My Name is Prathap using SB"));
	
	//String to validate if it is chinese character or japaneese character
	System.out.println(ArrayFunctions.ReversePhraseChinJap("ABCabc"));
	*/
		Node first = new Node();
		
		
		/***
		 * firstNode
		 * 3 | null +
		 */
		first.setValue(3);
		
		/***
		 * Middle Node
		 * 3 | null + 5 | null 
		 */
		Node middle = new Node();
		middle.setValue(5);
		
		/***
		 * Link first and middle Node
		 * 3 | null --> 5 | null 
		 */
		first.setNext(middle);
		
		/***
		 * Last Node
		 * 3 | null --> 5 | null 10 |null 
		 */
		Node last = new Node();
		last.setValue(7);
		
		/***
		 * Link middle and last Node
		 * 3 | null --> 5 | null --> 10 |null 
		 */
		middle.setNext(last);
	//Iterate through the node
		PrintList(first);
	
	}
	/*
	 * Static function to iterate through the node
	 */
	private static void PrintList(Node node){
		
		while(node!=null){
			System.out.println(node.getValue());
			node=node.getNext();
		}
	}
	
}
