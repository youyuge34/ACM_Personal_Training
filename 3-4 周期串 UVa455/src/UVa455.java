import java.util.Scanner;

public class UVa455 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] c = s.toCharArray();
		int k, m, n;
		int l = s.length();
		for (k = 1; k <= l; k++) {
			Boolean f = true;
			if (l % k == 0) {
				for (m = 0; m < k; m++) {
					for (n = 0; n < l / k - 1; n++) {
						if (c[n * k + m] != c[n * k + k + m]) {
							f = false;
						}
					}
				}
			} else
				continue;
			if (f) {
				for (int i = 0; i < k; i++) {
					System.out.print(c[i]);
				}
				break;
			}
		}
	}
}
