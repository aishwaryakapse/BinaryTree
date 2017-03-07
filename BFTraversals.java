import java.util.Queue;
import java.util.LinkedList;
public class BFTraversals {
	Node root;
	public BFTraversals() {
		root = null;
	}
	
	public BFTraversals(int key) {
		root = new Node(key);
	}
	
	//Method 1: Using a function that will print a given level
	public void printLevelOrder() {
		int h = height(root);
		for(int i = 1; i<=h; i++) {
			printGivenLevel(root, i);
			System.out.println();
		}
	}
	public int height(Node root) {
		if(root == null) {
			return 0;
		}else {
			//calculate height of each sub-tree
			int lheight = height(root.left);
			int rheight = height(root.right);
			//Return the maximum height
			if(lheight > rheight) {
				return (lheight + 1);
			}else{
				return (rheight + 1);
			}
		}
	}
	public void printGivenLevel(Node root, int level) {
		if(root == null) {
			return;
		}
		
		if(level == 1) {
			System.out.print(root.key + " ");
		}else if(level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	//Method 2: For each node, first the node is visited and then its child nodes are added to the FIFO queue
	
	public void printLevelOrder2() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			//poll() removes the present head... just like dequeue
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");
			
			//Enqueue left child
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			//Enqueue right child
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}	
	}
	
	//Driver
	public static void main(String[] args) {
		BFTraversals tree = new BFTraversals(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Print Level Order 1 : ");
		tree.printLevelOrder();
		System.out.println();
		System.out.println("Print Level Order 2 : ");
		tree.printLevelOrder2();
	}
}
