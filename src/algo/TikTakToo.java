package algo;

import java.util.Objects;
import java.util.Scanner;

public class TikTakToo {

	static int[][] tick = new int[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TikTakToo().init();
		while (true) {

			int a, b, c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the location to for value : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("enter the value : ");
			c = sc.nextInt();
			if (tick[a][b] == 3) {
				tick[a][b] = c;
			} else {
				System.out.println("tick[" + a + "][" + b + "] already accupied");
			}
			new TikTakToo().possibleEmatyPath(a, b);
			if (new TikTakToo().checkForWinner()) {
				break;
			}

		}
	}

	public void init() {
		int count = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				tick[i][j] = 3;

			}
		}

	}

	public void possibleEmatyPath(int a, int b) {

		if ((a <= 2 && b <= 2) && (a >= 0 && b >= 0)) {
			int i =0, j=0;
			if (a < 2) {
				i = a + 1;
			} else {
				j = a -1;
			}

			if (b < 2) {
				j = b + 1;
			} else {
				i = b-1;
			}

			if (tick[i][j] == 3) {
				tick[i][j] = 2;
			} else {
				System.out.println("tick[" + i + "][" + j + "] already accupied");
			}
		}
	}

	public boolean checkForWinner() {

		for (int i = 0; i < 3; i++) {
			if (tick[i][0] != 3 && tick[0][i] != 3) {
				if ((tick[i][0] == tick[i][1]) && (tick[i][0] == tick[i][2])) {
					return true;
				}
				if ((tick[0][i] == tick[1][i]) && (tick[0][i] == tick[2][i])) {
					return true;
				}
			}
		}
		return false;
	}
}
