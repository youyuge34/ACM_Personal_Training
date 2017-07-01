import java.util.Scanner;

public class Main {
	public  long getAns(long n,long m){
		int k =2;
		long ans = 1;
		while(2*n+1<=m){
			ans+=k;
			k*=2;
			n=2*n+1;
		}
		if(k-(2*n+1-m)>0){
			ans+=k-(2*n+1-m);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long n = in.nextLong();
			long m = in.nextLong();
			if(m==0&n==0){
				break;
			}
			
			System.out.println(new Main().getAns(n, m));
		}
	}

}
