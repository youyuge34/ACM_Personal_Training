package 素数对猜想;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c[] = new int[1000000];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int j = 0;
		for (int i = 2; i <= n; i++) {
			Boolean f = true;
			for (int k = 2; k <= Math.sqrt(i); k++) {
				if (i % k == 0) {
					f = false;
					break;
				}
			}
			if (f) {
				c[j++] = i;
			}
		}
		int h = 0;
		for (int i = 0; i < j - 1; i++) {
			if (c[i + 1] - c[i] == 2) {
				h++;
			}
		}
		System.out.println(h);
		in.close();
	}

}
