import java.util.Scanner;

public class UVa227 {
	public static void main(String[] args) {
		char[][] c = new char[][] { { 'T', 'R', 'G', 'S', 'J' }, { 'X', 'D', 'O', 'K', 'I' },
				{ 'M', ' ', 'V', 'L', 'N' }, { 'W', 'P', 'A', 'B', 'E' }, { 'U', 'Q', 'H', 'C', 'F' }, };
		int m = 2;
		int n = 1;
		Boolean f = true;
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] c1 = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			switch (c1[i]) {
			case 'A':
				if (m - 1 >= 0) {
					c[m][n] = c[--m][n];
					c[m][n] = ' ';
				} else {
					f = false;
				}
				break;

			case 'B':
				if (m + 1 <= 4) {
					c[m][n] = c[++m][n];
					c[m][n] = ' ';
				} else {
					f = false;
				}
				break;

			case 'L':
				if (n - 1 >= 0) {
					c[m][n] = c[m][--n];
					c[m][n] = ' ';
				} else {
					f = false;
				}
				break;

			case 'R':
				if (n + 1 <= 4) {
					c[m][n] = c[m][++n];
					c[m][n] = ' ';
				} else {
					f = false;
				}
				break;
			}
		}
		if (f) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
		} else
			System.out.println("This puzzle has no final configuration.");
	}
}
