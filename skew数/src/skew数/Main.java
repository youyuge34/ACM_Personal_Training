package skew数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.nextLine();
			char[] c = s.toCharArray();
			int n = s.length();
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (c[i] - '0') * (Math.pow(2, (n - i)) - 1);

			}

			System.out.println(sum);
		}

	}

}
