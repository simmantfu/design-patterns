package algo;

public class Main {
	static int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] data = {20,8,22,4,12,10,14,3,2};
		
		BinarySearchTree binarySearchTree = new BinarySearchTree(20);
		
	    for(int a:data){
	    	
	    binarySearchTree.addElement(a);
	   
	    }
//	    binarySearchTree.printDLR();
//	    
//	    binarySearchTree.searchElement(4);
	   
	    binarySearchTree.searchSmallest(7);
	 
	}

}
