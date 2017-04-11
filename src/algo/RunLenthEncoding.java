package algo;
import java.util.HashMap;

public class RunLenthEncoding {

	public static void main(String ar[]) {

		String str = "hmm";
		StringBuilder builder = new StringBuilder();
		char[] char1 = str.toCharArray();

		char x = char1[0];

		int y = 0;

		for (int i = 0; i <= char1.length - 1; i++) {

			if (x == char1[i]) {
				y++;
			} else {
				builder.append(char1[i - 1] + "" + y);
				y = 0;
				y++;
				x = char1[i];
			}
			if (i == char1.length - 1)
				builder.append(char1[i] + "" + y);

		}

		System.out.println(builder.toString());

	}

}
