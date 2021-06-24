/*
*A binary Tree class 
*/
import java.util.*;
public class BinaryTree
{
	Node root;
	private Node addRecursive(Node current, int value) 
	{
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	 }
	 //a public method to add a number into a BST
	 public void add(int value) 
	 {
	 	Random randomNumber = new Random();
	 	//a for loop to generate 10 random numbers
	 	for(int i=0;i < 10;i++)
	 	{
	 		value = randomNumber.nextInt(100);
	 		root = addRecursive(root, value);
	 	}
      
    }
    //A method to check if the tree contains a specific value
    private boolean containsNodeRecursive(Node current, int value)
     {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	//a public method that takes a values and begins at the root
	public boolean containsNode(int value)
	 {
    	return containsNodeRecursive(root, value);
	}
}