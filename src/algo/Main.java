package algo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
	static int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sort = "Hungary 20 8 PuertoRico 28 1 car/ 12 4 Syria 20 3 Oman 19 3 car. 3 6 car/ 20 6 PuertoRico 31 pan1 car0 31 6 Oman 19 8 car- 19 6 Uzbekistan 7 4 Luxembourg 5 3 car- 20 4 Italy 14 4 Syria 31 4 Norway 31 8 Hungary 5 pan- WesternSahara 15 7 Luxembourg 4 1";
		

		
		
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

static String preparemap(String key) {

		
		
		map.put("/:.@ ", 1);
		map.put("ABC", 2);
		map.put("DEF", 3);
		map.put("GHI", 4);
		map.put("JKL", 5);
		map.put("MNO", 6);
		map.put("PQRS", 7);
		map.put("TUV", 8);
		map.put("WXYZ", 9);

		Set<Map.Entry<String, Integer>> setChck =  map.entrySet(); 
		
		Iterator<Entry<String, Integer>> it = setChck.iterator();
		
		while(it.hasNext()){
			Entry<String, Integer> t = it.next();
			
			String keyString = t.getKey();
			
			if(keyString.contains(key)){
				
				char[] ar1= keyString.toCharArray();
				char[] ar2 = key.toCharArray();
				
				for(int i = 0;i<ar1.length;i++){
				if(ar1[i] == ar2[0]){
				return t.getValue()+","+i;
				}
				}
			}
		}
		
		return "pan"+key;
	}
	
}
