
public class Node {
	private int value;
	private Node next;
		
	public void setNext(Node newValue){
		next=newValue;
	}
	public void setValue(int newValue){
		value=newValue;
	}
	public Node getNext(){
		return next;
	}
	public int getValue(){
		return value;
	}
	

}

