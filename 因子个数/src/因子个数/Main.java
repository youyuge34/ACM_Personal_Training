package 因子个数;

import java.util.Scanner;

public class Main {
	public static Boolean isprime(int n) {
		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int count = 0;
			int n = in.nextInt();
			if (isprime(n)) {
				System.out.println(1);
				continue;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (isprime(i)) {
					if (n % i == 0) {
						count++;
						while (n % i == 0) {
							n /= i;
						}
						if(n==1){
							System.out.println(count);
							break;
						}
						if(isprime(n)){
							count++;
							System.out.println(count);
							break;
						}
					}
				}
			}

		}

	}

}
