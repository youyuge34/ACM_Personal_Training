import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int m = in.nextInt();
			int list[] = new int[n + 1];
			for (int i = 0; i < list.length; i++) {
				list[i] = -1;
			}
			for(int i = 0;i<m;i++){
				int a = findRoot(list,in.nextInt());
				int b = findRoot(list,in.nextInt());
				if(a!=b){
					list[a] = b;
				}
			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if(list[i]==-1){
					count++;
				}
			}
			System.out.println(count-1);
		}
	}

	private static int findRoot(int[] list,int nextInt) {
		// TODO Auto-generated method stub
		int before = nextInt;
		while(list[nextInt] != -1){
			nextInt = list[nextInt];
		}
		while(list[before] != -1){
			int t = before;
			before = list[before];
			list[t] = nextInt;
		}
		return nextInt;
	}

}
