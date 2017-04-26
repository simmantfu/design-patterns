package algo;




public class SubStringCount {

	public static void main(String ar[]) {

		String givenString = "simmant";
		char[] charArray = givenString.toCharArray();
		String[] stringArray = new String[100];

		String token = "";
		for (int i = 0; i <= charArray.length - 1; i++) {
			char t = charArray[i];
			// System.out.println(t);
			for (int j = i; j <= charArray.length - 1; j++) {
				token = token + charArray[j];
				checkFirstLast(token);
			}
			token = "";
		}

	}

	
	
	public static void checkFirstLast(String str){
		
		char[] indexs = str.toCharArray();
		
			if(indexs.length == 1||(indexs[0] == indexs[indexs.length-1])){
				System.out.println(str);
			}
		
		
	}
	
	
}
