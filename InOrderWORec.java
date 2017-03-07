import java.util.Stack;
public class InOrderWORec {
	Node root;
	public InOrderWORec() {
		root = null;
	}
	public InOrderWORec(int key) {
		root = new Node(key);
	}
	
	public void inOrder() {
		if(root == null) {
			return;
		}
		
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		
		//First node to be visited is the left most one
		while(node != null) {
			stack.push(node);
			node = node.left;
		}
		
		//Traverse tree
		while(stack.size() > 0) {
			//visit the top node
			node = stack.pop();
			System.out.print(node.key + " ");
			if(node.right != null) {
				node = node.right;
				while(node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}
	public static void main(String[] args) {
		InOrderWORec tree = new InOrderWORec(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		
		System.out.println("InOrder Traversal without using recrsion ( Using Stack) : ");
		tree.inOrder();
	}

}
