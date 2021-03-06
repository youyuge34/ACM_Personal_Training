import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int n= in.nextInt();
//			int[] list = new int[n];
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] d1 = new int[n];
			int[] d2 = new int[n];
			for (int i = 0; i < n; i++) {
				list.add(in.nextInt());
			}
			for (int i = 0; i < list.size(); i++) {
				int max = 1;
				for (int j = 0; j < i; j++) {
					if(list.get(j)<list.get(i)){
						max = Math.max(max, d1[j]+1);
					}
				}
				d1[i] = max;
			}
			
			Collections.reverse(list);
			for (int i = 0; i < list.size(); i++) {
				int max = 1;
				for (int j = 0; j < i; j++) {
					if(list.get(j)<list.get(i)){
						max = Math.max(max, d2[j]+1);
					}
				}
				d2[i] = max;
			}
			
			int ans =0;
			for (int i = 0; i < n; i++) {
				if(d1[i]+d2[n-1-i]>ans){
					ans = d1[i]+d2[n-1-i];
				}
			}
			System.out.println(n+1-ans);
		}
	}

}
