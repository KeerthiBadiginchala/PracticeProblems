public class BinarySearchTree {
	public int findDistance(Node root, int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcaData = getAncestor(root, n1, n2).data;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
	}

	public int Pathlength(Node root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {
				// System.out.println(root.data);
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	public Node getAncestor(Node root, int n1, int n2) {
		if (root != null) {
			if (root.data == n1 || root.data == n2) {
				return root;
			}
			Node left = getAncestor(root.left, n1, n2);
			Node right = getAncestor(root.right, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}

	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node( 5 );
		int[] nums = {5, 6, 3, 1, 2, 4};
		for(int i=1; i<nums.length; i++) {
		root.addNode( nums[i] );
		}
		BinarySearchTree i = new BinarySearchTree();
		System.out.println("Distance between 2 and 4 is : "
				+ i.findDistance(root, 2, 4));
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void addNode(int num) {
		if (num < this.data) {
		if (this.left != null) {
		this.left.addNode(num);
		} else {
		this.left = new Node(num);
		}

		} else {
		if (this.right != null) {
		this.right.addNode(num);
		} else {
		this.right = new Node(num);
		}

		}
		}
	
}