import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] list = new int[n];
			for(int i=0;i<n;i++){
				list[i] = in.nextInt();
			}
			int[] d = new int[n];
			d[0] = 1;
			for(int i=1;i<n;i++){
				int max = 1;
				for(int j=0;j<i;j++){
					if(list[j]>=list[i]){
						max = Math.max(max, d[j]+1);
					}
				}
				d[i] = max;
			}
			int ans = 0;
			for(int i=0;i<d.length;i++){
				if(d[i]>ans){
					ans = d[i];
				}
			}
			System.out.println(ans);
		}
	}

}
