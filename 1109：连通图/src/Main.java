import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0){
				break;
			}
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
			boolean t = false;
			for(int i = 1;i<=n;i++){
				if(tree[i]==-1){
					count++;
				}
				if(count==2){
					t = true;
					break;
				}
			}
			if(t){
				System.out.println("NO");
			}else System.out.println("YES");
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
