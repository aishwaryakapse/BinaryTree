
public class InOrderWORS {
	Node root;
	
	public InOrderWORS() {
		root = null;
	}
	public InOrderWORS(int key) {
		root = new Node(key);
	}
	
	public void morrisTraversal(Node root) {
		Node current, prev;
		if(root == null) {
			return;
		}
		current = root;
		while(current != null) {
			if(current.left == null){
				System.out.print(current.key + " ");
				current = current.right;
			}else{
				//Find the inorder predecessor of current
				prev = current.left;
				while(prev.right != null && prev.right != current) {
					prev = prev.right;
				}
				
				if(prev.right == null) {
					prev.right = current;
					current = current.left;
				}else{
					prev.right = null;
					System.out.print(current.key + " ");
					current = current.right;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		InOrderWORS tree = new InOrderWORS(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("InOrder Traversal without recursion and Stack (Using Morris Traversal Algorithm : ");
		tree.morrisTraversal(tree.root);
	}

}
