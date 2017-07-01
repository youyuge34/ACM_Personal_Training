import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int a = cin.nextInt();
//			int[] b = new int[a];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < a; i++) {
				list.add(cin.nextInt());
			}

//			Arrays.sort(b);
			Collections.sort(list);
			System.out.println(list.get(a-1));
			if (a == 1)
				System.out.println("-1");
			else {
				for (int i = 0; i < a - 2; i++) {
					System.out.print(list.get(i) + " ");
				}
				System.out.println(list.get(a-2));
			}
		}
		cin.close();
	}

}
