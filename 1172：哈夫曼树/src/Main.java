import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0){
				break;
			}
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
			for (int i = 0; i < n; i++) {
				queue.offer(in.nextInt());
			}
			int ans = 0;
			for(int i=0;i<n-1;i++){
				int a = queue.poll();
				int b = queue.poll();
				queue.offer(a+b);
				ans+=(a+b);
			}
			System.out.println(ans);
		}
	}

}
