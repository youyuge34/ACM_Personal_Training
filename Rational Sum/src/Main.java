import java.util.Scanner;

public class Main {
	static int gcd(int m, int n) {
		while (m % n != 0) {
			int a = n;
			n = m % a;
			m = a;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s[] = in.next().split("\\/");
		int a = Integer.valueOf(s[0]);
		int b = Integer.valueOf(s[1]);
		for (int i = 1; i < n; i++) {
			String c[] = in.next().split("\\/");
			int d = Integer.valueOf(c[0]);
			int e = Integer.valueOf(c[1]);
			a = a * e + b * d;
			b = b * e;
			int g = gcd(Math.abs(a), b);
			if (a < 0) {
				a = 0 - a;
				a /= g;
				b /= g;
				a = 0 - a;
			} else {
				a /= g;
				b /= g;
			}
		}
		if (a == 0) {
			System.out.println(0);
		} else if (a < 0) {
			a = 0 - a;
			if (a % b == 0) {
				System.out.print("-" + a / b);
			} else {
				System.out.print(a < b ? "-" : "-" + a / b + " ");
				a = a - b * (a / b);
				System.out.print(a / gcd(a, b) + "/" + b / gcd(a, b));
			}
		} else {
			if (a % b == 0) {
				System.out.print(a / b);
			} else {
				System.out.print(a < b ? "" : a / b + " ");
				a = a - b * (a / b);
				System.out.print(a / gcd(a, b) + "/" + b / gcd(a, b));
			}
		}

	}

}
