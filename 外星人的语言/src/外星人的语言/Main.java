package 外星人的语言;

import java.util.Scanner;

public class Main {
	public static void p(int i, int r) {
		if (i / r == 0) {
			if (i % r <= 9) {
				System.out.print(i % r);
			} else {
				char c = ' ';
				switch (i % r) {
				case 10:
					c = 'A';
					break;
				case 11:
					c = 'B';
					break;
				case 12:
					c = 'C';
					break;
				case 13:
					c = 'D';
					break;
				case 14:
					c = 'E';
					break;
				case 15:
					c = 'F';
					break;
				}
				System.out.print(c);
			}
		} else {
			p(i / r, r);
			if (i % r <= 9) {
				System.out.print(i % r);
			} else {
				char c = ' ';
				switch (i % r) {
				case 10:
					c = 'A';
					break;
				case 11:
					c = 'B';
					break;
				case 12:
					c = 'C';
					break;
				case 13:
					c = 'D';
					break;
				case 14:
					c = 'E';
					break;
				case 15:
					c = 'F';
					break;
				}
				System.out.print(c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int r = in.nextInt();
			p(n, r);
			System.out.println();

		}

	}

}
