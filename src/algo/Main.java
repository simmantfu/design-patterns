package algo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {100,300,4,5,6,7,2000,9,1,2,3};
		
		BinarySearchTree binarySearchTree = new BinarySearchTree(10);
		
	    for(int a:data){
	    	
	    binarySearchTree.addElement(a);
	   
	    }
	    binarySearchTree.printDLR();
	    
	    binarySearchTree.searchElement(4);
	    binarySearchTree.searchSmallest(0,1);
	    
	}

}
