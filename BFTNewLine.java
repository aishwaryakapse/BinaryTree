import java.util.Queue;
import java.util.LinkedList;
public class BFTNewLine {
	Node root;
	public BFTNewLine() {
		root = null;
	}
	
	public BFTNewLine(int key) {
		root = new Node(key);
	}
	
	public void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(true) {
			int nodeCount = queue.size();
			if(nodeCount == 0) {
				break;
			}
			
			while(nodeCount > 0) {
				Node tempNode = queue.poll();
				System.out.print(tempNode.key + " ");
				if(tempNode.left != null) {
					queue.add(tempNode.left);
				}
				
				if(tempNode.right != null) {
					queue.add(tempNode.right);
				}
				nodeCount--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		BFTNewLine tree = new BFTNewLine(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Print Level Order Traversal on new Line : ");
		tree.printLevelOrder();

	}

}
