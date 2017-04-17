//Class for creating Node
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
}

//Create binary search tree
public class BinarySearchTree{
	//root node
	public static Node root;
	//constructor which assigns root to null
	public BinarySearchTree(){
		this.root=null;
	}
	/*
	 * 1. We need to start from the root and compare the data with n
	 * 2. If root.data is greater than n then we need to go to left
	 * 3. If root.data is lesser than n then we need to go to right
	 * 4. If root.data is equal to n then we were able to find the data else return false
	 */
	//function to find node in a tree
	public boolean find(int id){
	//set the current node to the root
	Node current=root;
	//Traverse the root till we find n
		 while (current!=null)
	 {
		 //if data is the search element then return true
		 if(current.data==id){
			 return true;
		 }
		 //If the current data of the node is greater than the search element the traverse to the left
		 else if (current.data>id)
		 {
			 current=current.left;
		 }
		 else
		 {
			 current=current.right;
		 }
		 
	 }
	 return false;
	}
	/**
	 * We need to set current = root
	 * Compare root.data. If root.data is greater than n we need to traverse to the left
	 * If root.data is lesser than n then we traverse to the right
	 * If current is null.Then we have reached the root node. We need to insert the node with the help of the parent node
	 * @param id
	 */
	//function to insert into a tree
	public void insert(int id)
	{
		//Create a new instance of a node
		 Node newNode= new Node(id);
		
	     // Binary tree is empty
		 if(root==null)
		 {
			 root=newNode;
			 return;
		 }
		 //Set current node are root
		 Node current =root;
		 Node parent =null;
		 
		 //While loop till we find the leaf node and insert the new node
		 while(true)
		 {
			 //set parent to current
			 parent=current;
			 //Check if the current is greater than the id
			 if(id >current.data)
			 {
				 current=current.left;
				 //This would be the leaf node
				 if(current==null)
				 {
					 parent.left=newNode;
				    return;
				 }
			 }
				 else
				 {
					 current=current.right;
					 if(current==null)
					 {
						 parent.right=newNode;
						 return;
					 }
				 }
			 }
		
		 }
	/**
	 * Recursion function to display content from the Binary Search tree.
	 * @param arg
	 */
 public void display(Node root){
	 //Check if the tree is empty
	 if(root!=null)
	 {
		 display(root.left);
		 System.out.print(" " +root.data);
		 display(root.right);
	 }
	 
 }

//Main function
public static void main(String arg[]){
	
	BinarySearchTree b=new BinarySearchTree();
	System.out.println("Insert");
	b.insert(10); b.insert(2);  b.insert(7);b.insert(18);
	b.display(root);
    }
}