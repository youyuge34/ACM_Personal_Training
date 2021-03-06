import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static int NUM = 10000001;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int tree[]  = new int[NUM+1];
			int sum[] = new int[NUM+1];
			for(int i =0;i<=NUM;i++){
				tree[i]=-1;
				sum[i]=1;
			}
//			ArrayList<Integer> list = new ArrayList<Integer>();
//			PriorityQueue<Integer> list = new PriorityQueue<Integer>();
			int max = 1;
			for (int i = 1; i <= n; i++) {
				int a = findRoot( tree,in.nextInt());
				int b = findRoot(tree, in.nextInt());
				
				if(a!=b){
					tree[a] = b;
					sum[b]+=sum[a];
					max = Math.max(max, sum[b]);
//					list.add(sum[b]);
				}
			}
			
//			int max = 1;
//			for(int i = 0;i<sum.length;i++){
//				if(tree[i]==-1&&sum[i]>max){
//					max = sum[i];
//				}
//			}
//			Collections.sort(list);
			System.out.println(max);
		}
	}

	private static int findRoot(int tree[],int nextInt) {
		int origin = nextInt;
		while(tree[nextInt]!=-1){
			nextInt = tree[nextInt];
		}
		while(tree[origin]!=-1){
			int temp = origin;
			origin = tree[origin];
			tree[temp]=nextInt;
		}
		
		return nextInt;
	}

}
