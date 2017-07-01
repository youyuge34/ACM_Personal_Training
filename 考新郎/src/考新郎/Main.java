package 考新郎;

import java.util.Scanner;

public class Main {
	public static long mul(int n){
		long sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long c[]=new long[22];
		c[2]=1;
		c[3]=2;
		for(int i=4;i<c.length;i++){
			c[i]=(i-1)*(c[i-1]+c[i-2]);
		}
		while(in.hasNext()){
			int n=in.nextInt();
			int m=in.nextInt();
			System.out.println(mul(n)/mul(n-m)/mul(m)*c[m]);
			
		}
		
	}

}
