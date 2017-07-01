import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bf.readLine()) != null) {
			int n = Integer.parseInt(line);
			String[] s = bf.readLine().split("\\s+");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < s.length; i++) {
				list.add(Integer.parseInt(s[i]));
			}

			Collections.sort(list);
			System.out.println(list.get(n-1));
//			list.remove(n-1);
//			System.out.println("size.....>"+list.size());
			if (n==1) {
				System.out.println("-1");
			} else {
				for (int i = 0; i < n-1 ; i++) {
					System.out.print(i==0?list.get(i):" "+list.get(i));
				}
				System.out.println();
			}
		}
		bf.close();
	}

}
