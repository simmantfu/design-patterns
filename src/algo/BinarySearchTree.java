package algo;
import java.util.Objects;

public class BinarySearchTree {

	int root;
	static int leftDepthCount = 0;
	BinarySearchTree left;
	BinarySearchTree right;

	public BinarySearchTree(int a) {
		// TODO Auto-generated constructor stub
		this.root = a;
		this.left = null;
		this.right = null;
	}

	public void addElement(int b) {

		if (this.root > b) {

			if (Objects.nonNull(this.left)) {
				this.left.addElement(b);
			} else {
				this.left = new BinarySearchTree(b);
			}
		} else {
			if (Objects.nonNull(this.right)) {
				this.right.addElement(b);
			} else {
				this.right = new BinarySearchTree(b);
			}
		}

	}

	public void printDLR() {
		if (Objects.nonNull(this.left))
			this.left.printDLR();
		System.out.println(this.root);
		if (Objects.nonNull(this.right))
			this.right.printDLR();
	}

	public void searchElement(int element) {

		if (this.root > element) {
			if (this.left.root == element) {
				System.out.println("data founded in left");
			} else {
				this.left.searchElement(element);
			}
		} else {
			if (this.right.root == element) {
				System.out.println("data founded in right");
			} else {
				this.right.searchElement(element);
			}
		}
	}

	public void searchSmallest(int intitlaValue, int count) {
		if(Objects.nonNull(this.left)){
			this.left.searchSmallest(intitlaValue++, count);
			if(intitlaValue == count){
				System.out.println(this.left.root);
			}
		}	
		
	
	}
}
