public class DFTraversals {
	Node root;
	public DFTraversals() {
		root = null;
	}
	public DFTraversals(int key) {
		root = new Node(key);
	}
	
	public void printPostOrder(Node node) {
		if(node == null) {
			return;
		}
		
		//first recurse on left sub-tree
		printPostOrder(node.left);
		
		//Then recurse on right sub-tree
		printPostOrder(node.right);
		
		//now deal with the node
		System.out.print(node.key + " ");
	}
	
	public void printInOrder(Node node) {
		if(node == null) {
			return;
		}
		
		//first recur on left child
		printInOrder(node.left);
		
		//then print node
		System.out.print(node.key + " ");
		
		//then recur on right child
		printInOrder(node.right);
	}
	
	public void printPreOrder(Node node) {
		if(node == null) {
			return;
		}
		
		//First print the node
		System.out.print(node.key + " ");
		
		//now recur on left child
		printPreOrder(node.left);
		
		//then recur on right child
		printPreOrder(node.right);
	}
	
	//Wrappers over above recursive functions
	
	public void printPostOrder() {
		printPostOrder(root);
	}
	
	public void printInOrder() {
		printInOrder(root);
	}
	
	public void printPreOrder() {
		printPreOrder(root);
	}
	//Driver Method
	public static void main(String[] args) {
		DFTraversals tree = new DFTraversals(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("PreOrder Traversal of tree is : ");
		tree.printPreOrder();
		System.out.println();
		System.out.println("InOrder Traversal of tree is : ");
		tree.printInOrder();
		System.out.println();
		System.out.println("PostOrder Traversal of Tree is : ");
		tree.printPostOrder();
	}
}

