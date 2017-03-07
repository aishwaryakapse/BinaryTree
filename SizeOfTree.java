
public class SizeOfTree {
	Node root;
	public SizeOfTree(int k) {
		root = new Node(k);
	}
	
	int size() {
		return size(root);
	}
	
	int size(Node node) {
		if(node == null) {
			return 0;
		}else{
			return (size(node.left) + 1 + size(node.right));
		}
	}

	public static void main(String[] args) {
		SizeOfTree tree = new SizeOfTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Size of the Tree is : "+tree.size());
	}

}
