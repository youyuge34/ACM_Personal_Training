package nojtest;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long a[]=new long[45];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++){
			a[i]=a[i-1]+a[i-2];
		}System.out.println(a[n]);
		in.close();
	}

}
