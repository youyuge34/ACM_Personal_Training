import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		while(x--!=0){
			int n = in.nextInt();
			int tree[] = new int[n+1];
			for(int i=0;i<tree.length;i++){
				tree[i]=-1;
			}
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				int a = findRoot(tree,in.nextInt());
				int b = findRoot(tree,in.nextInt());
				if(a !=b ){
					tree[a] = b;
				}
			}
			
			int count = 0;
			for (int i = 1; i < tree.length; i++) {
				if(tree[i] == -1){
					count++;
				}
			}
			System.out.println(count);
			
		}
	}

	private static int findRoot(int[] tree, int next) {
		int origin = next;
		while(tree[next]!=-1){
			next = tree[next];
		}
		while(tree[origin]!=-1){
			int temp = origin;
			origin = tree[origin];
			tree[temp] = next;
		}
		
		return next;
	}

}
