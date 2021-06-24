public class Node
{
	//declartation of instance variables
	int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    //get methods
    public int getValue()
    {
    	return value;
    }
    public Node getLeft()
    {
    	return left;
    }
    public Node getRight()
    {
    	return right;
    }
}