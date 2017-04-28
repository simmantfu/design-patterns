
public class SurPasser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 7, 5, 3, 0, 8, 1 };

		for (int i = 0; i <= a.length - 1; i++) {
			int count = 0;
			for (int j = i; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
					count = count + 1;
				}
			}
			System.out.print(count + " ");
		}

	}

}
