import java.util.Scanner;

public class Main {
	public static Boolean ss(int i) {
		Boolean f = true;
		for (int n = 2; n <= Math.sqrt(i * i + i+ 41); n++) {
			if ((i * i + i+ 41) % n == 0) {
				f = false;
			}
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		int n;
		do {
			m = in.nextInt();
			n = in.nextInt();
			if(m==0&&n==0){
				break;
			}
			Boolean b;
			int i;
			for (i = m; i <= n; i++) {
				if (!ss(i)) {
					System.out.println("Sorry");
					break;
				}
			}
			if (i > n) {
				System.out.println("OK");

			}
		} while (true);
	}

}
