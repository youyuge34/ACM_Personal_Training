package 数素数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int m=in.nextInt()-1;
		int n=in.nextInt()-1;
		int count=0;
		long c[]=new long[1000000];
		for(int i=2;i<=1000000;i++){
			Boolean f=true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					f=false;break;
				}
			}
				if(f){
					c[count++]=i;
					}
				}
		
		int c1=0;
		for(int i=m;i<n;i++){
			c1++;
			if(c1%10==0){
				System.out.print(c[i]+"\n");
			}else System.out.print(c[i]+" ");
		}System.out.print(c[n]);
	}

}
