import java.util.Arrays;
import java.util.Scanner;

/**
 * http://poj.org/problem?id=1700
 * @author yousheng
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t--!=0){
			int n = in.nextInt();
			int[] list = new int[n];
			for (int i = 0; i < list.length; i++) {
				list[i] = in.nextInt();
			}
			Arrays.sort(list);
			int count = 0;
			int i = 0;
			int temp = 0;
			for ( i = n; i >=4; i-=2) {
				temp = i;
				int ans1 = list[0] + 2*list[1] + list[i-1];
				int ans2 = 2*list[0] + list[i-2] + list[i-1];
				count+= Math.min(ans1, ans2);
			}
			//temp-=2;
			//可能没进for循环导致temp没有值
			//System.out.println("temp   "+temp+"   i   "+i);
			if(i==3){
				count+=list[0]+list[2]+list[1];
			}else if(i==2){
				count+=list[1];
			}else if(i==1){
				count+=list[0];
			}
			System.out.println(count);
		}
	}

}
