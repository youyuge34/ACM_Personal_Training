import java.util.Arrays;
import java.util.Scanner;

class tv implements Comparable<tv> {
	int start;
	int end;

	public tv(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(tv o) {
		// TODO Auto-generated method stub
		return end - o.end;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			tv[] list = new tv[n];
			for (int i = 0; i < list.length; i++) {
				list[i] = new tv(in.nextInt(), in.nextInt());
			}

			Arrays.sort(list);
			int s = 0;
			int count = 0;
			for (int i = 0; i < list.length; i++) {
				if (s <= list[i].start) {
					s = list[i].end;
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
