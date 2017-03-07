//First Simple Tree
public class BinaryTree {
	Node root;
	BinaryTree() {
		root = null;
	}
	BinaryTree(int key) {
		root = new Node(key);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	}
}

