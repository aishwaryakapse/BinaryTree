
public class SameTree {
	Node root1, root2;
	boolean sameTree(Node a, Node b) {
		if(a == null && b == null) {
			return true;
		}
		if(a != null && b != null){
			return(a.key == b.key &&
				sameTree(a.left, b.left) &&
				sameTree(a.right, b.right));
		}
		return false;
	}
	
	public static void main(String[] args) {
		SameTree tree = new SameTree();
		tree.root1 = new Node(1);
		tree.root1.left = new Node(2);
		tree.root1.right = new Node(3);
		tree.root1.left.left = new Node(4);
		tree.root1.left.right = new Node(5);
		
		
		tree.root2 = new Node(1);
		tree.root2.left = new Node(2);
		tree.root2.right = new Node(3);
		tree.root2.left.left = new Node(7);
		tree.root2.left.right = new Node(5);
		
		System.out.println("The trees are identical? : "+tree.sameTree(tree.root1, tree.root2));
	}

}
