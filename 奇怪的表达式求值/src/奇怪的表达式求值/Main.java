package 奇怪的表达式求值;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long k=in.nextLong();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int zan=0;
		for(int i=0;i<k;i++){
			zan=a[0];
			for(int j=0;j<n-1;j++){
				 
				a[j]=(a[j]+a[j+1])%100;
			}
			a[n-1]=(a[n-1]+zan)%100;
			for(int m=0;m<n;m++){
				System.out.print(i==0?a[m]:" "+a[m]);
				
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			System.out.print(i==0?a[i]:" "+a[i]);
		}
	}

}
