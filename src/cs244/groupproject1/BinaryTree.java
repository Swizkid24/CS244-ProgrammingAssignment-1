package cs244.groupproject1;
public abstract class BinaryTree {

	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	//Made by William 4/21
	public void insert(int key) {
		
		if(root == null) {
			root = new Node(key);
			return;
		}
		root = insert(key, root);
	}
	
	//Made by William 4/21
	protected abstract Node insert(int key, Node root);
	
	public boolean search(int key) {
		return search(key, root);
	}
	//Made by William 4/21
	private boolean search(int key, Node root) {
		if(root == null) {
			return false;
		}
		if(root.getKey() == key) {
			return true;
		}
		else if(root.getKey() < key) {
			return search(key, root.getLeft());
		}
		else {
			return search(key, root.getRight());
		}
	}
	
	//Made by William 4/21
	public void remove(int key) {
		root = remove(key, root);
	}
	protected abstract Node remove(int key, Node root);
	
	
	
	//Order/Traversal methods if needed
	
	//Made by William 4/21
	public int findMin(Node root) {
		if(root.getLeft() == null) {
			return root.getKey();
		}
		else {
			return findMin(root.getLeft());
		}
	}
	//Made by William 4/21
	public int findMax(Node root) {
		if(root.getRight() == null) {
			return root.getKey();
		}
		else {
			return findMax(root.getRight());
		}
	}


public int getNodeCount() {// getter method to count the total amount of nodes  // Benjamin 4/27

	
return nodeCount(root)	

}
private int nodeCount(Node node) { // recursive method to count the total amount of nodes // Benjamin 4/27
	if (node==null) {
	return 0;
	}
	else {
		
	return (countNodes(node.getLeft()) + countNodes(node.getRight()) +1 );	
	
	}
	 
 }
public void clearTree() {// Benjamin 4/27 // method to clear the entire tree when nessassary
	
 root =null;
	
}
}
